package com.extensions;

import com.enumeration.*;
import com.enumeration.SixteenthPoint.*;

public class Menu {

    private final ExtensionsMessage msg = new ExtensionsMessage();
    private final Errors error = new Errors();
    private final Messages text = new Messages();

    private boolean Repeat = false;

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
            case "8":
                eighthPoint();
                break;
            case "9":
                ninthPoint();
                break;
            case "10":
                tenthPoint();
                break;
            case "11":
                eleventhPoint();
                break;
            case "12":
                twelfthPoint();
                break;
            case "13":
                thirteenthPoint();
                break;
            case "14":
                fourteenthPoint();
                break;
            case "15":
                fifteenthPoint();
                break;
            case "16":
                sixteenthPoint ();
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
    private void eighthPoint(){
        EighthPoint workshop = new EighthPoint();
        workshop.start();
    }
    private void ninthPoint(){
        NinthPoint workshop = new NinthPoint();
        workshop.start();
    }
    private void tenthPoint(){
        TenthPoint workshop = new TenthPoint();
        workshop.start();
    }
    private void eleventhPoint(){
        EleventhPoint workshop = new EleventhPoint();
        workshop.start();
    }
    private void twelfthPoint(){
        TwelfthPoint workshop = new TwelfthPoint();
        workshop.start();
    }
    private void thirteenthPoint(){
        ThirteenthPoint workshop = new ThirteenthPoint();
        workshop.start();
    }
    private void fourteenthPoint(){
        FourteenthPoint workshop = new FourteenthPoint();
        workshop.start();
    }
    private void fifteenthPoint(){
        FifteenthPoint workshop = new FifteenthPoint();
        workshop.start();
    }
    private void sixteenthPoint(){
        SixteenthPoint workshop = new SixteenthPoint();
        workshop.start();
    }
    /*private void seventeenthPoint(){
        SeventeenthPoint workshop = new SeventeenthPoint();
        workshop.start();
    }*/
    /*private void eighteenth(){
        EighteenthPoint workshop = new EighteenthPoint();
        workshop.start();
    }*/


}
