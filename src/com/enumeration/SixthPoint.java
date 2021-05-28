package com.enumeration;

import com.extensions.Errors;
import com.extensions.ExtensionsMessage;
import com.extensions.Messages;
import com.extensions.WorkshopQuestions;

import java.util.Scanner;

public class SixthPoint {

    private final Errors error = new Errors();
    private final Messages text = new Messages();
    private final Scanner entrada = new Scanner(System.in);
    private final ExtensionsMessage msg = new ExtensionsMessage();
    private final WorkshopQuestions presentation = new WorkshopQuestions();

    public void start() {
        try {
            presentation.sixthPoint();
            selectionMenu();
        } catch (Exception e) {
            text.errorMessage(e);
        }
        presentation.finalQuestion();
    }

    private void selectionMenu() {
        text.evenAndOddMenuQuestion();
        String optionSelection = entrada.nextLine();

        switch (optionSelection) {
            case "1":
                pairNumbers();
                break;
            case "2":
                oddNumbers();
                break;
            case "3":
                bothNumbers();
                break;
            default:
                msg.errorSystemCmd();
                error.cmdErrorExecution();
                selectionMenu();
                break;
        }
    }

    private void oddNumbers() {
        msg.clearConsole();
        for (int i = 0; i <= 100; i += 3) {
            text.oddNumbers(i);
        }
    }

    private void pairNumbers() {
        msg.clearConsole();
        for (int i = 0; i <= 100; i += 2) {
            text.pairNumbers(i);
        }
    }

    private void bothNumbers() {
        msg.clearConsole();
        for (int i = 0; i <= 100; i += 3) {
            text.oddNumbers(i);
        }
        for (int i = 0; i <= 100; i += 2) {
            text.pairNumbers(i);
        }
    }
}
