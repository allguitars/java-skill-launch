package com.cddrm.solid.open_closed.knowledge_dose_demo.good;

/**
 * Since this class inherits the abstract class, it must implement the abstract methods from the parent class
 */
public class Nurse extends AbstractEmployee {

    public Nurse(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Nurse in action...");
    }

    @Override
    public void performDuties() {
        checkVitalSigns();
        drawBlood();
        cleanPatientArea();
    }

    private void checkVitalSigns() {
        System.out.println("Checking vitals");
    }

    private void drawBlood() {
        System.out.println("Drawing blood");
    }

    private void cleanPatientArea() {
        System.out.println("Cleaning patient area");
    }
}
