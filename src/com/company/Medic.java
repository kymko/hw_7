package com.company;

public class Medic extends Hero{


    public Medic(int health, int damage) {
        super(health, damage);
    }

    @Override
    public String applySuperAbility() {
        super.applySuperAbility();
        return "Medic применил суперспособность Helping Maximum";
    }
}
