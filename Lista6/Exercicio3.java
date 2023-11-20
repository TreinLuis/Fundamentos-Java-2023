package Lista6;

import java.util.Scanner;

/*
Implemente um programa que leia dois valores inteiros e positivos: a e b.
A seguir, o programa deve preencher um vetor com os valores pares entre
a e b. Escreva o vetor criado.
 */
public class Exercicio3 {
    public static void main(String[] args) {
        int valorA = leValor();
        int valorB = leValor();
        System.out.println("Agora observe um vetor com todos os valores inteiros no intervalo dos número que você digitou!!!!");
        criaVetor(valorA,valorB);
    }
    public static int leValor(){
        Scanner in = new Scanner(System.in);
        int valor;
        System.out.println("Digite um valor inteiro e positivo");
        valor = in.nextInt();
        if(valor <=0){
            do{
                System.out.println("Digite um valor INTEIRO e POSITIVO seu animal: ");
                valor = in.nextInt();
            }while(valor <=0);
        }
        return valor;
    }
    public static void criaVetor(int valorA, int valorB){
        int tamanhoVetor = Math.abs(valorA - valorB);
        int[] vetor = new int[tamanhoVetor+1];
        int inicia = 0;

        if(valorA > valorB){
            vetor[0] = valorB;
            System.out.println(vetor[0]);
            for(int i = 1; i<=tamanhoVetor;i++){
                vetor[i] = valorB+i;
                System.out.println(vetor[i]);
            }

        }else if(valorB > valorA){
            vetor[0] = valorA;
            System.out.println(vetor[0]);
            for(int i = 1; i<=tamanhoVetor;i++){
                vetor[i] = valorA+i;
                System.out.println(vetor[i]);
            }
        }
    }
}
