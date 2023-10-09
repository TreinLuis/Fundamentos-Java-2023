package Lista3;/*
 Uma loja tem 150 clientes cadastrados e deseja mandar uma correspondência eletrônica a cada um deles anunciando um bônus especial. Escreva um
programa que leia o nome do cliente e o valor das suas compras no ano
passado e calcule um bônus de 10% se o valor das compras for menor que
R$ 500,00 e de 20 %, caso contrário.
 */
import java.util.*;

public class lista3_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double valor;
        String nome;

        for(int i = 1; i<=3;i++) {

            System.out.println("\nVocê é o cliente número " + i+ " no nosso banco de dados!!\nInforme seu nome:" );
            nome = in.next();


            System.out.println("Digite o valor das suas compras no ano passado: ");
            valor = in.nextInt();

            if(valor < 500){
                System.out.println("Você ganhou um voucher de 10% "+ nome);
            }else
                System.out.println("Você ganhou um voucher de 20% " + nome);
        }

    }
}
