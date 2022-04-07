package com.cddrm.solid.interface_segregation.web_dev_simplified_demo.bad;

/**
 * CharacterEntity has all the functionalities provided by Entity class, so
 * it does not have to override any methods
 */

public class CharacterEntity extends Entity {

    public CharacterEntity(String name, double attackDamage, double health) {
        super(name, attackDamage, health);
    }

}
