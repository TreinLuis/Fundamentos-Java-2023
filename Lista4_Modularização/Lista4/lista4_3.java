package Lista4;
/*
 Faça um programa que leia as dimensões de uma casa (largura e comprimento) e as dimensões de um terreno (largura e comprimento).
 A seguir,o programa deve calcular e escrever a área da casa, a área do terreno e a
 área livre. O cálculo de cada área deve ser realizado por um método.
 */
import java.util.*;
public class lista4_3 {
    public static void main(String[] args) {
        System.out.println("Digite as seguintes informações sobre a casa em metros!");
        double comprimentoCasa = leComprimento();
        double larguraCasa = leLargura();
        System.out.println("Digite as seguintes informações sobre o terreno em metros!");
        double comprimentoTerreno = leComprimento();
        double larguraTerreno = leLargura();
        calculaAreas(comprimentoCasa,larguraCasa,comprimentoTerreno,larguraTerreno);
    }
    public static double leComprimento(){
        Scanner in = new Scanner(System.in);
        double comprimento = 0;
        System.out.println("Digite o comprimento: ");
        comprimento = in.nextDouble();
        return comprimento;
    }
    public static double leLargura(){
        Scanner in = new Scanner(System.in);
        double largura = 0;
        System.out.println("Digite a largura: ");
        largura = in.nextDouble();
        return largura;
    }

    public static void calculaAreas(double comprimentoCasa,double larguraCasa,double comprimentoTerreno,double larguraTerreno){
        double areaCasa = comprimentoCasa * larguraCasa;
        double areaTerreno = larguraTerreno * comprimentoTerreno;
        double areaLivre = areaTerreno - areaCasa;
        if (areaCasa > areaTerreno){
            System.out.println("Você digitou valores errados! Impossível uma casa ser maior que o terreno!!!!");
        } else{
            System.out.println("A área de sua casa é de "+ areaCasa + "Metros Quadrados");
            System.out.println("A área do seu terreno é de "+ areaTerreno + "Metros Quadrados");
            System.out.println("Sua área livre é de "+ areaLivre + "Metros Quadrados");

        }
    }
}
