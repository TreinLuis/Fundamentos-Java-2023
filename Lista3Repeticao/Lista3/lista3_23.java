package Lista3;/*
 Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem
1,10 metro e cresce 3 centímetros por ano. Construa um programa que
calcule e exiba quantos anos serão necessários para que Zé seja maior que
Chico.
 */

import java.sql.SQLOutput;
import java.util.*;
public class lista3_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double chicoAltura= 1.50,zeAltura = 1.10;
        double cresceZe = 0.03, cresceChico = 0.02;
        int anos=0;

        do{
            chicoAltura += cresceChico;
            zeAltura += cresceZe;
            anos++;
        }while(chicoAltura >= zeAltura);
        System.out.println("ZÉ será maior que chico depois de  "+anos +"anos");
        zeAltura = zeAltura*1000;
        zeAltura = Math.round(zeAltura);
        System.out.println("A altura de zé: " + zeAltura/1000);
        chicoAltura = chicoAltura*1000;
        chicoAltura= Math.round(chicoAltura);
        System.out.println("A altura de chico é: " + chicoAltura/1000);

    }
}
