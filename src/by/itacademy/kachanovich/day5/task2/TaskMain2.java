package by.itacademy.kachanovich.day5.task2;

public class TaskMain2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(1974,"green","BMV");
        System.out.printf("Model: %s\nYear: %s\nColor: %s",motorbike.getModel(),motorbike.getYear(),motorbike.getColor());
    }
}
