package com.cddrm.solid.interface_segregation.web_dev_simplified_demo.good.behavior_component;

import com.cddrm.solid.interface_segregation.web_dev_simplified_demo.good.entity.AbstractEntity;

public interface Attacker {

    void attack(AbstractEntity targetEntity);
}
