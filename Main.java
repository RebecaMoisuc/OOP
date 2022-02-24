package ro.ItSchool.incapsulation;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double area = sc.nextDouble();
        Circle circle = new Circle(area);
        System.out.printf("Return the area of the circle: %.2f ", circle.getArea());
    }
}
