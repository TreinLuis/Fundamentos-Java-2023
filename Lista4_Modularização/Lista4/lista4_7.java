package Lista4;

/**
 Faça um programa que leia as medidas das arestas a, b e c de um paralelepípedo, calcule e escreva a sua diagonal. A diagonal deve ser calculada
 por um método.

 */
import java.sql.SQLOutput;
import java.util.*;
public class lista4_7 {
    public static void main(String[] args) {
        String introducao = "Vamos calcular a diagonal de um paralelepido" +
                            "\nDigite os valor de a,b,c respectivamente";
        System.out.println(introducao);
        double a = leValor();
        double b = leValor();
        double c = leValor();
        System.out.println("Com as seguintes medias:\nMedida de a = "+a+"\nMedida de b = "+b+
                            "\nMedida de c = "+c+ "\nObtemos uma diagonal = " + diagonal(a,b,c));

    }
    public static double leValor(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor válido: ");
        double valor = in.nextDouble();
        if(valor <=0){
            do{
                System.out.println("Digite um valor maior que 0 ");
                valor = in.nextDouble();
                }while(valor<=0);
            }
        return valor;
        }
        public static double diagonal (double a,double b,double c){
        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));
        }
    }

