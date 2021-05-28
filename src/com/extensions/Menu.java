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
            case "1":
                firstPoint();
                break;
            case "2":
                secondPoint();
                break;
            case "3":
                thirdPoint();
                break;
            case "4":
                fourthPoint();
                break;
            case "5":
                fifthPoint();
                break;
            case "6":
                sixthPoint();
                break;
            case "7":
                seventhPoint();
                break;
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
        FirstPoint workshop = new FirstPoint();
        workshop.start();
    }
    private void secondPoint() {
        SecondPoint workshop = new SecondPoint();
        workshop.start();
    }
    private void thirdPoint() {
        ThirdPoint workshop = new ThirdPoint();
        workshop.start();
    }
    private void fourthPoint() {
        FourthPoint workshop = new FourthPoint();
        workshop.start();
    }
    private void fifthPoint(){
        FifthPoint workshop = new FifthPoint();
        workshop.start();
    }
    private void sixthPoint(){
        SixthPoint workshop = new SixthPoint();
        workshop.start();
    }
    private void seventhPoint(){
        SeventhPoint workshop = new SeventhPoint();
        workshop.start();
    }
}
