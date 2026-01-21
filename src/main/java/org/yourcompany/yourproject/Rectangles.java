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

        Rectangle r4 = new Rectangle(20, 40, "blau");

        Rectangle r5 = new Rectangle();

        System.out.println("L'area del r1 es: " + r1.area());
        System.out.println("L'area del r2 es: " + r2.area());
        System.out.println("L'area del r3 es: " + r3.area());

        System.out.println("El perimetre del r1 es: " + r1.perimetre());
        System.out.println("El perimetre del r2 es: " + r2.perimetre());
        System.out.println("El perimetre del r3 es: " + r3.perimetre());
        
        System.out.println("L'amplada del rectangle 1: " + r1.getAmplada());
        System.out.println("L'amplada del rectangle 2: " + r2.getAmplada());
        System.out.println("L'amplada del rectangle 3: " + r3.getAmplada());

        System.out.println("L'altura del rectangle 1: " + r1.getLlargada());
        System.out.println("L'altura del rectangle 2: " + r2.getLlargada());
        System.out.println("L'altura del rectangle 3: " + r3.getLlargada());

        System.out.println("La diagonal del rectangle 1 es: " + r1.diagonal());
        System.out.println("La diagonal del rectangle 2 es: " + r2.diagonal());
        System.out.println("La diagonal del rectangle 3 es: " + r3.diagonal());

        System.out.println("El color del rectangle 1 es: " + r1.getColor());
        System.out.println("El color del rectangle 4 es: " + r4.getColor());

        System.out.println(r5.toString());
    }
}