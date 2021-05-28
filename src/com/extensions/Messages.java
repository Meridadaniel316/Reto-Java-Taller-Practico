package com.extensions;

public class Messages extends ExtensionsMessage {

    public void errorMessage(Exception e) {
        System.out.println("Error: " + e);
    }

    // MENU
    public void welcomeWorkshop() {
        pictureCar();
        lineBreak();
        System.out.printf("¡Hola, bienvenido a mi sistema!%n");
        lineBreak();
    }

    public void workshopQuestions() {
        System.out.printf("Este taller cuenta con un total de 18 ejercicios%nDigita del 1 al 18 dependiendo del ejercicio que quieras ver%n");
    }

    // PRIMER Y SEGUNDO PUNTO

    public void extractDataResponse(int[] data) {
        if (data[0] < data[1]) {
            lineBreak();
            readData(data, "La variable #2 es la de mayor valor: ", 1, "La variable #1 es la de menor valor: ", 0);
        } else if (data[0] == data[1]) {
            lineBreak();
            System.out.printf("Las dos variables tienen el mismo valor %nVariable 1: (%d) %nVariable 2: (%d) %n", data[0], data[1]);
        } else {
            lineBreak();
            readData(data, "La variable #1 es la de mayor valor: ", 0, "La variable #2 es la de menor valor: ", 1);
        }
    }

    public void readData(int[] data, String s, int i, String s2, int i2) {
        System.out.println(s + data[i]);
        System.out.println(s2 + data[i2]);
        lineBreak();
        System.out.printf("Variable 1: (%d) %nVariable 2: (%d) %n", data[0], data[1]);
    }

    // TERCER PUNTO

    public void extractCircleArea() {
        System.out.print("Introduce el radio de un Círculo: ");
    }

    public void areaResult(double area) {
        System.out.println("El área del Círculo resultante es: " + area);
    }

    // CUARTO PUNTO
    public void extractProductValue() {
        System.out.println("Ingrese un valor para el producto: ");
    }

    public void totalProduct(double total) {
        System.out.printf("El producto tiene un valor aproximado de $%.1f este valor ya cuenta con el porcentaje(21) del IVA. %n", total);
    }

    // QUINTO Y SEXTO PUNTO
    public void evenAndOddMenuQuestion() {
        System.out.println("¿Quieres ver los números pares o impares?\n1.Pares\n2.Impares\n3.Ambos");
    }

    public void evenAndOdd(int i, int j) {
        System.out.printf("Par: %d - Impar: %d %n", i, j);
    }

    public void pairNumbers(int i) {
        System.out.println("Números pares: " + i);
    }

    public void oddNumbers(int i) {
        System.out.println("Números impares: " + i);
    }

    // SEPTIMO PUNTO
    public void extractNumber() {
        System.out.println("Escribe un numero superior a 0");
    }

    public void printMessageNumber(int number) {
        lineBreak();
        System.out.println("Numero escrito: " + number);
        lineBreak();
    }

    //OCTAVO PUNTO

    public void dayOfWork(String day) {
        System.out.println("El " + day.toLowerCase() + " es un día laboral.");
    }

    public void dayOfRest(String day) {
        System.out.println("El " + day.toLowerCase() + " no es dia laboral");
    }

    public void extractDataWorkDay() {
        System.out.println("Por favor escribe el dia de la semana para validar si es laboral o no.");
    }

    public void invalidDay() {
        System.out.println("Seleccionaste un dia invalido");
    }

    //NOVENO PUNTO

    public String printTextSmile() {
        return "La sonrisa sera la mejor arma contra la tristeza";
    }

    public void printSmileQuestion() {
        System.out.println("Si desea concatenar una frase escríbala, de lo contrario apriete <<ENTER>>");
    }

    //DECIMO PUNTO
    public void printTextSpaces() {
        System.out.println("Por favor ingrese la frase a la cual le desea eliminar los espacios.");
    }

    //PUNTO ONCE
    public void printTextVowelPhrase() {
        System.out.println("Por favor ingrese una frase a la cual le quiere contar las letras y vocales.");
    }

    public void readQualityLetters(int quantity, int accountantA, int accountantE, int accountantI, int accountantO, int accountantU) {
            System.out.println("La frase tiene: "+ quantity +" Letras entre esas letras hay: \n"+accountantA+" letras A\n"+accountantE+" letras E\n"+accountantI+" letras I\n"+accountantO+" letras O\n"+accountantU+" letras U\n");
    }

    //PUNTO QUINCE

    public void menuOptions(){
        System.out.print("****** GESTION CINEMATOGRÁFICA ********\n" +
                "1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6- VER PELICULAS DE LOS ACTORES\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR\n");
        lineBreak ();
    }
}