package by.itacademy.kachanovich.day7.task1;

public class Airplane {

    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;


    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;

    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getFuel() {
        return fuel;
    }

    /* В классе Самолет создать статический метод ​ compareAirplanes​ , который в
качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит
сообщение в консоль о том, какой из самолетов длиннее.*/


    public void info() {
        System.out.printf("Producer: %s , year: %s, length: %s, weight: %s, fuel: %s", this.producer, this.year, this.length, this.weight, this.fuel);
    }



    public static void comparesAirplanes(Airplane airplane1, Airplane airplane2){
        if (airplane1.length> airplane2.length){
            System.out.printf("Самолет %d года выпуска длинее.", airplane1.year);
        }
        else System.out.printf("Самолет %d года выпуска длинее.", airplane2.year);
    }
}
