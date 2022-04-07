package com.cddrm.solid.open_closed.knowledge_dose_demo.bad;

/**
 * This class is to call upon the employees to perform their respective duties
 * This class represents an upper management in a hospital
 * Bad practice:
 * Make this class responsible for knowing all the different types of behaviors the employees at the hospital
 * are capable of conducting.
 *
 * Tips:
 * The first thing to always look for when improving design is the Object Responsibility.
 * Anytime you see conditional statements based around the "instanceof" keyword, you should think about
 * Object Responsibility and tucking that away some place else because these behaviors do not belong here.
 *
 * Example:
 * A new requirement came in to also support the work done by the hospital CEO, department director, or security guards,
 * this class quickly become messy with many more "instanceof" conditionals. This class already knows too much.
 *
 * Software module should be open for extensions and closed for modifications.
 * This class is a big violator of the Open-Closed principle because instead of being closed for modification, this class
 * would actually invite and need modification to support other employees working at the hospital.
 */

public class HospitalManagement {

    // This implementation shows how it violates the Single Responsibility Principle
    public void callUpon(Employee employee) {
        if (employee instanceof Nurse) {
            checkVitalSigns();
            drawBlood();
            cleanPatientArea();
        } else if (employee instanceof Doctor) {
            prescribeMedicine();
            diagnosePatient();
        }
    }

    /**
     * The following code shows bad practice.
     * Employee behavior should be carried out by the Employee object.
     */

    // Nurses
    private void checkVitalSigns() {
        System.out.println("Checking vitals");
    }

    private void drawBlood() {
        System.out.println("Drawing blood");
    }

    private void cleanPatientArea() {
        System.out.println("Cleaning patient area");
    }

    // Doctors
    private void prescribeMedicine() {
        System.out.println("Prescribing medicine");
    }

    private void diagnosePatient() {
        System.out.println("Diagnosing patient");
    }
}
