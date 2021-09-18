package Lection2;

import java.util.Scanner;

class Circle {
    private double x;
    private double y;
    private double r;
    private double modx;
    private double mody;
    private double d;
    private double modr;

    public Circle(double x1, double y1, double r1) {
        this.x = x1;
        this.y = y1;
        this.r = r1;
    }

    public void print() {
        System.out.println("Круг радиуса r=" + r + " Имеет центр с координатами " + "(" + x + ";" + y + ")");
    }

    public void move(double mx, double my) {
        x = x + mx;
        y = y + my;
    }

    public double distToOtherCircle(double x2, double y2, double r2) {
        this.modx = x2;
        this.mody = y2;
        this.modr = r2;
        d = Math.sqrt((x - modx) * (x - modx) + (y - mody) * (y - mody));
        return d;
    }

    public void changeRadius(double chR) {
        this.r = chR;
    }

    public double getPerimetr(double chR) {
        this.r = chR;
        double perimetr = 2 * Math.PI * r;
        return perimetr;
    }

    public double getSquare(double chR) {
        this.r = chR;
        double square = Math.PI * r * r;
        return square;
    }
}

public class classwork1 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Введите координаты и радиус первой окружности.");
        double x = data.nextDouble();
        double y = data.nextDouble();
        double r = data.nextDouble();
        Circle circle = new Circle(x, y, r);
        System.out.println("Параметры заданной окружности:");
        circle.print();

        System.out.println("Введите координаты x и y для смещения центра окружности.");
        double mx = data.nextDouble();
        double my = data.nextDouble();
        circle.move(mx, my);
        System.out.println("Координаты центра сдвинутой окружности:");
        circle.print();

        System.out.println("Введите параметры второй окружности: координаты и радиус.");
        double x2 = data.nextDouble();
        double y2 = data.nextDouble();
        double r2 = data.nextDouble();
        System.out.println("Расстояние между центрами окружностей равно:");
        System.out.println(circle.distToOtherCircle(x2, y2, r2));

        System.out.println("Введите новый радиус для первой окружности.");
        double chR = data.nextDouble();
        System.out.println("Параметры новой окружности равны:");
        circle.changeRadius(chR);
        circle.print();

        System.out.println("Периметр первой окружности с учётом всех изменений равен:");
        System.out.println(circle.getPerimetr(chR));

        System.out.println("Площадь первой окружности с учётом всех изменений равна:");
        System.out.println(circle.getSquare(chR));
    }
}


