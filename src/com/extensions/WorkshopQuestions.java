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
    public void fourthPoint(){
        clearConsole();
        System.out.println("                EJERCICIO #4");
        System.out.println("      ELABORADO POR DANIEL CASTAÑO MERIDA");
        lineBreak();
        System.out.println("Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA.\nEl IVA sera una constante que sera del 21%.");
        lineBreak();
        pressAnyKeyToContinue();
    }
    public void fifthPoint(){
        clearConsole();
        System.out.println("                EJERCICIO #5");
        System.out.println("      ELABORADO POR DANIEL CASTAÑO MERIDA");
        lineBreak();
        System.out.println("Muestra los números impares y pares del 1 al 100 (ambos incluidos).\nUsa un bucle while.");
        lineBreak();
        pressAnyKeyToContinue();
    }
    public void sixthPoint(){
        clearConsole();
        System.out.println("                EJERCICIO #6");
        System.out.println("      ELABORADO POR DANIEL CASTAÑO MERIDA");
        lineBreak();
        System.out.println("Muestra los números impares y pares del 1 al 100 (ambos incluidos).\nRealiza el ejercicio anterior usando un ciclo for.");
        lineBreak();
        pressAnyKeyToContinue();
    }
    public void seventhPoint(){
        clearConsole();
        System.out.println("                EJERCICIO #7");
        System.out.println("      ELABORADO POR DANIEL CASTAÑO MERIDA");
        lineBreak();
        System.out.println("Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a pedir (do while), después muestra ese número por consola.");
        lineBreak();
        pressAnyKeyToContinue();
    }
    public void eighthPoint(){
        clearConsole();
        System.out.println("                EJERCICIO #8");
        System.out.println("      ELABORADO POR DANIEL CASTAÑO MERIDA");
        lineBreak();
        System.out.println("Crea una aplicación por consola que nos pida un día de la semana y que nos diga si es un día laboral o no.\n Usa un switch para ello.");
        lineBreak();
        pressAnyKeyToContinue();
    }
    public void ninthPoint(){
        clearConsole();
        System.out.println("                EJERCICIO #9");
        System.out.println("      ELABORADO POR DANIEL CASTAÑO MERIDA");
        lineBreak();
        System.out.println("Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza todas las a del String anterior por una e, adicionalmente concatenar a esta frase una adicional que ustedes quieran incluir por consola y las muestre luego unidas.");
        lineBreak();
        pressAnyKeyToContinue();
    }
    public void tenthPoint(){
        clearConsole();
        System.out.println("                EJERCICIO #10");
        System.out.println("      ELABORADO POR DANIEL CASTAÑO MERIDA");
        lineBreak();
        System.out.println("Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.");
        lineBreak();
        pressAnyKeyToContinue();
    }
    public void eleventhPoint(){
        clearConsole();
        System.out.println("                EJERCICIO #11");
        System.out.println("      ELABORADO POR DANIEL CASTAÑO MERIDA");
        lineBreak();
        System.out.println("Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola, indicar cual es la longitud de esta frase, adicionalmente cuantas vocales tiene de “a,e,i,o,u”.");
        lineBreak();
        pressAnyKeyToContinue();
    }
    public void twelfthPoint(){
        clearConsole();
        System.out.println("                EJERCICIO #12");
        System.out.println("      ELABORADO POR DANIEL CASTAÑO MERIDA");
        lineBreak();
        System.out.println("Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.");
        lineBreak();
        pressAnyKeyToContinue();
    }
    public void thirteenthPoint(){
        clearConsole();
        System.out.println("                EJERCICIO #13");
        System.out.println("      ELABORADO POR DANIEL CASTAÑO MERIDA");
        lineBreak();
        System.out.println("Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)");
        lineBreak();
        pressAnyKeyToContinue();
    }
    public void fourteenthPoint(){
        clearConsole();
        System.out.println("                EJERCICIO #14");
        System.out.println("      ELABORADO POR DANIEL CASTAÑO MERIDA");
        lineBreak();
        System.out.println("Crear un programa que pida un numero por teclado y que imprima por pantalla los números desde el numero introducido hasta 1000 con saldos de 2 en 2.");
        lineBreak();
        pressAnyKeyToContinue();
    }
    public void fifteenthPoint(){
        clearConsole();
        System.out.println("                EJERCICIO #15");
        System.out.println("      ELABORADO POR DANIEL CASTAÑO MERIDA");
        lineBreak();
        System.out.println("Hacer un programa que muestre el siguiente menú de opciones\n" +
                "****** GESTION CINEMATOGRÁFICA ********\n" +
                "1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6- VER PELICULAS DE LOS ACTORES\n" +
                "\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR\n" +
                "EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE UNA DE LAS CINCO OPCIONES DEBE SEGUIR MOSTRADO EL MENU Y SI EL USUARIO DIGITA UN NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE \" OPCION INCORRECTO\". Y MOSTRAR EL MENU NUEVAMENTE.\n" +
                "PISTA: CONVINAR SWICHT Y ALGUNO DE LOS BUCLES.\n");
        lineBreak();
        pressAnyKeyToContinue();
    }
    public void sixteenthPoint(){
        clearConsole();
        System.out.println("                EJERCICIO #16");
        System.out.println("      ELABORADO POR DANIEL CASTAÑO MERIDA");
        lineBreak();
        System.out.println("");
        lineBreak();
        pressAnyKeyToContinue();
    }
    public void seventeenthPoint(){
        clearConsole();
        System.out.println("                EJERCICIO #17");
        System.out.println("      ELABORADO POR DANIEL CASTAÑO MERIDA");
        lineBreak();
        System.out.println("");
        lineBreak();
        pressAnyKeyToContinue();
    }
    public void eighteenthPoint(){
        clearConsole();
        System.out.println("                EJERCICIO #18");
        System.out.println("      ELABORADO POR DANIEL CASTAÑO MERIDA");
        lineBreak();
        System.out.println("");
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
