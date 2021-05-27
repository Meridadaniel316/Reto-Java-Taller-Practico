package com.extensions;

public class Menu {

    private final ExtensionsMessage msg = new ExtensionsMessage();
    private final Errors error = new Errors();
    private final Messages text = new Messages();

    boolean Repeat = false;

    public void programStart() {
        String seleccion = presentationOfWorkshop(this.Repeat);

        switch (seleccion) {
            case "1": {
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
}
