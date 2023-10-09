package Lista3;

import java.sql.SQLOutput;
import java.util.*;

public class lista3_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String duration = "ok";
        int people=0,children,poor=0,total=0;
        double salary,avarage,biggest=0;
        System.out.println("Bem vindo ao programa:");

        while(!duration.equals("parar") || duration.equals("continuar")){


            System.out.println("Digite o salário deste usuario: ");
            salary = in.nextDouble();
            System.out.println("Quantos filhos este usúario tem: ");
            children = in.nextInt();

            total += salary;



            if(salary >= biggest){
                biggest = salary;
            }
            if(salary <= 2000){
                poor++;
            }
            people++;
            System.out.println("Caso deseja encerrar o programa digite (Parar): " );
            System.out.println("Caso deseja continuar o programa digite (Continuar): " );
            duration = in.nextLine().toLowerCase();
            duration = in.nextLine().toLowerCase();

        }
        System.out.println("A média salarial da população é de: " + total/people + "Reais");
        System.out.println("O maior salário é de: " + biggest + "Reais");
        System.out.println("O porcentual de pessoas que possui um salário inferior a 2000 é de: " + (poor*100)/people + "%");

    }
}
