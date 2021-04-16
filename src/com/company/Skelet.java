package com.company;

public class Skelet extends Boss{
    private int kol_vo = 10;
    public int getKol_vo() {
        System.out.println(kol_vo);
        return kol_vo;
    }

    @Override
    public String printInfo(String name) {
        return super.printInfo(name);
    }
}
