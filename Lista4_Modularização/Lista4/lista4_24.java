package Lista4;
import java.util.*;
/**
 Faça um programa que leia um valor inteiro e positivo (garanta isso),
 calcule e escreva os divisores desse valor. O cálculo do divisores e a sua
 escrita deve ser feito por um método.
 */
public class lista4_24 {
    public static void main(String args[]){
        int valor = leValor();
        int cont =  calculaDiv(valor);
        System.out.println("A quantidade de divisores é " + cont);


    }

    public static int leValor(){
        Scanner in = new Scanner(System.in);
        int valor = 0;
        System.out.println("Digite um valor inteiro positivo: ");
        valor = in.nextInt();

        if(valor<=0){
            do{
                System.out.println("Por favor digite um valor válido! ");
                valor = in.nextInt();
            }while(valor<0);
        }
        return valor;
    }
    private static int calculaDiv(int valor){
        int cont = 0;
        for(int i = 1; i<=valor;i++){
            if(valor%i==0){
                System.out.println(i + "");
                cont++;
            }
        }
        return cont;
    }
}