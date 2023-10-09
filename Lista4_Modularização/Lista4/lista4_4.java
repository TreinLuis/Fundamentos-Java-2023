package Lista4;
/**
Crie um programa que lê o tempo atual em hora, minuto e segundo, e o
escreve em segundos quanto tempo se passou desde que o dia começou.
Essa conversão deve ser calculada por um método.
 */
import java.util.*;
public class lista4_4 {
    public static void main(String[] args) {
        int horas = leHoras();
        int minutos = leMinutos();
        int segundos = leSegundos();
        int segundosDia = calculaTempo(horas,minutos,segundos);
        System.out.println("O dia começou faz "+ segundosDia + " segundos");
    }
    public static int leHoras(){
        int horas;
        Scanner in = new Scanner(System.in);
        System.out.println("Primeiramente digite as horas(15Horas): ");
        horas = in.nextInt();
        if(horas>24){
            do {
                System.out.println("Por favor digite um valor em horas menor que 24 para ser válido");
                horas = in.nextInt();
            }while(horas>24);
        }

        return horas;
    }
    public static int leMinutos(){
        int minutos;
        Scanner in = new Scanner(System.in);
        System.out.println("Agora digite os minutos: ");
        minutos = in.nextInt();
        if(minutos>60){
            do {
                System.out.println("Por favor digite um valor em mimutos menor que 60 para ser válido: ");
                minutos = in.nextInt();
            }while(minutos>60);
        }
        return minutos;
    }
    public static int leSegundos(){
        int segundos;
        Scanner in = new Scanner(System.in);

        System.out.println("Por fim digite os segundos: ");
        segundos = in.nextInt();
        if(segundos>60){
            do {
                System.out.println("Por favor digite um valor em segundos menor que 60 para ser válido: ");
                segundos = in.nextInt();
            }while(segundos>60);
        }
        return segundos;
    }
    public static int calculaTempo(int horas, int minutos, int segundos){
        return ((horas*3600) + (minutos*60) + segundos);
    }
}
