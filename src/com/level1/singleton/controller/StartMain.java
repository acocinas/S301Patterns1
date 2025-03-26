package com.level1.singleton.controller;

import com.level1.singleton.model.LogicSwitch;

import java.util.Scanner;

public class StartMain {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        String option, command;
        LogicSwitch logic = new LogicSwitch();
        while (true) {
            System.out.println("\nElige la opción que deseas con el 1,2,3 o 4 "
                    + "\n1.Añadir comandos" +
                    "\n2.Eliminar último comando" +
                    "\n3.Listar comandos" +
                    "\n4.Salir\n");
            option = scanner.nextLine();
            switch (option) {
                case "1":
                    System.out.println("Introduce un comando: ");
                    command = scanner.nextLine();
                    logic.addCommand(command);
                    break;
                case "2":
                    logic.deleteCommand();
                    break;
                case "3":
                    logic.listCommand();
                    break;
                case "4":
                    System.out.println("Hasta pronto...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Elige una opción válida, 1,2,3 o 4. Inténtalo de nuevo");
            }
        }
    }
}
