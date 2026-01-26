/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

/**
 *
 * @author Younes
 */
public class Rectangles {

    public static void main(String[] args) {

        /**en comptes de posar         
        *r1.setAmplada(10);
        r1.setLlargada(20); 
        fem Rectangle r1 = new Rectangle (amplada, llargada);*/ 
        /*
        Rectangle r1 = new Rectangle(5, 3);
        Rectangle r2 = new Rectangle(30,60);
        Rectangle r3 = new Rectangle(-30,-60);
        //Prova tot vuit
        Rectangle r5 = new Rectangle ();
        //Provem el nou mètode
        Rectangle r4 = new Rectangle(3, 3, "vermell");

        //print de le àrees
        System.out.println("Area r1 = " +r1.area());
        System.out.println("Area r2 = " +r2.area());
        System.out.println("Area r3 = " +r3.area());
        System.out.println("////////////////////////////");
        System.out.println("Perímetre r1 = " +r1.perimetre());
        System.out.println("Perímetre r2 = " +r2.perimetre());
        //ERROR!!!
        System.out.println("Diagonal r1 = " + r1.diagonal());
        System.out.println(r1.toString()); //Nomès té amplada i llargada
        System.out.println(r4.toString()); //Té tots els atributs
        System.out.println(r5.toString()); //No te ningún atribut (Surten nomès els predeterminats)
        r4.mostrarRectangle();
        */

       Rectangle r1 = new Rectangle(10.5, 4, "vermell");
       System.out.println(r1.toString());
       System.out.println("Perimetre: " + r1.perimetre());
       r1.mostrarRectangle();

       try{
        Rectangle r2 = new Rectangle(-1, -4);
        r2.mostrarRectangle();
       }
        catch(IllegalArgumentException e){
        System.out.println(e.getMessage());
       }

       Rectangle r3 = new Rectangle(10.5, 4, "vermell");
       System.out.println(r3.toString());

       if(r1.equals(r3)){
        System.out.println("r1 i r3 son iguals.");
       }
       else{
        System.out.println("r1 i r3 son diferents.");
       }
        
    }
}