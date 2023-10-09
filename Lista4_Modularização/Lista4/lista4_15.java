package Lista4;
/**
 * Escrever um programa que lê a matrícula, as 3 notas obtidas por um aluno
 * nas 3 vericações e a média dos exercícios que fazem parte da avaliação.
 * Calcular a média de aproveitamento, usando a fórmula:
 * MA =
 * Nota1+Nota2×2+Nota3×3+ME
 * O programa deve escrever a matrícula, suas notas, a média dos exercícios,
 * a média de aproveitamento, o conceito correspondente e a mensagem:
 * APROVADO se o conceito for A,B ou C e REPROVADO se o conceito
 * for D ou E. Crie um método para calcular a média de aproveitamento.
 * Implemente também um método para denir o conceito. E ainda construa
 * um método que verica se o aluno foi aprovado ou não.
 */
import java.util.*;
public class lista4_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String res;
        char conceitoAluno;
        int matricula;
        double nota1,nota2,nota3,mE,mediaAproveitamento;
        System.out.println("Bem Vindo Aluno!\nVamos descubra se você está aprovado ou não!"+
                "Por favor, digite sua matrícula: ");
        matricula = in.nextInt();
        System.out.println("NOTA1!");
        nota1 = leNota();
        System.out.println("NOTA2!");
        nota2 = leNota();
        System.out.println("NOTA3!");
        nota3 = leNota();
        System.out.println("Média dos Trabalhos");
        mE = leNota();

        mediaAproveitamento = calculaMedia(nota1,nota2,nota3,mE);
        conceitoAluno = conceito(mediaAproveitamento);
         res = resultado(conceitoAluno);

        exibeInformaçoes(matricula,mediaAproveitamento,conceitoAluno,res);
    }
    public static double leNota(){
        Scanner in = new Scanner(System.in);
        double nota;
        System.out.println("Digite a nota: ");
        nota = in.nextDouble();
        if(nota < 0 || nota >10){
            do{
                System.out.println("A nota anterior é inválida, por favor digite uma nota válida");
                nota = in.nextDouble();
            }while(nota<0 || nota>10);
        }
        return nota;
    }
    public static double calculaMedia(double nota1,double nota2,double nota3,double mE){
        return (nota1+(nota2*2)+(nota3*3)+mE)/7;
    }
    public static char conceito (double mediaAproveitamento){
        char conceito = ' ';
        if(mediaAproveitamento >= 9 && mediaAproveitamento <= 10){
            conceito = 'A';
        }else if(mediaAproveitamento >= 7.5 && mediaAproveitamento < 9){
            conceito = 'B';
        }else if(mediaAproveitamento >= 6 && mediaAproveitamento < 7.5){
            conceito = 'C';
        }else if(mediaAproveitamento >= 4 && mediaAproveitamento < 6){
            conceito = 'D';
        }else{
            conceito = 'E';
        }
        return conceito;

    }
    public static String resultado(char conceito){
        String res ;
        switch (conceito){
            case 'A':
                res = "Aprovado";
                break;
            case 'B':
                res = "Aprovado";
                break;
            case 'C':
                res = "Aprovado";
                break;
            default:
                res= "Reprovado";
        }
        return res;
    }
    public static void exibeInformaçoes(int matricula,double mediaAproveitamento,char conceitoAluno,String res){
        System.out.println("O aluno de matrícula "+matricula);
        System.out.printf("Obteve uma média de %.2f\n", mediaAproveitamento);
        System.out.println("Seu conceito foi de " + conceitoAluno);
        if(res.equals("Aprovado")){
            System.out.println("Parabens aluno!!\nVocê foi aprovado!!");
        }else{
            System.out.println("Infelizmente você foi reprovado\nNos vemos ano que vem novamente!");
        }

    }
}
