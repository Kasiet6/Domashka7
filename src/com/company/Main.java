package com.company;

public class Main {

    public static void main(String[] args){
        Medic arsen = new Medic();
        Magic amir = new Magic();
        Warrior aalym = new Warrior();
        Hero[] heroes = { arsen , amir , aalym};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility("Ability");

        }
        {

        }
    }
}
