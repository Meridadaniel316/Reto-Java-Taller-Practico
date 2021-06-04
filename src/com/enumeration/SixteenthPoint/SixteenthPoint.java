package com.enumeration.SixteenthPoint;

import com.extensions.ExtensionsMessage;
import com.extensions.Messages;
import com.extensions.WorkshopQuestions;

public class SixteenthPoint {

    private final Messages text = new Messages ();
    private final ExtensionsMessage msg = new ExtensionsMessage ();
    private final WorkshopQuestions presentation = new WorkshopQuestions ();

    public void start() {

        presentation.sixteenthPoint ();
        try {

            extractPersonsData ();

        } catch (Exception e) {
            text.errorMessage (e);
        }
        presentation.finalQuestion ();
    }

    private void extractPersonsData() {

        System.out.println (text.textsSixteenthPoint[0]);
        msg.lineBreak ();
        String nombre = text.getPersonalName ();
        int edad = text.getOldPerson (nombre);
        String sexo = text.getPersonGender (nombre);
        int peso = text.getWeightPerson (nombre);
        float altura = text.getHeightPerson (nombre);

        printPersonalData (nombre, edad, sexo, peso, altura);
    }

    private void printPersonalData(String nombre, int edad, String sexo, int peso, float altura) {
        msg.clearConsole ();

        msg.lineBreak ();
        Persona p1 = new Persona ();
        System.out.println (text.textsSixteenthPoint[1]);
        msg.lineBreak ();
        text.extractPersonsData (p1);

        Persona p2 = new Persona (nombre, edad, sexo);
        System.out.println (text.textsSixteenthPoint[2]);
        msg.lineBreak ();
        text.extractPersonsData (p2);

        Persona p3 = new Persona (nombre, edad, sexo, peso, altura);
        System.out.println (text.textsSixteenthPoint[3]);
        msg.lineBreak ();
        text.extractPersonsData (p3);

    }
}
