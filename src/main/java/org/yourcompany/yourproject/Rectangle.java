package org.yourcompany.yourproject;

public class Rectangle {

    //Atributs millor declarar-los privats
    //Constructor, getters i setters

    // Com ja hem declarat aqui les variables, no cal definir-les dins de cada mètode.
    private double amplada;
    private double llargada;
    private String color;
    //static vol dir qeu es una variable de la classe 
    private static String []colorsValids = {"vermell", "verd", "blau", "groc", "negre", "blanc"}; 

    public String getANSIColor() {

    switch (color) {

    case "vermell": return "\u001B[31m";

    case "verd": return "\u001B[32m";

    case "groc": return "\u001B[33m";

    case "blau": return "\u001B[34m";

    case "negre": return "\u001B[30m";

    case "blanc": return "\u001B[37m";

    default: return "\u001B[0m";

    }

    }


    //CONSTRUCTORS (Nom igual que la classe)

    //POSEM AQUI UN VALOR PER DEFECTE EN CAS DE QUE NO POSIN PARAMETRES DES-DE EL MAIN
    public Rectangle(){
        setAmplada(1);
        setLlargada(1);
        setColor("Blue Navarra");
    }


    public Rectangle(double amplada, double llargada) {
        setAmplada(amplada);
        setLlargada(llargada);
        setColor("Nardo Grey");
    }

    public Rectangle (double amplada, double llargada, String color){
        setAmplada(amplada);
        setLlargada(llargada);
        this.setColor(color);
    }

    public double area (){
        
        return amplada*llargada;

    }

    public double perimetre (){

        return (amplada + llargada) * 2;

    }
    //getters
    public double getAmplada() {
        return amplada;
    }

    public double getLlargada() {
        return llargada;
    }



    public String getColor() {
        return color;
    }


    //setters
    public void setAmplada(double amplada) {


        if (amplada <= 0){
          this.amplada = 1;  

          //Això és una eccepció en cas de que es posi un valor illegal valor <= 0
          
          //throw new IllegalArgumentException ("La funcio te un valor no vàlid!");
        }
        else {
            this.amplada = amplada;
        }
    }

    public void setLlargada(double llargada) {
        if (llargada <= 0){
            this.llargada = 1;
        }
        
        else {
            this.llargada = llargada;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }



    public double diagonal (){
        return Math.sqrt((amplada * amplada) + (llargada * llargada));
    }
    //Aquest mètode fa passa tot a un String

    @Override
    public String toString() {
        return "Rectangle [amplada=" + amplada + ", llargada=" + llargada + ", color=" + color + "]";
    }

    public void mostrarRectangle (){
        for (int i = 0; i < this.llargada; i++){
            for (int j = 0; j < this.amplada; j++){
                //truquem al mètode en el mateix print per que retorni el color del mètode getANSIColor()
                System.out.print(getANSIColor()+"*");
            }
            System.out.println();

        }

    }

    public boolean equals(Rectangle rec){
        if(rec.amplada == this.amplada && rec.llargada == this.llargada){
            return true;
        } 
        else{
            return false;
        }
    }
    
}