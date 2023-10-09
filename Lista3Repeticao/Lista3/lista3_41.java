package Lista3;/*Faça um programa que lê uma frase e escreve a primeira e a última letra
dessa frase.
*/

import java.util.Scanner;

public class lista3_41 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String frase = "";

        //Receba R = new Receba();
        System.out.println(" Digite Frase");
        frase = in.nextLine();
        char primeira = frase.charAt(0);

        System.out.println("Primeira Letra da Frase: " + primeira);
        System.out.println("Última Letra da Frase: " + frase.substring(frase.length() - 1 ));

    }
}