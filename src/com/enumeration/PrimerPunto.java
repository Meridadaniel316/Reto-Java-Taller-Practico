package com.enumeration;

import com.extensions.*;

public class PrimerPunto {

    private final ExtensionsMessage msg = new ExtensionsMessage();
    private final WorkshopQuestions presentation = new WorkshopQuestions();
    
    public void start() {

        int[] data = new int[2];

        //Variables definidas para leer en el readData
        data[0] = 06;
        data[1] = 16;

        try {

            presentation.primerTaller();
            readData(data);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        presentation.preguntaFinal();

    }

    //Se encarga de leer los datos 1 y 2 y extraer la respuesta de cual es mayor
    private void readData(int[] data) {
        msg.lineBreak();
        System.out.println("Dato 1: (" + data[0] + ") <|-|> Dato 2: (" + data[1]+")");
        msg.lineBreak();
        extractResponse(data);
        msg.lineBreak();
    }

    //Determina cual es mayor a cual y da la respuesta final.
    private void extractResponse(int[] data) {
        if (data[0] < data[1]) {
            System.out.println("El dato 2 (" + data[1] + ") es mayor al dato 1 (" + data[0] + ") <|-|> (" + data[0] + " < " + data[1] + ")");
        } else if (data[0] == data[1]) {
            System.out.println("El dato 1 (" + data[0] + ") es igual al dato 2 (" + data[1] + ") <|-|> (" + data[1] + " == " + data[0] + ")");
        } else {
            System.out.println("El dato 1 (" + data[0] + ") es mayor al dato 2 (" + data[1] + ") <|-|> (" + data[1] + " > " + data[0] + ")");
        }
    }


}
