package Lection2;

import java.lang.Math;
import java.util.Scanner;

class Maths {
    public static double x;
    public static double y;

    public Maths(double x1, double y1) {
        this.x = x1;
        this.y = y1;
    }

    public double sum(double x, double y) {
        double sum = x + y;
        return sum;
    }
    public double diff(double x1, double y1) {
        return x1 - y1;
    }
    public double multi(double x1, double y1) {
        return x1 * y1;
    }
    public double div(double x1, double y1) {
        return x1 / y1;
    }
    public double pow(double x1, double y1) {
        int pow = (int) Math.pow(x1, y1);
        return pow;
    }
    public double getFactorial(double x1) {
        int result = 1;
        for (int i = 1; i <= x1; i++) {
            result = result * i;
        }
        return result;
    }
}

public class classwork5 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Введите последовательно два целых числа.");
        double x1 = numbers.nextInt();
        double y1 = numbers.nextInt();
        Maths maths = new Maths(x1, y1);

        System.out.println("Выберите операцию: поддерживается сложение, вычитание, умножение, деление, возведение в степень и факториал от первого числа.");
        Scanner figure = new Scanner(System.in);
        String figure1 = figure.next();

        if (figure1.equals("Сложение") || figure1.equals("сложение")) {
            System.out.println("Операция сложения двух введённых чисел равняется: ");
            System.out.println(maths.sum(x1, y1));
        }
        else if (figure1.equals("Вычитание") || figure1.equals("вычитание")) {
            System.out.println("Операция вычитания двух введённых чисел равняется: ");
            System.out.println(maths.diff(x1, y1));
        }
        else if (figure1.equals("Умножение") || figure1.equals("умножение")) {
            System.out.println("Операция умножения двух введённых чисел дала результат, равный: ");
            System.out.println(maths.multi(x1, y1));
        }
        else if (figure1.equals("Деление") || figure1.equals("деление")) {
            System.out.println("Операция деления двух введённых чисел дала результат, равный: ");
            System.out.println(maths.div(x1, y1));
        }
        else if (figure1.equals("Степень") || figure1.equals("степень") || figure1.equals("Возведение в степень") || figure1.equals("возведение в степень")) {
            System.out.println("Операция возведения первого числа в степень второго равна: ");
            System.out.println(maths.pow(x1, y1));
        }
        else if (figure1.equals("Факториал") || figure1.equals("факториал")) {
            System.out.println("Факториал от первого числа равняется: ");
            System.out.println(maths.getFactorial(x1));
        }
    }
}
