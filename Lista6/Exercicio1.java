package Lista6;

import java.util.Scanner;

/*
Faça um programa que leia um vetor A com 10 valores inteiros, todos
positivos. A seguir, o programa deve escrever:
(a) os valores impares de A.
(b) os valores das posições impares de A.
(c) os valores impares de A que estão em posições pares.
(d) o vetor A na ordem inversa.

 */
public class Exercicio1 {
    public static void main(String args[]){
        int[] vetorA;

        vetorA = leValor();

        System.out.println("Segue os valores impares que você digitou");
        impares(vetorA);
        imparesEmPosicoesPares(vetorA);
        inversa(vetorA);
    }
    public static int[] leValor(){
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];
        System.out.println("Olá!!\nVamos escolher os 10 valores!");
        for(int i=0;i<10;i++){
            do{
                System.out.println("Digite um valor real e positivo");
                vetor[i] = in.nextInt();
            }while(vetor[i]<=0);
            System.out.println("Valor salvo!");
        }
        return vetor;
    }
    public static void impares(int[] vetor){
        int[] impares = new int[10];
        int j = 0;
        for (int i = 0;i<10;i++){
            if(vetor[i] %2 != 0){
            impares[j] = vetor[i];
            j++;
            }
        }
        for(int i=0;i<10;i++){
            if(impares[i] != 0){
                System.out.println(impares[i]);
            }
        }
    }
    public static void posicaoImpares(int[] vetorA){
        System.out.println("Segue os valores das posições impares!!");
        for (int i=0;i<10;i++){
            if(i%2 != 0){
                System.out.println("O valor da posição "+ i +" é "+ vetorA[i]);
            }
        }

    }
    public static void imparesEmPosicoesPares(int vetorA[]){
        System.out.println("Segue os valores impares em posições pares!!");
        for (int i=0;i<10;i++){
            if(i%2 == 0){
                if(vetorA[i]%2 == 1) {
                    System.out.println("O valor da posição " + i + " é " + vetorA[i]);
                }
            }
        }
    }
    public static void inversa(int[] vetorA){
        System.out.println("O vetor na ordem inversa é ");
        for(int i = 9; i>=0;i--){
            System.out.println(vetorA[i]);
        }
    }

}



