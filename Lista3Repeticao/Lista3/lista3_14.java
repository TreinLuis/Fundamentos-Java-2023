package Lista3;

import java.util.*;
public class lista3_14 {
    public static void main(String[] args){
        short diasMes;
        short diaSemanaInicial;
        short contador = 0;
        Scanner leitor = new Scanner(System.in);
        lista3_14 calendario = new lista3_14();

        System.out.print("Número de dias do mês: ");
        diasMes = leitor.nextShort();

        System.out.print("Dia da semana inicial: ");
        diaSemanaInicial = leitor.nextShort();

        System.out.printf("%5c%5c%5c%5c%5c%5c%5c", 'D', 'S', 'T', 'Q', 'Q', 'S', 'S');
        System.out.println("\n________________________________________");

        for(short i = 1; i <= diasMes; i++){
            if(i == 1){
                System.out.printf("%" + (diaSemanaInicial * 5) + "d", i);
                contador = diaSemanaInicial;
            }else{
                System.out.printf("%5d", i);
                contador++;
            }

            if(contador % 7 == 0){
                System.out.println("");
            }
        }
        System.out.println("\n");
    }
    }


