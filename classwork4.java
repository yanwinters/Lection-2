package Lection2;

import java.lang.Math;
import java.util.Scanner;

class Cylinder {
    public void area(double R, double h) {
        double area = (2 * Math.PI * R * h) + (2 * Math.PI * R * R);
        System.out.println("Площадь суммарной площади цилиндра при заданном радиусе и высоте равна: " + area);
    }

    public void volume(double R, double h) {
        double volume = Math.PI * R * R * h;
        System.out.println("Объём цилиндра при заданном радиусе и высоте равен: " + volume);
    }

    public void area(String StrR, String Strh) {
        double modR = Double.parseDouble(StrR); //modR = modifiedR
        double modh = Double.parseDouble(Strh); //modh = modifiedh
        double strArea = (2 * Math.PI * modR * modh) + (2 * Math.PI * modR * modR); //StrArea = StringArea
        System.out.println("Площадь суммарной площади цилиндра при заданном радиусе и высоте равна: " + strArea);
    }

    public void volume(String StrR, String Strh) {
        double modR = Double.parseDouble(StrR); //modR = modifiedR
        double modh = Double.parseDouble(Strh); //modh = modifiedh
        double strVolume = Math.PI * modR * modR * modh;
        System.out.println("Объём цилиндра при заданном радиусе и высоте равен: " + strVolume);
    }
}

public class classwork4 {
    public static void main(String[] args) {
        System.out.println("Введите высоту и радиус цилиндра: ");
        Scanner input = new Scanner(System.in);
        double R = input.nextDouble();
        double h = input.nextDouble();
        String StrR = input.next();
        String Strh = input.next();

        Cylinder operation = new Cylinder();
        operation.area(R, h);
        operation.volume(R, h);
        operation.area(StrR, Strh);
        operation.volume(StrR, Strh);
    }
}
