package Lista6;

import java.util.Scanner;

/*
Faça um programa que leia uma matriz A(7,6) e escreve a soma dos elementos soma dos elementos da linha 5 e da coluna 3. A leitura e as somas
devem ser feitas por métodos.

 */
public class Exercicio36 {
    public static void main(String[] args) {
        int[][] matrizA = leMatriz();
        int somaDaMatriz = soma(matrizA);
        System.out.println(somaDaMatriz);
    }
    public static int[][] leMatriz(){
        Scanner in = new Scanner(System.in);
        int valor = 0;
        int matriz[][] = new int[7][6];

        for(int linha = 0;linha<7;linha++){
            for(int coluna = 0;coluna<6;coluna++){
                System.out.println("Digite um inteiro na posição ["+linha+","+coluna+"]:");
                valor = in.nextInt();
                matriz[linha][coluna] = valor;
            }
        }
        return matriz;
    }
    public static int soma(int[][] matrizA){
        int somaDaMatriz = 0;
        for(int linha = 0;linha<7;linha++){
            for(int coluna = 0;coluna<6;coluna++){
                if(linha == 5 || coluna ==3){
                    somaDaMatriz += matrizA[linha][coluna];
                }
            }
        }
        return somaDaMatriz;
    }
}
