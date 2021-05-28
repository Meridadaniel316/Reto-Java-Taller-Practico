package com.enumeration;

        import com.extensions.ExtensionsMessage;
        import com.extensions.Messages;
        import com.extensions.WorkshopQuestions;

        import java.util.Scanner;

public class TwelfthPoint {

    private final Messages text = new Messages();
    private final Scanner entrada = new Scanner(System.in);
    private final ExtensionsMessage msg = new ExtensionsMessage();
    private final WorkshopQuestions presentation = new WorkshopQuestions();

    public void start() {

        presentation.twelfthPoint();
        try {
            int numData = 2;
            String[] data = new String[2];

            extractData(numData, data);
            extractResponse(data);

        } catch (Exception e) {
            text.errorMessage(e);
        }
        presentation.finalQuestion();
    }

    private void extractData(int numData, String[] data) {
        System.out.printf ("Por favor ingresa %d palabras para realizar una comparación %n", numData);
        for (int i = 0; i < data.length; i++) {
            System.out.printf ("Dato %d: ", i + 1);
            data[i] = entrada.nextLine();
        }
    }
    private void extractResponse(String[] data) {
        msg.clearConsole();
        if (data[0].equals(data[1])){
            System.out.println ("La palabra "+data[0]+" y "+data[1]+" son iguales");
        }else {
            System.out.println ("La palabra "+data[0]+" y "+data[1]+" son diferentes");
        }
        msg.lineBreak();
    }
}
