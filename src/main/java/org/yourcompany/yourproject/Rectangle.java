package org.yourcompany.yourproject;

public class Rectangle {

    private double amplada;
    private double llargada;

    public Rectangle(double amplada, double llargada) {
        setAmplada(amplada);
        setLlargada(llargada);
    }

    public double area() {
        return amplada*llargada;
    }

    public double perimetre() {
        return amplada*2 + llargada*2;
    }

    public double getAmplada() {
        return amplada;
    }

    public double getLlargada() {
        return llargada;
    }

    public void setAmplada(double amplada) {
        if (amplada <=0) {
            this.amplada = 1;
        } else
        this.amplada = amplada;
    }

    public void setLlargada(double llargada) {
        if (llargada <=0) {
            this.llargada = 1;
        } else
        this.llargada = llargada;
    }
    
}