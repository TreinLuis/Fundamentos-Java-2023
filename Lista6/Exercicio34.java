package Lista6;
import java.util.Scanner;
/**
 * Faça um programa que leia um matriz A(5,5) e escreve a soma dos seus
 elementos. A leitura e a soma dos elementos de A devem ser feitas em
 métodos.
 * @author (seu nome)
 * @version (17/11)
 */
public class Exercicio34 {
        public static void main(String args[]){
            int[][] matriz = leMatriz();//O primeiro [linhas] e o segundos [colunas]
            System.out.println("A soma dos conteúdos da matriz é: "+ somaMatriz(matriz));
        }

        public static int[][] leMatriz(){
            Scanner in = new Scanner(System.in);
            int valor = 0;
            int[][] matrizA = new int[5][5];
            for(int x=0;x<5;x++){
                for(int y=0;y<5;y++){
                    System.out.println("Digite um valor para o eixo [" +x+","+y+"]:");
                    valor = in.nextInt();
                    matrizA[x][y]=valor;
                }
            }
            return matrizA;
        }

        public static int somaMatriz(int[][] matrizA){
            int soma=0;
            for(int x=0;x<5;x++){
                for(int y=0;y<5;y++){
                    soma  = soma + matrizA[x][y];
                }
            }
            return soma;
        }
}
