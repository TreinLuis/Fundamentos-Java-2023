package Lista4;
/**
 *Uma empresa concederá um aumento de salário aos seus funcionários, variável de acordo com o cargo, conforme a tabela abaixo.
 * Faça um programa que leia o salário e o cargo de um funcionário e calcule o novo salário. Se
 * o cargo do funcionário não estiver na tabela, ele deverá, então, receber 5%
 * de aumento. Mostre o salário antigo, o novo salário e a diferença. O valor
 * do novo salário deve ser denido por um método. Crie também método
 * para calcular a diferença.
 * 101 6%
 * 102 7%
 * 103 8%
 * 104 9,5%
 */

import java.sql.SQLOutput;
import java.util.*;
public class lista4_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Olá caro funcionario!!\nComo obtemos ótimos resultados iremos dar um aumento para vocês"+
                "\nFelizmente todos receberemos algum aumento!!");

        System.out.println("Primeiramente digite seu salário atual: ");
        double salario = in.nextDouble();

        int codigoDoCargo = leCargo();
        double percentual = percentualAumento(codigoDoCargo);
        System.out.println("Seu aumento foi de "+ aumento(salario,percentual));
        System.out.printf("Seu novo salário será de %.2f",aumento(salario,percentual)+ salario);
        System.out.println("\nVale lembrar que seu antigo salário era de "+ salario);
    }
    public static int leCargo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Para descobrir o percentual do seu aumento digite o Código do seu cargo: ");
        int cargo = in.nextInt();
        return cargo;
    }
    public static double percentualAumento(int codigoDoCargo){
        double percentual = 0;
        if(codigoDoCargo == 101){
            percentual = 6;
        }else if(codigoDoCargo == 102){
            percentual = 7;
        }else if(codigoDoCargo == 103){
            percentual = 8;
        }else if(codigoDoCargo == 104){
            percentual = 9.5;
        }else{
            percentual = 5;
        }
        return percentual;
    }
    public static double aumento(double salarioAntigo,double percentual){
        return (percentual/100)*salarioAntigo;
    }
}
