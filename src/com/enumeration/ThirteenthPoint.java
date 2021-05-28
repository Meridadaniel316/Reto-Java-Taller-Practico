package com.enumeration;

import com.extensions.ExtensionsMessage;
import com.extensions.Messages;
import com.extensions.WorkshopQuestions;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Scanner;

public class ThirteenthPoint {

    private final Messages text = new Messages ();
    private final Scanner entrada = new Scanner (System.in);
    private final ExtensionsMessage msg = new ExtensionsMessage ();
    private final WorkshopQuestions presentation = new WorkshopQuestions ();

    public void start() {

        presentation.thirteenthPoint();
        try {

            Date fecha = new Date();
            DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
            System.out.println("Hora: "+hourFormat.format(fecha));
            DateFormat dateFormat = new SimpleDateFormat("dd:MM:yyyy");
            System.out.println("Fecha: "+ dateFormat.format(fecha));
            DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd:MM:yyyy");
            System.out.println("Hora y fecha: "+ hourdateFormat.format(fecha));

        } catch (Exception e) {
            text.errorMessage (e);
        }
        presentation.finalQuestion();
    }
}
