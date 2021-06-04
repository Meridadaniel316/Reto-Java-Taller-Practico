package com.enumeration.SixteenthPoint;

public class Persona {

    public final String nombre;
    private final int edad;
    private final int DNI;
    private final char letraDNI;
    private final char sexo;
    private final float peso;
    private final float altura;

    public Persona(){
        nombre	= "";
        edad	= 0;
        DNI		= generaDNI();
        letraDNI= generaLetraDNI();
        sexo	= 'H';
        peso	= 0;
        altura	= 0;
    }

    public Persona(String nombre,int edad,String sexo){
        this.nombre  = nombre;
        this.edad    = edad;
        DNI	     = generaDNI();
        letraDNI     = generaLetraDNI();
        this.sexo    = comprobarSexo(sexo.charAt(0));
        peso	     = 0;
        altura	     = 0;
    }

    public Persona(String nombre,int edad,String sexo, float peso, float altura){
        this.nombre  = nombre;
        this.edad    = edad;
        this.DNI     = generaDNI();
        letraDNI     = generaLetraDNI();
        this.sexo    = comprobarSexo(sexo.charAt(0));
        this.peso    = peso;
        this.altura  = altura;
    }

    public String calcularIMC(){
        float imc = this.peso/(int)Math.pow(this.altura/100,2);
        if (imc>=25) return "superior al normal.";
        else if (imc<18.5) return "inferior al normal.";
        else return "normal.";
    }

    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }

    public String toString(){
        return 	"Los datos de la persona son:\n" +
                "Nombre: " + this.nombre + "\n" +
                "Edad: " + this.edad + "\n" +
                "DNI : " + this.DNI + "-" + this.letraDNI + "\n" +
                "Sexo: " + ( (this.sexo=='H') ? "Hombre":"Mujer" ) + "\n" +
                "Peso: " + this.peso + " kg\n" +
                "Altura: " + this.altura + " cm";
    }

    private char comprobarSexo(char sexo){
        if(sexo=='M' || sexo=='m') return 'M';
        else return 'H';
    }

    private int generaDNI(){
        return (int)(Math.random()*100000000);
    }

    private char generaLetraDNI(){
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(this.DNI%23);
    }

}