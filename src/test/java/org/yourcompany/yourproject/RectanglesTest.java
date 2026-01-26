package org.yourcompany.yourproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RectanglesTest {

    @Test
    public void areaTest(){

        Rectangle rectangle = new Rectangle(10, 20);

        assertEquals(200, rectangle.area());
    }

    @Test
    public void perimetreTest(){

        Rectangle rectangle = new Rectangle(20, 40);

        assertEquals(120, rectangle.perimetre());
    }

    @Test
    public void ampladaTest(){

        Rectangle rectangle = new Rectangle();
        rectangle.setAmplada(84);

        assertEquals(84, rectangle.getAmplada());
    }

    @Test
    public void llargadaTest(){

        Rectangle rectangle = new Rectangle();
        rectangle.setLlargada(23);

        assertEquals(23, rectangle.getLlargada());
    }

    @Test
    public void diagonalTest(){

        Rectangle rectangle = new Rectangle(40, 90);

        assertEquals(98.48, rectangle.diagonal(), 0.1);
    }

    @Test
    public void colorTest(){

        Rectangle rectangle = new Rectangle(20, 30);
        rectangle.setColor("Vermell");

        assertEquals("Vermell", rectangle.getColor());
    }

    @Test
    public void ampladaIncorrecte(){

        Rectangle rectangle = new Rectangle();

        try{
            rectangle.setAmplada(-10);
            //fail("S'esperava una exception!");

        } catch(IllegalArgumentException e) {

        }
    }
}