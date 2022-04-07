package com.cddrm.solid.open_closed.knowledge_dose_demo.bad;

/**
 * Open-Closed Principle:
 * Software module should be open for extensions and closed for modifications.
 */

/**
 * The hospital management would enter the emergency room and tell all kinds of employees to perform
 * their respective duties.
 */
public class EmergencyRoomProcessDemoApp {

    public static void main(String[] args) {

        HospitalManagement ERDirector = new HospitalManagement();

        Employee nurse = new Nurse(1, "Peggy", "Emergency", true);
        Employee doctor = new Doctor(2, "Susan", "Emergency", true);

        ERDirector.callUpon(nurse);
        ERDirector.callUpon(doctor);

    }
}
