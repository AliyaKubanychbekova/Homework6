package com.company;

import java.nio.file.WatchEvent;

public class Main {
    public static void main(String[] args) {
	Boss boss = new Boss();
	boss.setHealth(700);
	boss.setDamage(250);
	System.out.println(boss.getWeapon());
    }
}
