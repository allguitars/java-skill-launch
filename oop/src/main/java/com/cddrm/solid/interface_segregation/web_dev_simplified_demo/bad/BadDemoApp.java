package com.cddrm.solid.interface_segregation.web_dev_simplified_demo.bad;

/**
 * Interface Segregation Principle:
 * - It's about segregating your interfaces and making them smaller.
 * - Whenever you have an interface, you need everything that implements that interface to use
 *   "every single portion of the interface", such that No properties or methods of that interface
 *   are ignored by the implementation class.
 */
public class BadDemoApp {

    public static void main(String[] args) {

        TurretEntity turret = new TurretEntity("Turret", 5);
        CharacterEntity character = new CharacterEntity("Character", 3, 100);
        WallEntity wall = new WallEntity("Wall", 200);

        turret.attack(character);
        character.move();
        character.attack(wall);

        wall.attack(character);
    }
}
