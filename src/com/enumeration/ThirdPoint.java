package com.enumeration;

import com.extensions.ExtensionsMessage;
import com.extensions.WorkshopQuestions;

import java.util.Scanner;

public class ThirdPoint {

    private final Scanner entrada = new Scanner(System.in);
    private final ExtensionsMessage msg = new ExtensionsMessage();
    private final WorkshopQuestions presentation = new WorkshopQuestions();

    public void start() {
        presentation.thirdPoint();

        try {

            double radioDouble = getRadio();
            extractAreaResult(radioDouble);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        presentation.finalQuestion();
    }

    private void extractAreaResult(double radioDouble) {
        double area;
        area = Math.PI * (radioDouble * radioDouble);

        msg.lineBreak();
        System.out.println("El área del Círculo resultante es: " + area);
        msg.lineBreak();
    }

    private double getRadio() {
        String radio;
        msg.clearConsole();
        System.out.print("Introduce el radio de un Círculo: ");
        radio = entrada.nextLine();
        return Double.parseDouble(radio);
    }
}
