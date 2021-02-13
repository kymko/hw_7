package com.company;

public class Main {

    public static void main(String[] args) {


        Medic medic = new Medic(90, 67);
        Magic magic = new Magic(92, 45);
        Warrior warrior = new Warrior(80, 34);

        Hero[] array = {medic, magic, warrior};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].applySuperAbility());
        }


    }


}