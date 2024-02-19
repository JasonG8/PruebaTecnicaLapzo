package utils.constantes;

import java.util.Random;

public class UsuarioAleatorio {

    //Metodo para generar un nombre aleatorio
    public static String generarNombreAleatorio() {
        String nombreAleatorio = null;

        String[] nombres = {"Rosa", "Maria", "Brandon", "Cindy", "David", "Pepe", "Brayan", "Juan",
                "Brenda", "Luis", "Rafaela", "Andres", "Andrea", "Felipe", "Rogelio", "Duban", "Adriana",
                "Catalina", "Karina", "Emilio"};

        for (int i = 0; i < 1; i++) {
            nombreAleatorio = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) + 1)))];
        }
        return nombreAleatorio;
    }


}