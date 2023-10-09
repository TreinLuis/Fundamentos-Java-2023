package Lista4;
/*
 Faça um programa que leia 3 valores e determine o maior deles. Use um
método para encontrar o maior valor.
 */
import java.util.Scanner;

public class lista4_2 {
    public static void main(String[] args) {
        int valor1 = leValor();
        int valor2 = leValor();
        int valor3 = leValor();
        calculaMaiorValor(valor1,valor2,valor3);
    }
    public static int leValor(){
        Scanner in = new Scanner(System.in);
        int valor = 0;
        System.out.println("Digite um valor: ");
        valor = in.nextInt();
        return valor;
    }
    public static void calculaMaiorValor(int valor1 ,int valor2 ,int valor3){
        int maior = 0;
        if(valor1 > valor2 && valor1 > valor3){
            maior = valor1;
        } else if(valor2 > valor1 && valor2 > valor3 ){
            maior = valor2;
        } else if(valor3 > valor2 && valor3 > 1 ){
            maior = valor2;
        }
        System.out.println("O maior valor que você digitou foi: "+ maior);
    }
}
