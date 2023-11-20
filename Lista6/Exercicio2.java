package Lista6;

import java.util.Scanner;

/*
Escreva um programa que leia 30 valores reais, todos pertencentes ao
intervalo [0;10], calcule a média aritmética desses valores e o seu desvio
padrão (fórmula abaixo). Os valores devem ser inseridos em um vetor.
 */
public class Exercicio2 {
    public static void main(String[] args) {
        double vetor[], media,desvio;
        vetor = leVetor();

        media = mediaAritmetica(vetor);
        System.out.println("A média dos valores que você digitou é de " + media);

        desvio = desvioPadrao(vetor,media);
        System.out.println("O desvio padrão destes vbalores é de "+ desvio);
    }
    public static double[] leVetor(){
        Scanner in = new Scanner(System.in);
        double[] vetorA = new double[30];

        System.out.println("Digite valores reais entre 0 e 10");
        for(int i = 0;i<30;i++){
            do{
                System.out.println("Digite o valor:");
                vetorA[i] = in.nextDouble();
            }while(vetorA[i]<=0 || vetorA[i]>=10);
            System.out.println("Valor salvo");
        }
        return vetorA;
    }
    public static double mediaAritmetica(double[] vetorA){
        double  media =0;
        for (int i=0;i<30;i++){
            media += vetorA[i];
        }
        return media/30;
    }
    public static double desvioPadrao(double[] vetorA, double media){
        double desvio = 0;
        for(int i=0; i<30; i++){
            desvio += Math.pow(vetorA[i] - media, 2);
        }
        return desvio = Math.sqrt(desvio/29);
    }

}
