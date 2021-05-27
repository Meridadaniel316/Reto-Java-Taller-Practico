package com.extensions;

import com.enumeration.*;

public class Menu {

    private final ExtensionsMessage msg = new ExtensionsMessage();
    private final Errors error = new Errors();
    private final Messages text = new Messages();

    boolean Repeat = false;

    public void programStart() {
        String seleccion = presentationOfWorkshop(this.Repeat);

        switch (seleccion) {
            case "1": {
                firstPoint();
                break;
            }
            default: {
                this.Repeat = true;
                programStart();
                break;
            }
        }
    }

    private String presentationOfWorkshop(boolean Repeat) {
        msg.clearConsole();
        if (Repeat) {
            msg.errorSystemCmd();
            error.cmdErrorExecution();
        } else {
            text.welcomeWorkshop();
        }
        text.workshopQuestions();
        return msg.entrada.nextLine();
    }

    private void firstPoint() {
        PrimerPunto workshop = new PrimerPunto();
        workshop.start();
    }
}
