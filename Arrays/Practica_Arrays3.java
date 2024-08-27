package Practicas.constantes.Arrays;

import javax.swing.*;

public class Practica_Arrays3 {
    public static void main(String[] args) {

        String []  paises = new String[8];

        for (int i=0; i<8; i++){

            paises[i]=JOptionPane.showInputDialog("Introduce el nombre del pais " + (i+1));

        }

        for (String elemento:paises){

            System.out.println("Pais: " + elemento);

        }

    }
}
