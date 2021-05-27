package com.extensions;

public class Menu {

    private final ExtensionsMessage msg = new ExtensionsMessage();
    boolean Repeat = false;

    public void inicioPrograma() {
        String seleccion = presentacionTaller(Repeat);

        switch (seleccion) {
            case "1": {
                System.out.printf("Prueba primer punto");
                break;
            }
            default: {
                Repeat = true;
                inicioPrograma();
                break;
            }
        }
    }

    private String presentacionTaller(boolean Repeat) {

        msg.clearConsole();

        if (Repeat) {
            msg.errorSystemCmd();
        } else {
            msg.pictureCar();
            msg.lineaSalto();
            System.out.printf("¡Hola, bienvenido a mi sistema!%n");
            msg.lineaSalto();
        }
        System.out.printf("Este taller cuenta con un total de 18 ejercicios%nDigita del 1 al 18 dependiendo del ejercicio que quieras ver%n");
        return msg.entrada.nextLine();
    }
}
