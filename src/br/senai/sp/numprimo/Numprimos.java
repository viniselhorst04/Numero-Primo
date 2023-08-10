package br.senai.sp.numprimo;

import java.util.Scanner;

public class Numprimos {

    public static void main(String[] args) {

        int numprimo = 1;

        Scanner teclado = new Scanner(System.in);



        while (numprimo%2 != 0){
            System.out.print("Digite um número: ");
            if (teclado.hasNextInt()){
                numprimo = teclado.nextInt();

            }else {
                System.out.println("Digite um Número Inteiro!!");
                teclado.next();
            }


        }


    }


}
