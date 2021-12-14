package by.itacademy.kachanovich.day5.task1;

public class Car {
    /*Создать класс Автомобиль (англ. ​ Car​ ), с полями “Год выпуска”, “Цвет”, “Модель”.
    Создать ​ get​ и ​ set​ методы для каждого поля. Создать экземпляр класса Автомобиль,
    задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
    Созданный вами класс должен отвечать принципам инкапсуляции.*/
    private  int year;
    private String color;
    private  String model;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
