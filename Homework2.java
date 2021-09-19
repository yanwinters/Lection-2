package Lection2;

import java.util.Scanner;

class Parallelepiped {
    private double a;
    private double b;
    private double c;

    public Parallelepiped(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    public double firstArea(double a, double b) {
        return (a * b);
    }

    public double secondArea(double b, double c) {
        return (b * c);
    }

    public double thirdArea(double a, double c) {
        return (a * c);
    }

    public static double Volume(Parallelepiped parallelepiped) {
        return (parallelepiped.firstArea(parallelepiped.getA(), parallelepiped.getB()) * parallelepiped.getC());
        //можно написать любое произведение грани параллелепипеда, составленной из двух параметров, на оставшийся параметр
    }

    public static double Area(Parallelepiped parallelepiped) {
        return 2 * (parallelepiped.firstArea(parallelepiped.getA(), parallelepiped.getB())
                + parallelepiped.secondArea(parallelepiped.getB(), parallelepiped.getC())
                + parallelepiped.thirdArea(parallelepiped.getA(), parallelepiped.getC()));
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Поочерёдно ведите параметры параллелепипеда: a, b и c.");
        double a = data.nextDouble();
        double b = data.nextDouble();
        double c = data.nextDouble();

        Parallelepiped parallelepiped = new Parallelepiped(a, b, c);

        System.out.println("Площадь параллелепипеда при заданных параметрах равна: " + Parallelepiped.Area(parallelepiped));
        System.out.println("Объём параллелепипеда при заданных параметрах равен: " +Parallelepiped.Volume(parallelepiped));
    }
}