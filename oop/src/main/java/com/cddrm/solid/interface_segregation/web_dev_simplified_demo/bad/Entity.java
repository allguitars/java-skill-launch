package com.cddrm.solid.interface_segregation.web_dev_simplified_demo.bad;

/**
 * The Entity has all the functionalities and all these different properties, but
 * the WallEntity class does not use all of them -- it does not move and attack.
 * And, the TurretEntity does not use all of them as well -- it does not move and take damage.
 *
 * This is the problem with Interface Segregation:
 * We have a big interface/parent class that has a lot of properties and a lot of methods, but not
 * "everything" is able to use all of them.
 *
 * Solution:
 * We need to break apart our interface. We want to break this interface into individual
 * components for movement, attacking, and taking damage.
 * We want to break apart this big Entity class into much smaller components that we can add
 * to individual classes as we need.
 */

public class Entity {

    private String name;
    private double attackDamage;
    private double health;

    public Entity(String name, double attackDamage, double health) {
        this.name = name;
        this.attackDamage = attackDamage;
        this.health = health;
    }

    public void move() {
        System.out.println(this.name + " moved\n");
    };

    public void attack(Entity targetEntity) {
        System.out.println(this.name + " attacked " + targetEntity.getName() +
                " for " + this.attackDamage + " damage");

        targetEntity.takeDamage(this.attackDamage);
    }

    public void takeDamage(double amount) {
        this.health -= amount;
        System.out.println(this.name + " has " + this.health + " health remaining\n");
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }
}
