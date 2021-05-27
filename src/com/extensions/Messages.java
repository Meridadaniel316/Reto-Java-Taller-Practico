package com.extensions;

public class Messages extends ExtensionsMessage {

    public void welcomeWorkshop(){
        pictureCar();
        lineBreak();
        System.out.printf("¡Hola, bienvenido a mi sistema!%n");
        lineBreak();
    }
    public void workshopQuestions(){
        System.out.printf("Este taller cuenta con un total de 18 ejercicios%nDigita del 1 al 18 dependiendo del ejercicio que quieras ver%n");
    }
}
