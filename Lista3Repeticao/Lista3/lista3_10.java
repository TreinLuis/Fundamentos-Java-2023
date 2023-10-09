package Lista3;

import java.util.*;

public class lista3_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int num,fatorial=1,somatorio=0;

        System.out.println("Digite um valor inteiro para calcularmos seu fatorial e somatorio:" );
        num = in.nextInt();

        if(num > 0){
            for(int i = 1; i <= num; i++){
                System.out.println(i);

                fatorial *=i;
                somatorio += i;

            }
        }else{
            System.out.println("Você digitou mum valor inválido: ");
        }

        System.out.println("O fatorial do número digitado: " + fatorial);
        System.out.println("O somatório do valor digita: " + somatorio);


    }
}
