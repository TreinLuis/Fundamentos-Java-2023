package Lista4;
import java.util.*;
/**
 Faça um programa que leia 3 valores, calcule e escreva a média aritmética
 desses valores. A média deve ser calculada por um método.
 */
public class lista4_1
{
    public static void main(String args[]){
        double soma = 0;
        double valor = 0;
        for(int i = 0; i<3;i++){
            valor = leValor();
            soma = soma + valor;
        }
        System.out.println("A média aritmética destes valores é "+calculaMedia(soma));
    }
    public static double leValor(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valor = in.nextDouble();
        return valor;
    }
    public static double calculaMedia(double soma){
        return soma/3;
    }

}
