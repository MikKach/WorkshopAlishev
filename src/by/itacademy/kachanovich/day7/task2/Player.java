package by.itacademy.kachanovich.day7.task2;

import java.util.Random;

public class Player {

    private int stamina;
    private final int MIN_STAMINA = 0;
    private final int MAX_SATMINA = 100;
    static int countPlayer = 0;


    public Player() {
        this.stamina = 90 + (int)(Math.random() * 11);
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {

    }

    public void info() {

    }
}
