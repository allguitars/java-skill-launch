package com.cddrm.solid.interface_segregation.web_dev_simplified_demo.good.entity;

import com.cddrm.solid.interface_segregation.web_dev_simplified_demo.good.behavior_component.Attacker;
import com.cddrm.solid.interface_segregation.web_dev_simplified_demo.good.behavior_component.HasHealth;
import com.cddrm.solid.interface_segregation.web_dev_simplified_demo.good.behavior_component.Mover;

/**
 * We are adding the behavior components into the Character by implementing the interfaces
 */

public class Character extends Entity implements Mover, Attacker, HasHealth {

    private double attackDamage;
    private double health;

    public Character(String name, double attackDamage, double health) {
        super(name);
        this.attackDamage = attackDamage;
        this.health = health;
    }

    @Override
    public void attack(Entity targetEntity) {
        System.out.println(super.getName() + " attacked " + targetEntity.getName() +
                " for " + this.attackDamage + " damage");

        targetEntity.takeDamage(this.attackDamage);
    }

    @Override
    public void takeDamage(double amount) {
        this.health -= amount;
        System.out.println(super.getName() + " has " + this.health + " health remaining\n");
    }

    @Override
    public void move() {
        System.out.println(super.getName() + " moved\n");
    }
}
