package com.enumeration;

import com.extensions.*;

public class FirstPoint {

    private final Messages text = new Messages();
    private final ExtensionsMessage msg = new ExtensionsMessage();
    private final WorkshopQuestions presentation = new WorkshopQuestions();

    public void start() {

        int[] data = new int[2];

        //Variables definidas para leer en el readData
        data[0] = 6;
        data[1] = 16;

        try {

            presentation.firstPoint();
            text.extractDataResponse(data);

        } catch (Exception e) {
            text.errorMessage(e);
        }

        presentation.finalQuestion();

    }

    private void extractResponse(int[] data) {
        msg.clearConsole();
        System.out.println("EJERCICIO #1");
        text.extractDataResponse(data);
        msg.lineBreak();
    }


}
