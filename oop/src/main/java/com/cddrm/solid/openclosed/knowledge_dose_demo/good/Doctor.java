package com.cddrm.solid.openclosed.knowledge_dose_demo.good;

/**
 * Since this class inherits the abstract class, it must implement the abstract methods from the parent class
 */
public class Doctor extends AbstractEmployee {

    public Doctor(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Doctor in action...");
    }

    @Override
    public void performDuties() {
        prescribeMedicine();
        diagnosePatient();
    }

    private void prescribeMedicine() {
        System.out.println("Prescribing medicine");
    }

    private void diagnosePatient() {
        System.out.println("Diagnosing patient");
    }
}
