package com.cddrm.solid.interface_segregation.amigoscode_demo.fix;

// According to the Interface Segregation principle, interfaces should not force classes
// to implement what they cannot do.
// So, we create another interface dedicated for the three-dimensional shape, and this
// interface will have the volume() method which the Shape interface does not have.

public interface ThreeDimensionalShape {

    double volume();
}
