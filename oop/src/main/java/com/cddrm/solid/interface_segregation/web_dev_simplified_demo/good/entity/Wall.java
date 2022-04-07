package com.cddrm.solid.interface_segregation.web_dev_simplified_demo.good.entity;

/**
 * A Wall can only take damage, so we just need to implement the takeDamage() method that is
 * inherited from the Entity class.
 * It cannot move or attack, so we do not need to implement other interfaces.
 */
public class Wall extends Entity {

    private double health;

    public Wall(String name, double health) {
        super(name);
        this.health = health;
    }

    @Override
    public void takeDamage(double amount) {
        this.health -= amount * 0.2;  // Attack causes smaller damage to the Wall

        System.out.println(super.getName() + " has " + this.health + " health remaining\n");
    }
}
