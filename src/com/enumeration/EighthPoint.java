package com.enumeration;

import com.extensions.ExtensionsMessage;
import com.extensions.Messages;
import com.extensions.WorkshopQuestions;

import java.util.Scanner;

public class EighthPoint {

    private final Messages text = new Messages();
    private final Scanner entrada = new Scanner(System.in);
    private final ExtensionsMessage msg = new ExtensionsMessage();
    private final WorkshopQuestions presentation = new WorkshopQuestions();

    boolean workday = true;

    public void start() {
        presentation.eighthPoint();

        try {
            String day = extractDayOfWeek();
            conditionWorkDay(day);
        } catch (Exception e) {
            text.errorMessage(e);
        }
        presentation.finalQuestion();

    }

    private void conditionWorkDay(String day) {
        if (workday) {
            text.dayOfWork(day);
        } else {
            text.dayOfRest(day);
        }
    }

    private String extractDayOfWeek() {
        String day = "Null";

        text.extractDataWorkDay();
        day = entrada.nextLine();

        switch (day.toLowerCase()) {
            case "lunes": {
                dayOfRestAndWork(true);
            }
            case "martes": {
                dayOfRestAndWork(true);
                break;
            }
            case "miercoles": {
                dayOfRestAndWork(true);
            }
            case "jueves": {
                dayOfRestAndWork(true);
            }
            case "viernes": {
                dayOfRestAndWork(true);
            }
            case "sabado": {
                dayOfRestAndWork(false);
            }
            case "domingo": {
                dayOfRestAndWork(false);
            }
            default:
                msg.errorSystemCmd();
                msg.lineBreak();
                text.invalidDay();
                msg.lineBreak();
                extractDayOfWeek();
                break;
        }
        return day;
    }
    private void dayOfRestAndWork(boolean option) {
        workday = option;
    }
}
