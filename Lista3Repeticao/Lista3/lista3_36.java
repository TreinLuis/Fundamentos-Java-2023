package Lista3;/*
Escreva um programa que gera e escreve os 5 primeiros números perfeitos.
Um número perfeito é aquele que é igual a soma dos seus divisores, excluindo a si próprio como divisor.
(Ex.: 6 = 1+2+3; 28= 1+2+4+7+14
etc).
SORA EXPLICA

 */
import java.util.*;

public class lista3_36 {
    public static void main (String[] args){
        System.out.println("Este programa calcula e exibe os cinco primeiros números perfeitos.");

        int quantEncontrada = 0;
        long valTestado = 0;
        long divisor = 1;

        long somaDivisores = 0;

        do{
            valTestado++; // incremento
            divisor = 1; // reiniciar o valor do divisor
            somaDivisores = 0; // reiniciar a soma dos divisores

            // descobrir os divisores e soma-los, excluindo o valor em si
            do{
                if (valTestado % divisor == 0 && valTestado != 1) // segunda parte porque a soma dos divisores de 1 (um) deve ser 0
                    somaDivisores += divisor;

                divisor++;
            } while (divisor < valTestado);

            if (somaDivisores == valTestado){
                System.out.println("Achei um número perfeito: " + valTestado + ".");
                quantEncontrada++;
            }
        } while (quantEncontrada < 5);

        System.out.println("\nFIM DO PROGRAMA.");
    }

}

