package Lista3;/*
 Faça um programa que leia 2 valores inteiros e positivos: x e y. O programa deve calcular e escrever a função potência x y
(não use a função
pow).
 */
import java.util.*;
public class lista3_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x,y,res = 1;

        System.out.println("Bem vindo a nossa calculadora de potencia");

        do {
            System.out.println("Digite um valor para x: ");
            x = in.nextInt();
        }while(x<=0);
        do {
            System.out.println("Digite um valor para y: ");
            y = in.nextInt();
        }while(y<=0);

        for(int i=1;y>=i;i++){
            res = res * x;
        }
        System.out.println(res);
    }
}
