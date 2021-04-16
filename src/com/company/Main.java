package com.company;

public class Main {

    public static void main(String[] args) {
	// ● Создать класс Weapon (Оружие), с приватными полями тип оружия и название оружия.
        //● Создать класс GameEntity (Игровая сущность), выделить все общие поля которые присущи и Боссу и Героям и
        // добавить геттеры и сеттеры к ним.
        //● Создать класс Босса, наследовать его от класса GameEntity и дополнить его полем сложного типа данных Weapon
        // (то есть дать оружие боссу). Также добавить геттеры и сеттеры для этого поля.
        //● В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям). Затем распечатать всю
        // информацию о боссе.
        //ДЗ на сообразительность:
        //● Распечатывание информации сделать в методе в классе Босса public String printInfo(){}
        //● Создать класс Скелетов, унаследовать от Босса.
        //● Добавить поле (кол-во стрел) и добавить геттеры.
        //● Переопределить родительский метод printInfo
        //● В Main распечатать информацию о Боссе с помощью метода printInfo, также создать 2 экземпляра скелета и
        // заполнить данными) затем распечатать всю информацию о скелетах.
        //Дедлайн: 16.03.2021 23:59
        Boss boss1 = new Boss();
        boss1.setDamage(200);
        boss1.setHealth(150);
        Weapon weapon1 = new Weapon("Gun", "Coldweapon");
        boss1.setWeapon(weapon1);
        boss1.printInfo("Boss");

        Skelet skelet1 = new Skelet();
        skelet1.setHealth(100);
        skelet1.setDamage(50);
        skelet1.printInfo("Skelet1");

        Skelet skelet2 = new Skelet();
        skelet2.setHealth(150);
        skelet2.setDamage(100);
        skelet2.printInfo("Skelet2");
    }
}
