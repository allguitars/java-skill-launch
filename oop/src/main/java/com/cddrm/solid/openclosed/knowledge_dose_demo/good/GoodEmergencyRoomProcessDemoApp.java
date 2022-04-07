package com.cddrm.solid.openclosed.knowledge_dose_demo.good;

// https://youtu.be/BLcnGmsZ5EE by Knowledge Dose

/**
 * Open-Closed Principle:
 * Software module should be open for extensions and closed for modifications.
 */

/**
 * The hospital management would enter the emergency room and tell all kinds of employees to perform
 * their respective duties.
 */
public class GoodEmergencyRoomProcessDemoApp {

    public static void main(String[] args) {

        HospitalManagement ERDirector = new HospitalManagement();

        AbstractEmployee nurse = new Nurse(1, "Peggy", "Emergency", true);
        AbstractEmployee doctor = new Doctor(2, "Susan", "Emergency", true);

        ERDirector.callUpon(nurse);
        ERDirector.callUpon(doctor);
    }
}
