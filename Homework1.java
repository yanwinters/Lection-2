package Lection2;

import java.util.Scanner;

class Car {
    private static String model;
    private static int speedCount = 0;
    private static int weightCount = 0;
    private static double maxSpeed;
    private static double weight;

    public Car(String Model) {
        this.model = Model;
    }

    public Car(String gModel, double MaxSpeed) {
        this.model = gModel;
        this.maxSpeed = MaxSpeed;
        speedCount = speedCount + 1;
    }

    public Car(String gModel, double maxSpeed, double Weight) {
        this.model = gModel;
        this.maxSpeed = maxSpeed;
        this.weight = Weight;
        speedCount = speedCount + 2;
        weightCount = weightCount + 1;
    }

    public static void show() {
        System.out.println("Модель машины: " + model);
        System.out.println("Максимальная скорость и масса неизвестны.");
        if (speedCount == 1) {
            System.out.println("Максимальная скорость машины: " + maxSpeed + "км/ч");
            System.out.println("Масса машины неизвестна.");
        }
        else if (speedCount == 2 && weightCount == 1) {
            System.out.println("Максимальная скорость машины: " + maxSpeed);
            System.out.println("Масса машины: " + weight + " кг");
        }
    }
}

public class Homework1 {
    private static double maxSpeed;
    private static double Weight;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите модель машины (обязательный параметр).");
        String Model = input.next();
        Car car;
        System.out.println("Желаете ввести максимальную скорость (км/ч) ?");
        String answerSpeed = input.next();
        if (answerSpeed.equals("Да") || answerSpeed.equals("да")) {
            System.out.println("Какова максимальная скорость машины в километрах в час ?");
            maxSpeed = input.nextDouble();
        }
        else if (answerSpeed.equals("нет") || answerSpeed.equals("нет")) {
            System.out.println("Обойдёмся без этого параметра.");
        }

        System.out.println("Желаете указать массу машины (кг) ?");
        String answerWeight = input.next();
        if (answerWeight.equals("Да") || answerWeight.equals("да")) {
            System.out.println("Какова масса машины в килограммах ?");
            Weight = input.nextInt();
        }
        else if (answerWeight.equals("нет") || answerWeight.equals("нет")) {
            System.out.println("Обойдёмся без этого параметра.");
        }

        if (answerSpeed.equals("Да") || answerSpeed.equals("да")) {
            car = new Car(Model, maxSpeed);
            car.show();
        }
        else if ((answerSpeed.equals("Да") || answerSpeed.equals("да")) && (answerWeight.equals("да") || answerWeight.equals("Да"))) {
            car = new Car(Model, maxSpeed, Weight);
            car.show();
        }
        else if (answerSpeed.equals("Нет") || answerSpeed.equals("нет")) {
            car = new Car(Model);
            car.show();
        }
    }
}
