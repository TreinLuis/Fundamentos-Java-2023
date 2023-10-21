package Atividade2;

import java.util.*;
public class AppRetangulo
{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);

        Retangulo retangulo1 = new Retangulo();

        System.out.println("Digite o valor da base: ");
        retangulo1.setBase(in.nextDouble());
        System.out.println("Digite o valor da altura: ");
        retangulo1.setAltura(in.nextDouble());
        System.out.println("Digite a cor do Retangulo: ");
        retangulo1.setCor(in.next());
        System.out.println(retangulo1.toString());

    }
}