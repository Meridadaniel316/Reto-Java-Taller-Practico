package com.enumeration;

import com.extensions.ExtensionsMessage;
import com.extensions.Messages;
import com.extensions.WorkshopQuestions;

import java.util.Scanner;

public class FourteenthPoint {

    private final Messages text = new Messages ();
    private final Scanner entrada = new Scanner (System.in);
    private final ExtensionsMessage msg = new ExtensionsMessage ();
    private final WorkshopQuestions presentation = new WorkshopQuestions ();

    public void start() {

        presentation.fourteenthPoint ();
        try {
            System.out.println ("Por favor ingrese un numero de inicio");
            int number = entrada.nextInt ();

            for (int num = number; num < 1000; num += 2) {
                System.out.println (num);
            }
            msg.lineBreak ();
            System.out.println ("El número tomado desde el inicio fue: " + number);
            msg.lineBreak ();
        } catch (Exception e) {
            text.errorMessage (e);
        }
        presentation.finalQuestion ();
    }
}
