package com.enumeration;

import com.extensions.Errors;
import com.extensions.ExtensionsMessage;
import com.extensions.Messages;
import com.extensions.WorkshopQuestions;

import java.util.Scanner;

public class FifthPoint {

    private final Errors error = new Errors();
    private final Messages text = new Messages();
    private final Scanner entrada = new Scanner(System.in);
    private final ExtensionsMessage msg = new ExtensionsMessage();
    private final WorkshopQuestions presentation = new WorkshopQuestions();

    public void start() {
        presentation.fifthPoint();
        menuSeleccion();
        menuSeleccion();
        //presentation.finalQuestion();
    }

    private void menuSeleccion() {
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
                menuSeleccion();
                break;
        }
    }

    private void oddNumbers() {
        msg.clearConsole();
        int i = 0;
        while (i <= 100)
        {
            i = getData(i, 3);
            System.out.println(+i);
        }
    }

    private void pairNumbers() {
        msg.clearConsole();
        int i = 0;
        while (i <= 100)
        {
            i = getData(i, 2);
            System.out.println(+i);
        }
    }

    private void bothNumbers() {
        msg.clearConsole();
        int i = 0;
        int j = 0;
        while (j < 100)
        {
            while (i < 100)
            {
                i = getData(i, 2);
                j = getData(j, 3);
                text.evenAndOdd(i, j);
            }
        }

    }

    private int getData(int i, int i2) {
        if (i <= 100) {
            i += i2;
        }
        return i;
    }
}
