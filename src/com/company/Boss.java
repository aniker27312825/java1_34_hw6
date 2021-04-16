package com.company;

public class Boss extends GameEntity {
    Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public  String printInfo(String name){
        String print = name;
        System.out.println(print);
        System.out.println(getHealth());
        System.out.println(getDamage());
        System.out.println("Weapon "+getWeapon());
        System.out.println("---------------------");
        return print;
    }
}
