package Lista6;
import java.util.Scanner;
/*
Faça um programa que leia um matriz A(6,6) e escreve o menor elemento
da sua diagonal secundária. A leitura e a soma devem ser feitas em métodos
 */
public class Exercicio37 {
    public static void main(String[] args) {
        int[][] matrizA = leMatriz();
        int menorValor = menorValorSecundaria(matrizA);
        System.out.println(menorValor);
    }
    public static int[][] leMatriz(){
        Scanner in = new Scanner(System.in);
        int valor = 0;
        int matriz[][] = new int[6][6];
        for(int x=0;x<6;x++) {
            for (int y = 0; y < 6; y++) {
                System.out.println("Digite um inteiro na posição [" + x + "," + y + "]:");
                valor = in.nextInt();
                matriz[x][y] = valor;
            }
        }
        return matriz;
    }
    public static int menorValorSecundaria(int[][] matriz){
        int menorValor=1000000;
        for(int x=0;x<6;x++) {
            for (int y = 0; y < 6; y++) {
                if(x+y == 5){
                    if(matriz[x][y]< menorValor){
                        menorValor = matriz[x][y];
                    }
                }
            }
        }
        return menorValor;
    }
}
