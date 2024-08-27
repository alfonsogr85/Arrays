package Practicas.constantes.Arrays;

public class Practica_Arrays_Bi {
    public static void main(String[] args) {

        int [][] numbers= new int[4][5];

        numbers[0][0]=15;
        numbers[0][1]=21;
        numbers[0][2]=18;
        numbers[0][3]=9;
        numbers[0][4]=15;

        numbers[1][0]=10;
        numbers[1][1]=52;
        numbers[1][2]=17;
        numbers[1][3]=19;
        numbers[1][4]=7;

        numbers[2][0]=19;
        numbers[2][1]=2;
        numbers[2][2]=19;
        numbers[2][3]=17;
        numbers[2][4]=7;

        numbers[3][0]=92;
        numbers[3][1]=13;
        numbers[3][2]=13;
        numbers[3][3]=32;
        numbers[3][4]=41;


        /*bucles anidados*/
        for (int i = 0; i < 4 ; i++) {

            System.out.println();

            for (int j = 0; j<5 ; j++) {

                System.out.print(numbers[i][j] + " ");


            }

        }





    }
}
