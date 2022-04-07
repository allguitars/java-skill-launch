package com.cddrm.solid.interface_segregation.web_dev_simplified_demo.good.entity;

/**
 * Now the Entity class is very small.
 */
abstract public class Entity {

    private String name;

    public Entity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public void takeDamage(double amount);
}
