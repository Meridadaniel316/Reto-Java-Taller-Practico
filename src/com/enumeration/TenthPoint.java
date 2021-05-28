package com.enumeration;

import com.extensions.ExtensionsMessage;
import com.extensions.Messages;
import com.extensions.WorkshopQuestions;

import java.util.Scanner;

public class TenthPoint {

    private final Messages text = new Messages();
    private final Scanner entrada = new Scanner(System.in);
    private final ExtensionsMessage msg = new ExtensionsMessage();
    private final WorkshopQuestions presentation = new WorkshopQuestions();

    public void start() {
        presentation.tenthPoint();
        try {
            String frase;

            text.printTextSpaces();
            frase = entrada.nextLine();

            frase = frase.replace(" ", "");

            msg.lineBreak();
            System.out.println(frase);
            msg.lineBreak();

        } catch (Exception e) {
            text.errorMessage(e);
        }
        presentation.finalQuestion();
    }
}
