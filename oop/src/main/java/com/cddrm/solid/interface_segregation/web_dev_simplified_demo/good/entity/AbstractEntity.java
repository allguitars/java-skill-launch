package com.cddrm.solid.interface_segregation.web_dev_simplified_demo.good.entity;

/**
 * Now the Entity class is very small.
 */
abstract public class AbstractEntity {

    private String name;

    public AbstractEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // The reason why this method signature is put here is that when passing in an object into
    // the attack() method of an object that can attack, we do not know which type of object (subclass) is
    // being passed in. And inside the attack() method, we are calling the tackDamage() method with the object
    // passed in. Therefore, we put this method here inside the abstract class so that every subclass has
    // this method to be called by the attacker.
    abstract public void takeDamage(double amount);
}
