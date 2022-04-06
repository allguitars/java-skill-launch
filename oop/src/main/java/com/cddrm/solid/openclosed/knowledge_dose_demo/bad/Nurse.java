package com.cddrm.solid.openclosed.knowledge_dose_demo.bad;

public class Nurse extends Employee {

    public Nurse(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Nurse in action...");
    }
}
