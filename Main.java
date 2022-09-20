package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Chicken chicken = new Chicken();
        Egg egg = new Egg();
        chicken.start();
        egg.start();
        egg.join(); //ждем поток яйца
        if (chicken.isAlive()) {
            chicken.join();
            System.out.println("Спор окончен. Победила курица");
            return;
        }
        System.out.println("Спор окончен. Победило яйцо");
    }

}