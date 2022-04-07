package com.cddrm.solid.open_closed.knowledge_dose_demo.bad;

public class Doctor extends Employee {

    public Doctor(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Doctor in action...");
    }
}
