package com.enumeration;

import com.extensions.ExtensionsMessage;
import com.extensions.WorkshopQuestions;

import java.util.*;

public class SecondPoint {

    private final Scanner entrada = new Scanner(System.in);
    private final ExtensionsMessage msg = new ExtensionsMessage();
    private final WorkshopQuestions presentation = new WorkshopQuestions();

    public void start() {
        int numData = 2;
        long[] data = new long[numData];

        try {
            presentation.secondPoint();
            extractData(numData, data);
            extractResponse(data);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        presentation.finalQuestion();

    }

    private void extractData(int numData, long[] data) {
        System.out.printf("Por favor ingresa %d variables numéricas %n", numData);
        for (int i = 0; i < data.length; i++) {
            System.out.printf("Dato %d: ", i + 1);
            data[i] = entrada.nextLong();
        }
    }

    private void extractResponse(long[] data) {
        msg.clearConsole();
        System.out.println("EJERCICIO #2");
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

    private void readData(long[] data, String s, int i, String s2, int i2) {
        System.out.println(s + data[i]);
        System.out.println(s2 + data[i2]);
        msg.lineBreak();
        System.out.printf("Variable 1: (%d) %nVariable 2: (%d) %n", data[0], data[1]);
    }


}
