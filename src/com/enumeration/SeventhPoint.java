package com.enumeration;

import com.extensions.Errors;
import com.extensions.ExtensionsMessage;
import com.extensions.Messages;
import com.extensions.WorkshopQuestions;

import java.util.Scanner;

public class SeventhPoint {

    private final Errors error = new Errors();
    private final Messages text = new Messages();
    private final Scanner entrada = new Scanner(System.in);
    private final ExtensionsMessage msg = new ExtensionsMessage();
    private final WorkshopQuestions presentation = new WorkshopQuestions();

    public void start() {
        try {
            presentation.seventhPoint();
            extractNumber();
        } catch (Exception e) {
            text.errorMessage(e);
        }
        presentation.finalQuestion();
    }

    public void extractNumber() {
        int number;
        boolean cmderror = false;

        do {
            validateCmdError(cmderror);
            text.extractNumber();
            String num = entrada.nextLine();
            number = Integer.parseInt(num);
            cmderror = true;
        } while (number <= 0);

        text.printMessageNumber(number);
    }

    public void validateCmdError(boolean cmderror) {
        if (cmderror) {
            msg.errorSystemCmd();
            error.cmdErrorExecution();
        }
    }
}
