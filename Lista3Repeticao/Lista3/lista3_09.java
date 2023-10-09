package Lista3;

import java.util.*;
public class lista3_09 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a,b,somaTotal=0;

        System.out.println("Digite um valor inteiro positivo: ");
        a = in.nextInt();
        System.out.println("Digite um segundo valor inteiro positivo: ");
        b = in.nextInt();


        if(a >= b){
            for(int i=a; i>=b ;i-- ){
                if(i%2 == 0){
                    somaTotal = somaTotal+i;
                    System.out.println("Estes são os valores pares entre o intervalo que você digitou: "+ i);
                }
            }
        }
        if(a <= b){
            for(int i=b; i>=a ;i-- ){
                if(i%2 == 0){
                    somaTotal = somaTotal+i;
                    System.out.println("Estes são os valores pares entre o intervalo que você digitou: "+ i);
                }
            }
        }
        System.out.println("A soma total dos valores pares é: " + somaTotal);
    }
}
