package PrimeiroProjetoPOO;

import java.util.Scanner;

public class AppQuadrado
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double lado;
        String cor;
        // primeiro objeto
        Quadrado quad1 = new Quadrado();
        System.out.println("O lado do quadrado é: "+ quad1.getLado());
        System.out.println("Digite um novo lado: ");
        lado = in.nextDouble();
        quad1.setLado(lado);
        System.out.println("Agora, o lado do quadrado é: "+ quad1.getLado());
        System.out.println("Digite uma nova cor: ");
        cor = in.nextLine();
        cor = in.nextLine();
        quad1.setCor(cor);
        System.out.println("A cor do quadrado é: "+ quad1.getCor());
        System.out.println("A área do quadrado é: "+ quad1.calculaArea());
        System.out.println("O perímetro do quadrado é: "+ quad1.calculaPerimetro());

        System.out.println(quad1.toString());

    }
}
