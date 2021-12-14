package by.itacademy.kachanovich.day6.task2;

public class TaskMain2 {
    public static void main(String[] args) {
       /* Создать новый объект класса Самолет с произвольными данными.
        Изменить год выпуска и длину с помощью сеттеров, вызвать метод ​ fillUp()​ два
        раза, передав разные значения. Вызвать метод ​ info()​ .*/
        Airplane airplane = new Airplane("Boing", 2015,41,6000);
        airplane.setYear(2019);
        airplane.setLength(52);
        airplane.fuelUp(100);
        airplane.fuelUp(50);
        airplane.info();
    }
}
