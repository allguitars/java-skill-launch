package com.cddrm.solid.openclosed.knowledge_dose_demo.good;

/**
 * Now the HospitalManagement class has a lot less responsibility.
 * It no longer needs to know the details of what a doctor does or what a nurse does.
 * If more types of employees are added, such as department managers or security guards, they
 * would all just do work as defined in their own class definitions and the specifics of their
 * behavior will be on one's business.
 *
 * This system now is open for extension and closed for modification.
 *
 * This also could have been done using an interface rather than making the Employee class abstract, for which
 * we could define an interface, say EmployWork and added the performDuties behavior and then have all our
 * employees implement that interface.
 *
 * Both approaches allow for abstractions. Clients now can use a consistent interface to tell employees to
 * perform their respective responsibilities without getting into the details.
 *
 * The refactoring we did to correct this design and get rid of all those "instanceof" occurrences happens to be
 * a widely used design pattern in the industry, called Strategy Design Pattern.
 *
 * Definition of Strategy Design Pattern:
 * - It enables an algorithm behavior to be selected at RUNTIME.
 * - It lets the algorithm vary independently, from the clients that use it.
 */

public class HospitalManagement {

    // Now we get rid of the if statements and just call the performDuties method of the
    // object passed in
    public void callUpon(AbstractEmployee employee) {
        employee.performDuties();
    }
}
