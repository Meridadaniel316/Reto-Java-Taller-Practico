package com.extensions;

public class WorkshopQuestions extends ExtensionsMessage{

    private final Menu menu = new Menu();

    public void primerTaller() {
        clearConsole();
        System.out.println("                EJERCICIO #1");
        System.out.println("      ELABORADO POR DANIEL CASTAÑO MERIDA");
        lineBreak();
        System.out.println("Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.\nSi son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.");
        lineBreak();
        pressAnyKeyToContinue();
    }

    public void preguntaFinal() {
        pressAnyKeyToContinue();
        System.out.printf("¿Desea volver a probar este programa? %n 1.Menu inicial %n 2.Salir %n");
        int probarTallerDenuevo = entrada.nextInt();
        if (probarTallerDenuevo == 1) {
            menu.programStart();
        } else {
            clearConsole();
            System.exit(0);
        }
    }
}
