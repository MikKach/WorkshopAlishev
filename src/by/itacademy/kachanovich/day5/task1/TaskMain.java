package by.itacademy.kachanovich.day5.task1;

public class TaskMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(1985);
        car.setColor("red");
        car.setModel("VW");
        System.out.printf("Model: %s; year: %s; color: %s ", car.getModel(), car.getYear(), car.getColor());
    }
}
