package com.enumeration;

import com.extensions.*;

public class FirstPoint {

    private final ExtensionsMessage msg = new ExtensionsMessage();
    private final WorkshopQuestions presentation = new WorkshopQuestions();

    public void start() {

        int[] data = new int[2];

        //Variables definidas para leer en el readData
        data[0] = 6;
        data[1] = 16;

        try {

            presentation.firstPoint();
            extractResponse(data);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        presentation.finalQuestion();

    }

    private void extractResponse(int[] data) {
        msg.clearConsole();
        System.out.println("EJERCICIO #1");
        if (data[0] < data[1]) {
            msg.lineBreak();
            readData(data, "La variable #2 es la de mayor valor: ", 1, "La variable #1 es la de menor valor: ", 0);
        } else if (data[0] == data[1]) {
            msg.lineBreak();
            System.out.printf("Las dos variables tienen el mismo valor %nVariable 1: (%d) %nVariable 2: (%d) %n", data[0], data[1]);
        } else {
            msg.lineBreak();
            readData(data, "La variable #1 es la de mayor valor: ", 0, "La variable #2 es la de menor valor: ", 1);
        }
        msg.lineBreak();
    }

    private void readData(int[] data, String s, int i, String s2, int i2) {
        System.out.println(s + data[i]);
        System.out.println(s2 + data[i2]);
        msg.lineBreak();
        System.out.printf("Variable 1: (%d) %nVariable 2: (%d) %n", data[0], data[1]);
    }


}
