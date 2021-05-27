package com.extensions;

public class WorkshopQuestions extends ExtensionsMessage{

    private final Menu menu = new Menu();

    public void firstPoint() {
        clearConsole();
        System.out.println("                EJERCICIO #1");
        System.out.println("      ELABORADO POR DANIEL CASTAÑO MERIDA");
        lineBreak();
        System.out.println("Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.\nSi son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.");
        lineBreak();
        pressAnyKeyToContinue();
    }
    public void secondPoint() {
        clearConsole();
        System.out.println("                EJERCICIO #2");
        System.out.println("      ELABORADO POR DANIEL CASTAÑO MERIDA");
        lineBreak();
        System.out.println("Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.\nSi son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.");
        lineBreak();
        System.out.println("Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores, menores o iguales.");
        lineBreak();
        pressAnyKeyToContinue();
    }
    public void thirdPoint() {
        clearConsole();
        System.out.println("                 EJERCICIO #3");
        System.out.println("      ELABORADO POR DANIEL CASTAÑO MERIDA");
        lineBreak();
        System.out.println("Haz una aplicación que calcule el área de un círculo(pi*R2).El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).\nUsa la constante PI y el método pow de Math.");
        lineBreak();
        pressAnyKeyToContinue();
    }

    public void finalQuestion() {
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
