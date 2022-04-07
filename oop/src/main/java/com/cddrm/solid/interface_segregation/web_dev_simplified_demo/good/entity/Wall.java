package com.cddrm.solid.interface_segregation.web_dev_simplified_demo.good.entity;

import com.cddrm.solid.interface_segregation.web_dev_simplified_demo.good.behavior_component.HasHealth;

public class Wall extends Entity implements HasHealth {

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
