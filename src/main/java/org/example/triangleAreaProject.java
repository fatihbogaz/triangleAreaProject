package org.example;
import java.util.Scanner;

public class triangleAreaProject {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double perimeter;
        double u;
        double area;
        Scanner input = new Scanner(System.in);

        System.out.print("A kenarının uzunluğunu giriniz:");
        a = input.nextDouble();
        System.out.print("B kenarının uzunluğunu giriniz:");
        b = input.nextDouble();
        System.out.print("C kenarının uzunluğunu giriniz:");
        c = input.nextDouble();

        perimeter = a + b + c;
        u = perimeter / 2;
        area = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin alanı    :" + area);
    }
}



