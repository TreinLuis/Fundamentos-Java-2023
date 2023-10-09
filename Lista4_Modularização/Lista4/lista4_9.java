package Lista4;
import java.util.*;
/**
 *Faça um programa que leia 3 notas, calcule e escreva a média ponderada
 * dessas notas. Para calcular a média, considere que a maior nota tem peso
 * 5 e as demais, peso 2,5. Implemente, para resolver esse problema, dois
 * métodos. Um para encontrar a maior nota e outro para calcular a média.
 */
import java.util.*;
public class lista4_9 {
    public static void main(String[] args) {
        System.out.println("Primeira nota!");
        double nota1 = leNota();
        System.out.println("Segunda nota!");
        double nota2 = leNota();
        System.out.println("Terceira nota!");
        double nota3 = leNota();
        double maiorNota = maiorNota(nota1,nota2,nota3);
        double pontos = calculaPontos(maiorNota,nota1,nota2,nota3);
        System.out.printf("A maior nota deste aluno foi de %.2f", maiorNota);
        System.out.printf("\nA pontuação final deste aluno foi de %.2f", pontos);
    }
    public static double leNota(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a nota: ");
        double nota = in.nextDouble();
        if(nota>10 || nota<0){
            do{
                System.out.println("VALOR INVÁLIDO, Por favor digite um valor entre 10 e 0: ");
                nota = in.nextDouble();
            }while(nota>10 || nota<0);
        }
        return nota;
    }
    public static double maiorNota(double nota1,double nota2,double nota3){
        double maiorNota;
        if(nota1>nota2 && nota1>nota3){
            maiorNota = nota1;
        } else if(nota2>nota1 && nota2>nota3){
            maiorNota = nota2;
        } else{
            maiorNota = nota3;
        }

        return maiorNota;
    }
    public static double calculaPontos(double maiorNota,double nota1,double nota2,double nota3){
        double pontuacaoFinal;
        if(maiorNota == nota1){
            return ((maiorNota*5) + (nota2+nota3)*2.5)/3;
        } else if(nota2>nota1 && nota2>nota3){
            return ((maiorNota*5) + (nota1+nota3)*2.5)/3;
        } else{
            return ((maiorNota*5) + (nota1+nota2)*2.5)/3;
        }
    }
}

