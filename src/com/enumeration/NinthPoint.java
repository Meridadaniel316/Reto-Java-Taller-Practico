package com.enumeration;

import com.extensions.ExtensionsMessage;
import com.extensions.Messages;
import com.extensions.WorkshopQuestions;

import java.util.Scanner;

public class NinthPoint {

    private final Messages text = new Messages();
    private final Scanner entrada = new Scanner(System.in);
    private final ExtensionsMessage msg = new ExtensionsMessage();
    private final WorkshopQuestions presentation = new WorkshopQuestions();

    public void start() {
        presentation.ninthPoint();

        try {

            String texto = text.printTextSmile();
            String textoFinal  = texto.replace("a", "e");
            System.out.println(textoFinal);

            text.printSmileQuestion();
            String frase = entrada.nextLine();

            textoFinal = textoFinal.concat(frase);
            msg.lineBreak();
            System.out.println(textoFinal);
            msg.lineBreak();

        } catch (Exception e) {
            text.errorMessage(e);
        }
        presentation.finalQuestion();

    }
}
