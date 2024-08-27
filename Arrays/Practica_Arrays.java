package Practicas.constantes.Arrays;

public class Practica_Arrays {
    public static void main(String[] args) {

        /*int[] mi_matriz = new int[5];

        mi_matriz [0] =5;
        mi_matriz [1] =38;
        mi_matriz [2] =-15;
        mi_matriz [3] =92;
        mi_matriz [4] =71;

        esto es igual a decir:



        for (int i=0; i<5; i++){

            System.out.println(mi_matriz[i]);
        }*/

        int[] mi_matriz = {5, 38, -15, 92, 71, 85, 95, 25, 14, 45, 26, 47, 18, 4};

        for (int i = 0; i < mi_matriz.length ; i++) {

            System.out.println("Valor indice " + i + " pertenece al numero : " + mi_matriz[i]);
        }
    }
}