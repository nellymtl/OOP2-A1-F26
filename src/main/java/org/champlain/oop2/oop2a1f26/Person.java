package org.champlain.oop2.oop2a1f26;

import java.time.LocalDate;

public class Person {
    private final String aName;
    private final LocalDate aDOB;
    private final String aEmailAddress;
    private boolean ParkingPass;


    public Person(String pName, LocalDate pDOB, String pEmailAddress) {
        if (pName == null || pName.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        if (pDOB == null || pDOB.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Date of birth must be in the past.");
        }
        if (pEmailAddress == null || !pEmailAddress.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) {
            throw new IllegalArgumentException("Invalid email address.");
        }

        this.aName = pName.trim();
        this.aDOB = pDOB;
        this.aEmailAddress = pEmailAddress.trim();
        this.ParkingPass = false;
    }
    public boolean isPurchasedParkingPass() {
        return ParkingPass;
    }
}
