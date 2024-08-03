package org.example;

import java.util.Scanner;

public class Ingresos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el día de la semana (ej. Lunes, Martes, etc.): ");
        String diaSemana = scanner.next();

        int precio = calcularPrecioEntrada(edad, diaSemana);

        if (precio == -1) {
            System.out.println("Edad fuera de rango o no válida.");
        } else {
            System.out.println("El precio de la entrada es: $" + precio);
        }

        scanner.close();
    }

    public static int calcularPrecioEntrada(int edad, String diaSemana) {
        if (edad <= 0 || edad > 100) {
            return -1;
        } else if (edad <= 12) {
            return 15000;
        } else if (edad >= 61) {
            return 20000;
        } else {
            if (diaSemana.equalsIgnoreCase("Lunes")) {
                return 25000;
            } else {
                return 30000;
            }
        }
    }
}

