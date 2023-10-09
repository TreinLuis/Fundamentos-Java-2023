package Lista4;
/**
 * Escrever um programa que lê a hora de início e hora de término de um jogo,
 * ambas subdivididas em dois valores distintos : horas e minutos.
 * Calcular e escrever a duração do jogo, também em horas e minutos, considerando
 * que o tempo máximo de duração de um jogo é de 24 horas e que o jogo
 * pode iniciar em um dia e terminar no dia seguinte. A duração deve ser
 * calculada por um método.
 */

import java.util.*;
public class lista4_14 {
    public static void main(String[] args) {
        System.out.println("BEM VINDO A CALCULADORA DE TEMPO DO JOGO");
        System.out.println("Inicio do Game!!");
        int horasInicio = leHoras();
        int minutosInicio = leMinutos();
        System.out.println("Termino do Game!!");
        int horasFinal = leHoras();
        int minutosFinal = leMinutos();
        calculaDuracao(horasInicio,minutosInicio,horasFinal,minutosFinal);
    }
    public static int leHoras(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a hora solicitada: ");
        int valor = in.nextInt();
        if(valor>24){
            do{
                System.out.println("Um dia possuí no maximo 24 Horas. Digite um valor valido");
                valor = in.nextInt();
            }while(valor>24);
        }
        return valor;
    }
    public static int leMinutos(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite os minutos solicitados: ");
        int valor = in.nextInt();
        if(valor>60){
            do{
                System.out.println("Uma hora possuí no maximo 60 Minutos. Digite um valor valido");
                valor = in.nextInt();
            }while(valor>60);
        }
        return valor;
    }
    public static void calculaDuracao(int horasInicio,int minutosInicio,int horasFinal,int minutosFinal){
        int horaTotal, minutosTotal;
        if(horasInicio < horasFinal){
            horaTotal = horasFinal - horasInicio;
        }else if(horasInicio > horasFinal){
            horaTotal = (horasFinal+24)-horasInicio;
        }else{
            horaTotal=0;
        }
        if(minutosInicio < minutosFinal){
            minutosTotal = minutosFinal - minutosInicio;
        }else if(horasInicio > horasFinal){
            minutosTotal = (minutosFinal+60)-minutosInicio;
        }else{
            minutosTotal=0;
        }
        if(minutosTotal == 0 && horaTotal == 0){
            System.out.println("VALORES INVÁLIDOS!! IMPOSSÍVEL O JOGO COMEÇAR E TERMINAR NO MESMO HORARIO");
        }else{
            System.out.println("A duração do seu jogo foi de: "+ horaTotal + " Horas " + minutosTotal+ " Minutos");
        }


    }
}
