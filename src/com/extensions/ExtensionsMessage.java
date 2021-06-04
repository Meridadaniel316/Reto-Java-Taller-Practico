package com.extensions;

import java.util.*;

public class ExtensionsMessage {

    Scanner entrada = new Scanner(System.in);

    public int obtainInt(String message) {
        boolean loop = true;
        int valor=0;
        String teclado;

        do {
            try {
                System.out.println(message);
                teclado = entrada.nextLine();
                valor = Integer.parseInt(teclado);
                loop = false;
            } catch (Exception e) {
                errorSystemCmd ();
                lineBreak ();
                System.out.println("El valor introducido debe ser entero para continuar.");
                lineBreak ();
            }
        } while (loop);
        return valor;
    }

    public float obtainFloat(String message) {
        boolean loop = true;
        float valor=0;
        String teclado;

        do {
            try {
                System.out.println(message);
                teclado = entrada.nextLine();
                valor = Float.parseFloat(teclado);
                loop = false;
            } catch (Exception e) {
                errorSystemCmd ();
                lineBreak ();
                System.out.println("El valor introducido debe ser un decimal para continuar.");
                lineBreak ();
            }
        } while (loop);
        return valor;
    }

    public String obtainString(String message) {
        System.out.println(message);
        return entrada.nextLine();
    }

    public void pressAnyKeyToContinue() {
        System.out.println("<<<Presione ENTER para continuar>>>");
        try {
            entrada.nextLine();
        } catch (Exception ignored) {
        }
        clearConsole();
    }

    public void clearConsole() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }


    public void lineBreak() {
        System.out.println("———————————————————————————————————————————————————————————————");
    }

    public void errorSystemCmd() {
        clearConsole();
        System.out.print("\n" +
                "░░░░░░░▄█▄▄▄█▄░░░░░░░\n" +
                "▄▀░░░░▄▌─▄─▄─▐▄░░░░▀▄\n" +
                "█▄▄█░░▀▌─▀─▀─▐▀░░█▄▄█   E R R O R   I N   T H E   S Y S T E M\n" +
                "░▐▌░░░░▀▀███▀▀░░░░▐▌\n" +
                "████░▄█████████▄░████\n");
    }

    public void pictureCar() {
        System.out.print("\n" +
                "            ──────────▄▌▐▀▀▀▀▀▀▀▀▀▀▀▀▌──────\n" +
                "          ─────────▄▄██▌█░░░░░░░░░░░░▐─────\n" +
                "           ─────▄▄▄▌▐██▌█░░░░░░░░░░░░▐──────\n" +
                "          ──────███████▌█▄▄▄▄▄▄▄▄▄▄▄▄▌────\n" +
                "          ──────▀❍▀▀▀▀▀▀▀❍❍▀▀▀▀▀▀❍❍▀──────\n");
    }

}