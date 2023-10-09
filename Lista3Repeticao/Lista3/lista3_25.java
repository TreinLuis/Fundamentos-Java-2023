package Lista3;/*
Faça um programa que leia uma quantidade não determinada de números
positivos. Calcule a quantidade de números pares e ímpares, a média de
valores pares e a média geral dos números lidos. O número que encerrará
a leitura será zero.

 */

import java.util.*;
public class lista3_25 {
    public static void main(String[] args) {

        int encerrar = 1, impares=0 , pares=0,cont=0,somaPares=0,somaImpares=0,somaValor=0;

        Scanner in = new Scanner(System.in);

        int valor = 0;

        while (encerrar != 0){
            System.out.println("Digite um valor: ");
            valor = in.nextInt();
            somaValor += valor;
            if(valor%2==0){
                somaPares += valor;
                pares += 1;
            }else if (valor%2!=0) {
                somaImpares += valor;
                impares++;
            }

            cont++;

            System.out.println("Para ecerrar o programa digite 0: ");
            encerrar = in.nextInt();
        }
        System.out.println("Você digitou "+ impares + " números impares");

        System.out.println("Você digitou  "+ pares + " números pares");
        if(pares >= 1) {
            System.out.println("Está é a média de valores pares: " + somaPares / pares);
        }else
            System.out.println("Você não digitou valores pares");

        System.out.println("A média geral dos valors que você digitou foi de : " + somaValor/cont);
    }
}
