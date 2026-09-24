package org.champlain.oop2.oop2a1f26;

import java.time.LocalDate;

/**
 * Represents a person with a name, date of birth, email address,
 * and an optional parking pass.
 */

public class Person {
    /**
     * person full's name
     */
    private final String aName;
    /**
     * The person's date of birth.
     */
    private final LocalDate aDOB;
    /**
     * The person's email address.
     */
    private final String aEmailAddress;
    /**
     * Indicates whether the person has purchased a parking pass.
     * Can only change from false to true.
     */
    private boolean ParkingPass;

    /**
     * Constructs a new Person with validated input values.
     *
     * @param pName          the person's name; must not be null or empty
     * @param pDOB           the person's date of birth; must not be null or in the future
     * @param pEmailAddress  the person's email; must follow a valid email format
     *
     * @throws IllegalArgumentException if any input is invalid
     */
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
    /**
     *
     * @return the name of the person
     */
    public String getName() {
        return aName;
    }
    /**
     *
     * @return the email address of the person
     */

    public String getEmailAddress() {
        return aEmailAddress;
    }
    /**
     *
     * @return the date of birth of the person
     */

    public LocalDate getDOB() {
        return aDOB;
    }
    /**
     * @return a formatted string containing the person's details
     */
    @Override
    public String toString() {
        return aName + " " + aDOB + " " + aEmailAddress;

    }

    /**
     *
     * This method only allows changing the parking pass status
     * from false to true. If the person already has a parking pass,
     * the method does nothing.
     *
     */
    public boolean purchaseParkingPass() {
        if (!ParkingPass) {
            ParkingPass = true;

        }
        return false;
    }
    /**
     *
     * @return true if the parking pass is purchased, false otherwise
     */
    public boolean isPurchasedParkingPass() {
        return ParkingPass;
    }
}
