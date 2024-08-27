package Practicas.constantes.Arrays;

public class Practica_Arrays_Bi2 {
    public static void main(String[] args) {

       /*String myMatrix[][] = {
            {"pedro", "barcelona"},
            {"juan", "madrid"},
            {"andres", "malaga"},
            {"luis", "sevilla"}
        };

        System.out.println(myMatrix[1][0]);*/

        int [][] matrix={
                {10,15,18,19,21},
                {5,25,37,41,15},
                {7,19,32,14,90},
                {85,2,7,40,27}
        };

        for (int[]fila:matrix){
            System.out.println();
            for (int z:fila){
                System.out.print(z + " ");
            }
        }

    }
}
