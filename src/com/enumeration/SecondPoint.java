package com.enumeration;

import com.extensions.ExtensionsMessage;
import com.extensions.Messages;
import com.extensions.WorkshopQuestions;

import java.util.*;

public class SecondPoint {

    private final Messages text = new Messages();
    private final Scanner entrada = new Scanner(System.in);
    private final ExtensionsMessage msg = new ExtensionsMessage();
    private final WorkshopQuestions presentation = new WorkshopQuestions();

    public void start() {
        int numData = 2;
        int[] data = new int[numData];

        try {
            presentation.secondPoint();
            extractData(numData, data);
            extractResponse(data);
        } catch (Exception e) {
            text.errorMessage(e);
        }
        presentation.finalQuestion();

    }

    private void extractData(int numData, int[] data) {
        System.out.printf("Por favor ingresa %d variables numéricas %n", numData);
        for (int i = 0; i < data.length; i++) {
            System.out.printf("Dato %d: ", i + 1);
            data[i] = entrada.nextInt();
        }
    }

    private void extractResponse(int[] data) {
        msg.clearConsole();
        System.out.println("EJERCICIO #2");
        text.extractDataResponse(data);
        msg.lineBreak();
    }

}
