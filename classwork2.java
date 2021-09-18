package Lection2;

import java.util.Scanner;
import java.lang.Math;

class Roots {
    private double X1;
    private double X2;
    private int count;

    public void setX1(double X1) {
        this.X1 = X1;
    }

    public double getX1() {
        return X1;
    }

    public void setX2(double X2) {
        this.X2 = X2;
    }

    public double getX2() {
        return X2;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}

public class classwork2 {
    public static Roots getRoots(double a, double b, double c) {
        Roots R = new Roots();
        double D = (b * b) - 4 * a * c;
        if (D < 0) {
            R.setCount(0);
        }
        if (D == 0) {
            R.setX1(-b / 2 * a);
            R.setX2(-b / 2 * a);
            R.setCount(1);
        }
        if (D > 0) {
            R.setX1((-b - Math.sqrt(D)) / (2 * a));
            R.setX2((-b + Math.sqrt(D)) / (2 * a));
            R.setCount(2);
        }
        return R;
    }

    public static void main(String[] args) {
        System.out.println("Введите a, b и c последовательно.");
        Scanner firstvariable = new Scanner(System.in);
        double a = firstvariable.nextDouble();
        Scanner secondvariable = new Scanner(System.in);
        double b = secondvariable.nextDouble();
        Scanner thirdvariable = new Scanner(System.in);
        double c = thirdvariable.nextDouble();

        Roots R = getRoots(a, b, c);

        if (R.getCount() == 0) {
            System.out.println("Уравнение не имеет действительных решений.");
        }
        if (R.getCount() == 1) {
            System.out.println("Уравнение имеет два совпадающих корня. Х = " + R.getX1());
        }
        if (R.getCount() == 2) {
            System.out.println("Уравнение имеет два различных корня. X1 = " + R.getX1() + "; X2 = " + R.getX2());
        }
    }
}


