/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

/**
 *
 * @author Younes
 */
import java.util.Random;
import java.util.Scanner;
public class Rectangles {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random rand = new Random();

        Rectangle r1 = new Rectangle(100, 200);

        Rectangle r2 = new Rectangle(30, 60);

        Rectangle r3 = new Rectangle(-30, -60);

        System.out.println("L'area del r1 es: " + r1.area());
        System.out.println("L'area del r2 es: " + r2.area());

        System.out.println("El perimetre del r1 es: " + r1.perimetre());
        System.out.println("El perimetre del r2 es: " + r2.perimetre());

        System.out.println("L'amplada del rectangle 3 (amb valor negatiu): " + r3.getAmplada());
        System.out.println("L'altura del rectangle 3 (amb valor negatiu): " + r3.getLlargada());
    }
}