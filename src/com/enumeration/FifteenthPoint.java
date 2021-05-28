package com.enumeration;

import com.extensions.ExtensionsMessage;
import com.extensions.Messages;
import com.extensions.Errors;
import com.extensions.WorkshopQuestions;

import java.util.Scanner;

public class FifteenthPoint {

    private final Errors error = new Errors ();
    private final Messages text = new Messages ();
    private final Scanner entrada = new Scanner (System.in);
    private final ExtensionsMessage msg = new ExtensionsMessage ();
    private final WorkshopQuestions presentation = new WorkshopQuestions ();

    private boolean Repeat = false;

    public void start() {
        presentation.fifteenthPoint ();
        try {
            startMenu ();

        } catch (Exception e) {
            text.errorMessage (e);
        }
        startMenu ();
    }

    private void startMenu() {
        String seleccion = presentationOfMenu (this.Repeat);
        switch (seleccion) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
                System.out.println ("Este sistema se podría anexar con el sistema de facturación trabajado anteriormente\nhttps://github.com/Meridadaniel316/taller-practico");
                msg.pressAnyKeyToContinue ();
                startMenu();
                break;
            case "8":
                presentation.finalQuestion ();
                break;
            default: {
                this.Repeat = true;
                startMenu ();
                break;
            }
        } 
    }

    private String presentationOfMenu(boolean Repeat) {
        msg.clearConsole ();
        if (Repeat) {
            msg.errorSystemCmd ();
            error.cmdErrorExecution ();
        }
        text.menuOptions ();
        return entrada.nextLine ();
    }


}
