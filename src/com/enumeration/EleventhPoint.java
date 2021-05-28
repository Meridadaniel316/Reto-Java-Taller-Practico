package com.enumeration;

import com.extensions.Messages;
import com.extensions.WorkshopQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EleventhPoint {

    private final Messages text = new Messages();
    private final WorkshopQuestions presentation = new WorkshopQuestions();
    private final InputStreamReader in = new InputStreamReader(System.in);
    private final BufferedReader buffer = new BufferedReader(in);

    public void start() {

        presentation.eleventhPoint();
        try {

            extractVowelsAndLetters ();

        } catch (Exception e) {
            text.errorMessage(e);
        }
        presentation.finalQuestion();
    }

    private void extractVowelsAndLetters() throws IOException {

        String texto = getStringText();
        int accountantA = 0, accountantE = 0, accountantI = 0, accountantO = 0, accountantU = 0;
        for (int i = 0; i < texto.length (); i++) {

            char c = texto.charAt (i);
            if (c == 'a') {
                accountantA++;
            }
            if (c == 'e') {
                accountantE++;
            }
            if (c == 'i') {
                accountantI++;
            }
            if (c == 'o') {
                accountantO++;
            }
            if (c == 'u') {
                accountantU++;
            }

        }
        printresultText (texto, accountantA, accountantE, accountantI, accountantO, accountantU);
    }

    private String getStringText() throws IOException {
        text.printTextVowelPhrase();
        String texto = buffer.readLine();

        texto = texto.toLowerCase();
        return texto;
    }

    private void printresultText(String texto, int accountantA, int accountantE, int accountantI, int accountantO, int accountantU) {
        int quantity = texto.length();
        text.readQualityLetters(quantity, accountantA, accountantE, accountantI, accountantO, accountantU);
    }

}
