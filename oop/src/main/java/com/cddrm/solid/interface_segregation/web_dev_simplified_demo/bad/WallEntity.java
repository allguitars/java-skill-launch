package com.cddrm.solid.interface_segregation.web_dev_simplified_demo.bad;

/**
 * A wall cannot move and attack
 */
public class WallEntity extends Entity {

    // A wall does not attack
    public WallEntity(String name, double health) {
        super(name, 0, health);
    }

    @Override
    public void move() {
        throw new RuntimeException("A wall cannot move");
    }

    @Override
    public void attack(Entity targetEntity) {
        throw new RuntimeException("A wall cannot attack");
    }
}
