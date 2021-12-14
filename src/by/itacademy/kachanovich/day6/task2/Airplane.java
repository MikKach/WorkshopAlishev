package by.itacademy.kachanovich.day6.task2;

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

    /* Помимо этого, в классе необходимо реализовать метод ​ info()​ , который выводит
     сообщение в следующем формате:
             “Изготовитель: … , год выпуска: … , длина: ..., вес: ..., количество топлива в баке: …”
     Также, необходимо реализовать метод ​ fillUp()​ , который в качестве аргумента
     принимает число и заправляет топливный бак самолета на это значение.
     Создать новый объект класса Самолет с произвольными данными.
     Изменить год выпуска и длину с помощью сеттеров, вызвать метод ​ fillUp()​ два
     раза, передав разные значения. Вызвать метод ​ info()​ .*/
    public void info() {
        System.out.printf("Producer: %s , year: %s, length: %s, weight: %s, fuel: %s", this.producer, this.year, this.length, this.weight, this.fuel);
    }

    public void fuelUp(int num){
        this.fuel += num;
    }
}
