package Lista4;
import java.util.*;
/**
 * Um banco concederá um crédito especial aos seus clientes, variável com
 * o saldo médio no último ano. Faça um programa que leia o saldo médio
 * de um cliente e calcule o valor do crédito de acordo com a tabela abaixo.
 * Mostre uma mensagem informando o saldo médio e o valor do crédito.
 * Implemente um método para calcular o valor do crédito.
 */
public class lista4_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double saldoMedio;

        System.out.println("Olá querido cliente! \nEstamos concedendo um crédito especial aos nossos clientes!!" +
                           "\nPara isso precisamos saber seu saldo médio!");
        saldoMedio = leSaldoMedio();
        valorCredito(saldoMedio);
    }
    public static double leSaldoMedio(){
        Scanner in = new Scanner(System.in);
        double saldoMedio;
        System.out.println("Digite o valor: ");
        saldoMedio = in.nextDouble();
        if(saldoMedio < 0){
            do{
                System.out.println("O valor anterior é inválido, por favor digite um valor válido");
                saldoMedio = in.nextDouble();
            }while(saldoMedio<0);
        }
        return saldoMedio;
    }
    public static void valorCredito(double saldoMedio){
        if(saldoMedio>0 && saldoMedio <=500){
            System.out.println("Infelizmeente seu saldo médio é muito baixo e não podemos conceder nenhum crédito!");
        }else if(saldoMedio>500 && saldoMedio<=1500){
            System.out.println("Com seu saldo médio podemoso conceder um crédito de 10%!");
        }else if(saldoMedio>1500 && saldoMedio<=2500){
            System.out.println("Com seu saldo médio podemoso conceder um crédito de 15%!");
        }else if(saldoMedio>2500 && saldoMedio<=4000) {
            System.out.println("Com seu saldo médio podemoso conceder um crédito de 20%!");
        }else {
            System.out.println("Com seu saldo médio podemoso conceder um crédito de 25%!");
        }
    }

}
