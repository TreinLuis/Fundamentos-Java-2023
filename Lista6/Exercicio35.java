package Lista6;
import java.util.Scanner;
    /**
     * Faça um programa que leia um matriz A(6,6) e escreve a soma dos elementos da sua diagonal principal e da sua diagonal secundária.
     * A leitura e as somas devem ser feitas por métodos.
     * @author (seu nome)
     * @version (um número da versão ou uma data)
     */
    public class Exercicio35
    {
        public static void main(String args[]){
            int[][] matriz = leMatriz();
            System.out.println("A soma da diagnonal principal é: "+ somaDiagonalPrincipal(matriz));
            System.out.println("A soma da diagnonal secundária é: "+ somaDiagonalSecundaria(matriz));
        }


        public static int[][] leMatriz(){
            Scanner in = new Scanner(System.in);
            int[][] matriz = new int[6][6];
            int valor;
            for(int x=0;x<6;x++){
                for(int y=0;y<6;y++){
                    System.out.println("Digite um inteiro na posição ["+x+","+y+"]:");
                    valor = in.nextInt();
                    matriz[x][y] = valor;
                }
            }
            return matriz;
        }

        public static int somaDiagonalPrincipal(int[][] matriz){
            int soma =0;
            for(int x=0;x<6;x++){
                for(int y=0;y<6;y++){
                    if(x==y)
                        soma = soma + matriz[x][y];
                }
            }
            return soma;
        }

        public static int somaDiagonalSecundaria(int[][] matriz){
            int soma =0;
            for(int x=0;x<6;x++){
                for(int y=0;y<6;y++){
                    if(x+y==5)
                        soma = soma + matriz[x][y];
                }
            }
            return soma;
        }
    }

