package org.example;

import java.util.Scanner;

public class Notificaciones{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de notificaciones");
        int notificaciones = scanner.nextInt();

        String mensaje = cantidadDeNotificaciones(notificaciones);
        System.out.println(mensaje);

        scanner.close();


    }
    public static String cantidadDeNotificaciones(int numNotifcaciones) {
        if(numNotifcaciones < 100) {
            return "recibiste " + numNotifcaciones + " notificaciones";
        }else{
            return "recibiste 99+";
        }
    }
}