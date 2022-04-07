package com.cddrm.solid.interface_segregation.web_dev_simplified_demo.bad;

/**
 * A turret cannot move and take damage
 */
public class TurretEntity extends Entity {

    // A turret does not have any health
    public TurretEntity(String name, double attackDamage) {
        super(name, attackDamage, -1);
    }

    @Override
    public void move() {
        throw new RuntimeException("A turret cannot move");
    }

    @Override
    public void takeDamage(double amount) {
        throw new RuntimeException("A turret cannot take damage");
    }
}
