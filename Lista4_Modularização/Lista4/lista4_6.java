package Lista4;
import java.util.*;
/**
 Elabore um programa que leia 30 valores em Fahrenheit, calcula a conversão de cada temperatura de Fahrenheit (F) para Celsius (C) e escreve
 o valor resultante na tela. Para calcular a conversão dena um método e
 use a fórmula C =
 5
 9 × (F − 32
 */
public class lista4_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for(int i = 0;i<30;i++){
            double fahrenheit;
            double celsius;
            System.out.println("\nDigite um valor em fahrenheit: ");
            fahrenheit = in.nextDouble();
            calculaCelsius(fahrenheit);
            }

        }


    public static void calculaCelsius(double fahrenheit){
        System.out.printf("A conversão do valor que você digitou em fagrenheit para celsius é %.2f",(fahrenheit-32) * 5/9);

    }
}
