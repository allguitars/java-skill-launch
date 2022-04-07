package com.cddrm.solid.interface_segregation.web_dev_simplified_demo.good;

import com.cddrm.solid.interface_segregation.web_dev_simplified_demo.good.entity.Character;
import com.cddrm.solid.interface_segregation.web_dev_simplified_demo.good.entity.Turret;
import com.cddrm.solid.interface_segregation.web_dev_simplified_demo.good.entity.Wall;

/**
 * Interface Segregation Principle:
 * Each of objects of classes only ever implements the information that it can actually use.
 * It should implement anything else that it cannot use.
 */

public class GoodDemoApp {

    public static void main(String[] args) {

        Turret turret = new Turret("Turret", 5);
        Character character = new Character("Character", 3, 100);
        Wall wall = new Wall("Wall", 200);

        turret.attack(character);
        character.move();
        character.attack(wall);
        character.attack(turret);
    }
}
