package com.enumeration;

import com.extensions.ExtensionsMessage;
import com.extensions.Messages;
import com.extensions.WorkshopQuestions;

import java.util.Scanner;

public class ThirdPoint {

    private final Messages text = new Messages();
    private final Scanner entrada = new Scanner(System.in);
    private final ExtensionsMessage msg = new ExtensionsMessage();
    private final WorkshopQuestions presentation = new WorkshopQuestions();

    public void start() {
        presentation.thirdPoint();

        double radioDouble;
        try {

            radioDouble = getRadio();
            extractAreaResult(radioDouble);

        } catch (Exception e) {
            text.errorMessage(e);
        }

        presentation.finalQuestion();
    }

    private void extractAreaResult(double radioDouble) {
        double area;
        area = Math.PI * (radioDouble * radioDouble);

        msg.lineBreak();
        text.areaResult(area);
        msg.lineBreak();
    }

    private double getRadio() {
        String radio;
        msg.clearConsole();
        text.extractCircleArea();
        radio = entrada.nextLine();
        return Double.parseDouble(radio);
    }
}
