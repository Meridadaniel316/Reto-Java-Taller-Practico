package com.enumeration;

import com.extensions.ExtensionsMessage;
import com.extensions.Messages;
import com.extensions.WorkshopQuestions;

import java.util.Scanner;

public class FourthPoint {

    private final Messages text = new Messages();
    private final Scanner entrada = new Scanner(System.in);
    private final ExtensionsMessage msg = new ExtensionsMessage();
    private final WorkshopQuestions presentation = new WorkshopQuestions();

    public void start() {
        int percentage = 21;

        try {
            presentation.fourthPoint();
            double quantity = getProductQuantity();
            extractProductResult(percentage, quantity);

        } catch (Exception e) {
            text.errorMessage(e);
        }
        presentation.finalQuestion();
    }

    private void extractProductResult(int percentage, double quantity) {
        double total = quantity + (quantity * percentage / 100);
        msg.clearConsole();
        msg.lineBreak();
        text.totalProduct(total);
        msg.lineBreak();
    }

    private double getProductQuantity() {
        text.extractProductValue();
        return entrada.nextDouble();
    }
}
