package Lista4;
/**
 *Um usuário deseja um programa onde possa informar 3 notas e ainda
 * escolher o tipo de média que deve aplicada aos valores lidos.Implemente
 * esse programa considerando o menu de opções abaixo. O cálculo de cada
 * média deve ser feito por um método.
 * 1 - Aritmética
 * 2 - Ponderada ( Pesos: 3,3,4)
 * 3 - Harmônica
 */
import java.util.*;
public class lista4_12 {
    public static void main(String[] args) {
        System.out.println("BEM VINDO A CALCULADORA DE MÉDIAS");
        double nota1 = leNota();
        double nota2 = leNota();
        double nota3 = leNota();
        int choosed = escolhaMedia();
        double media = calculoMedias(choosed,nota1,nota2,nota3);
        System.out.printf("O resultado da média que você escolheu com as suas notas foi de %.2f" , media);
    }
    public static double leNota(){
        Scanner in = new Scanner(System.in);
        double nota;
        System.out.println("Digite a nota: ");
        nota = in.nextDouble();
        if(nota < 0){
            do{
                System.out.println("A nota anterior é inválida, por favor digite uma nota válida");
                nota = in.nextDouble();
            }while(nota<0);
        }
        return nota;
    }

    public static int escolhaMedia(){
        Scanner in = new Scanner(System.in);
        int choose;
        System.out.println("Qual o tipo de média que você deseja calcular: "+
                "\nAperte 1 para média aritmética" +
                "\nAperte 2 para média ponderada" +
                "\nAperte 3 para média harmônica");
        choose = in.nextInt();
        if(choose>3 || choose<0){
            do {
                System.out.println("Digite uma das opções: ");
                choose = in.nextInt();
            }while(choose>3 || choose<0);
        }
        return choose;
    }
    public static double calculoMedias(int choosed,double nota1,double nota2,double nota3){
        double media = switch (choosed) {
            case 1 -> (nota1 + nota2 + nota3) / 3;
            case 2 -> (nota1 * 3 + nota2 * 3 + nota3 * 4) / 10;
            case 3 -> 3 / ((1 / nota1) + (1 / nota2) + (1 / nota3));
            default -> 0;
        };
        return media;
    }

}

