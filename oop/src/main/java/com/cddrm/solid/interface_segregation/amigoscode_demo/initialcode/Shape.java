package com.cddrm.solid.interface_segregation.amigoscode_demo.initialcode;

// A cube actually has volume, and for the Cube class to have the ability to calculate volume,
// we add the abstract method to the interface Shape.
// This breaks the rule of Interface Segregation principle.

// Suddenly, all types of shapes have to implement the volume() method despite they
// do not have volume.

// According to the Interface Segregation principle, interfaces should not force classes
// to implement what they cannot do.

public interface Shape {

    double area();
    double volume();
}
