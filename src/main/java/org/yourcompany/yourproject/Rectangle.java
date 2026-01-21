package org.yourcompany.yourproject;

public class Rectangle {

    private double amplada;
    private double llargada;
    private String color;

    public Rectangle() {
        setAmplada(1);
        setLlargada(1);
        setColor("Vermell");
    }

    public Rectangle(double amplada, double llargada) {
        setAmplada(amplada);
        setLlargada(llargada);
    }

    public Rectangle (double amplada, double llargada, String color) {
        setAmplada(amplada);
        setLlargada(llargada);
        this.setColor(color);
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

    public double diagonal() {
        return Math.sqrt((amplada*amplada) + (llargada*llargada));
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectangle{");
        sb.append("amplada=").append(amplada);
        sb.append(", llargada=").append(llargada);
        sb.append(", color=").append(color);
        sb.append('}');
        return sb.toString();
    }
    
}