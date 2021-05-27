package com.extensions;

import java.util.*;

public class ExtensionsMessage {

    Scanner entrada = new Scanner(System.in);

    public void pressAnyKeyToContinue()
    {
        System.out.println("<<<Presione ENTER para continuar>>>");
        try
        {
            entrada.nextLine();
        }
        catch(Exception ignored) {}
        clearConsole();
    }

    public void clearConsole()
    {
        for (int i=0; i < 30; i++)

        {
            System.out.println();
        }
    }
    public void lineaSalto() {
        System.out.println("———————————————————————————————————————————————————————————————");
    }

    public void errorSystemCmd()
    {
        clearConsole();
        System.out.printf("%n " +
                "███████╗██████╗░██████╗░░█████╗░██████╗░ %n " +
                "██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔══██╗ %n " +
                "█████╗░░██████╔╝██████╔╝██║░░██║██████╔╝ %n " +
                "██╔══╝░░██╔══██╗██╔══██╗██║░░██║██╔══██╗ %n " +
                "███████╗██║░░██║██║░░██║╚█████╔╝██║░░██║ %n " +
                "╚══════╝╚═╝░░╚═╝╚═╝░░╚═╝░╚════╝░╚═╝░░╚═╝ %n");
        lineaSalto();
        System.out.printf("Has seleccionado una respuesta incorrecta.%nIntenta nuevamente =) %n");
        lineaSalto();
    }

    public void pictureCar(){
        System.out.print("\n" +
                "            ──────────▄▌▐▀▀▀▀▀▀▀▀▀▀▀▀▌──────\n" +
                "          ─────────▄▄██▌█░░░░░░░░░░░░▐─────\n" +
                "           ─────▄▄▄▌▐██▌█░░░░░░░░░░░░▐──────\n" +
                "          ──────███████▌█▄▄▄▄▄▄▄▄▄▄▄▄▌────\n" +
                "          ──────▀❍▀▀▀▀▀▀▀❍❍▀▀▀▀▀▀❍❍▀──────\n");
    }

    public void pictureResult(){
        System.out.print("\n" +
                "┏━━━┳━━━┳━━━┳┓╋┏┳┓╋┏━━━━┳━━━┳━━━┳━━━┓\n" +
                "┃┏━┓┃┏━━┫┏━┓┃┃╋┃┃┃╋┃┏┓┏┓┃┏━┓┣┓┏┓┃┏━┓┃\n" +
                "┃┗━┛┃┗━━┫┗━━┫┃╋┃┃┃╋┗┛┃┃┗┫┃╋┃┃┃┃┃┃┃╋┃┃\n" +
                "┃┏┓┏┫┏━━┻━━┓┃┃╋┃┃┃╋┏┓┃┃╋┃┗━┛┃┃┃┃┃┃╋┃┃\n" +
                "┃┃┃┗┫┗━━┫┗━┛┃┗━┛┃┗━┛┃┃┃╋┃┏━┓┣┛┗┛┃┗━┛┃\n" +
                "┗┛┗━┻━━━┻━━━┻━━━┻━━━┛┗┛╋┗┛╋┗┻━━━┻━━━┛\n");
    }

}