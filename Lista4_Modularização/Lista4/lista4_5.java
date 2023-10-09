package Lista4;

import java.util.Scanner;

/**
\Faça um programa que leia as coordenadas de 2 pontos no plano (x1, y1) e
(x2, y2). A seguir, o programa deve calcular e escrever a distância euclidiana e também a distância de Manhattan entre esses pontos.

 */
public class lista4_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor do ponto x1: ");
        double pontoX1 = in.nextInt();
        System.out.println("Digite o valor do ponto y1: ");
        double pontoY1 = in.nextInt();
        System.out.println("Digite o valor do ponto x2: ");
        double pontoX2 = in.nextInt();
        System.out.println("Digite o valor do ponto y2: ");
        double pontoY2 = in.nextInt();

        System.out.printf("\nA distância encludiana dos pontos que você digitou é %.2f", euclidiana(pontoX1,pontoY1,pontoX2,pontoY2));
        System.out.printf("\nA distância de Manhattan dos pontos que você digitou é %.2f", manhattan(pontoX1,pontoY1,pontoX2,pontoY2));

    }
    public static double euclidiana (double pontoX1,double pontoY1,double pontoX2,double pontoY2){
        return Math.sqrt(Math.pow((pontoX1-pontoX2),2) + Math.pow((pontoY1-pontoY2),2));
    }
    public static double manhattan (double pontoX1,double pontoY1,double pontoX2,double pontoY2){
        return Math.abs(pontoX1-pontoX2) + Math.abs(pontoY1-pontoY2);

    }
}
