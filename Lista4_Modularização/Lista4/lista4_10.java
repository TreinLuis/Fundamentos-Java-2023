package Lista4;
/**
 *Faça um programa que leia a altura e o sexo de uma pessoa (1 para
 * masculino e 2 para feminino), calcule e escreva o seu peso ideal, utilizando
 * as fórmulas abaixo. Implemente um método para calcular o peso ideal.
 * • para homens: (72.7 × altura) − 58
 * • para mulheres: (62.1 × altura) − 44.7
 */
import java.util.*;
public class lista4_10 {
    public static void main(String[] args) {
        System.out.println("CALCULADORA DE PESO IDEAL.");
        int gender = manOrWoman();
        System.out.println("PES0");
        double peso = leValor();
        System.out.println("ALTURA");
        double altura = leValor();
        idealWeight(gender,peso,altura);

    }
    public static int manOrWoman(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite 1 caso você seja um homem \nDigite 2 caso você seja uma mulher");
        int manOrWoman = in.nextInt();
        return manOrWoman;
    }
    public static double leValor(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor válido: ");
        double valor = in.nextDouble();
        return valor;
    }
    public static void idealWeight(int gender,double peso,double altura){
        double idealWeight;

        if(gender == 1){
            idealWeight = (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal é de %.2f", idealWeight);
            if(peso>idealWeight){
                System.out.println("Você está acima do seu peso ideal!!");
            }
        } else if(gender == 2){
            idealWeight = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é de %.2f", idealWeight);
            if(peso>idealWeight) {
                System.out.println("\nVocê está acima do seu peso ideal!!");
            }
        }
    }
}
