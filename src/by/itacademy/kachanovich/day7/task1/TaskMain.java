package by.itacademy.kachanovich.day7.task1;

public class TaskMain {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2015,41,6000);
        Airplane airplane2 = new Airplane("Airbus", 2014,34,4500);
        Airplane.comparesAirplanes(airplane1,airplane1);
    }
}
