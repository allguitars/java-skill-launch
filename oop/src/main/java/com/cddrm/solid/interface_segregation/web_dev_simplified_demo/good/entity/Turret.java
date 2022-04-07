package com.cddrm.solid.interface_segregation.web_dev_simplified_demo.good.entity;

import com.cddrm.solid.interface_segregation.web_dev_simplified_demo.good.behavior_component.Attacker;

/**
 * A Turret can only attack, so it implements Attacker interface.
 * It cannot take damage or move, but takeDamage() method is inherited from the abstract class, so
 * we still need to override it inside Turret class.
 */
public class Turret extends Entity implements Attacker {

    private double attackDamage;

    public Turret(String name, double attackDamage) {
        super(name);
        this.attackDamage = attackDamage;
    }

    @Override
    public void attack(Entity targetEntity) {
        System.out.println(super.getName() + " attacked " + targetEntity.getName() +
                " for " + this.attackDamage + " damage");

        targetEntity.takeDamage(this.attackDamage);
    }

    @Override
    public void takeDamage(double amount) {
        // Turret cannot take any damage
        System.out.println("Turret is down");
    }
}
