package com.cddrm.solid.open_closed.knowledge_dose_demo.good;

/**
 * Make the Employee class abstract and create the abstract method, performDuties()
 */

abstract public class AbstractEmployee {

    private int id;
    private String name;
    private String department;
    private boolean working;

    public AbstractEmployee(int id, String name, String department, boolean working) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

    public abstract void performDuties();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", working=" + working +
                '}';
    }
}
