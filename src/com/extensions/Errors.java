package com.extensions;

public class Errors extends ExtensionsMessage{

    public void cmdErrorExecution(){
        lineBreak();
        System.out.printf("Has seleccionado una respuesta incorrecta. %nIntenta nuevamente %n");
        lineBreak();
    }
}
