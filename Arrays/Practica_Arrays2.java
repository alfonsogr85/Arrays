package Practicas.constantes.Arrays;

public class Practica_Arrays2 {
    public static void main(String[] args) {

        String [] paises = new String[8];

        paises [0] = "España";
        paises [1] = "Mexico";
        paises [2] = "Colombia";
        paises [3] = "Chile";
        paises [4] = "Portugal";
        paises [5] = "Ecuador";
        paises [6] = "Italia";
        paises [7] = "Alemania";

        /*  String [] paises = {"España","mexico","colombia"....}
        for (int i = 0; i< paises.length; i++){

            System.out.println("El pais "+ (i+1) +" " + paises[i]);

        }*/
        /*bucle for each o mejorado, muy util para arrays*/
        for (String elemento:paises){

            System.out.println("pais: " + elemento);

        }
    }
}
