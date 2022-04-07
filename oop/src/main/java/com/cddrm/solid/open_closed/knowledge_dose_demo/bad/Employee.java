package com.cddrm.solid.open_closed.knowledge_dose_demo.bad;

/**
 * There is no behavior defined for Employee, which is a big RED FLAG.
 * Currently, the behaviors are defined in the HospitalManagement class.
 */
public class Employee {

    private int id;
    private String name;
    private String department;
    private boolean working;

    public Employee(int id, String name, String department, boolean working) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

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
