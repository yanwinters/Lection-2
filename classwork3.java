package Lection2;

import java.util.Scanner;

class A {
    public void count(int a, int b) {
        System.out.println("Сумма чисел a и b равна:");
        System.out.println(a + "+" + b + "=" + (a + b));
    }

    public void show() {
        System.out.println("Класс A");
    }
}

class B extends A {
    public void count(int a, int b) {
        System.out.println("Разность чисел a и b равна:");
        System.out.println(a + "-" + b + "=" + (a - b));
    }

    public void show() {
        System.out.println("Класс B");
    }
}

class C extends A {
    public void count(int a, int b) {
        System.out.println("Умножение чисел a и b равно:");
        System.out.println(a + "*" + b + "=" + (a * b));
    }

    public void show() {
        System.out.println("Класс C");
    }
}

class D extends B {
    public void count(int a, int b) {
        System.out.println("Деление числа a на число b равно:");
        System.out.println(a + "/" + b + "=" + (a / b));
    }

    public void show() {
        System.out.println("Класс D");
    }
}

public class classwork3 {
    public static void main(String[] args) {
        System.out.println("Введите последовательно два числа.");
        Scanner firstvariable = new Scanner(System.in);
        int number1 = firstvariable.nextInt();
        Scanner secondvariable = new Scanner(System.in);
        int number2 = secondvariable.nextInt();

        A firstOperation = new A();
        firstOperation.count(number1, number2);
        firstOperation.show();

        B secondOperation = new B();
        secondOperation.count(number1, number2);
        secondOperation.show();

        C thirdOperation = new C();
        thirdOperation.count(number1, number2);
        thirdOperation.show();

        D lastOperation = new D();
        lastOperation.count(number1, number2);
        lastOperation.show();
    }
}
