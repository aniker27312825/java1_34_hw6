package com.company;

public class Weapon {
    private String name, type;

    @Override
    public String toString() {return "" +
            "name='" + name + '\'' +
            ", type='" + type + '\'';

    }

    public Weapon(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
