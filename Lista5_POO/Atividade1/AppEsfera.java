package Atividade1;
import java.util.*;

public class AppEsfera {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Esfera esfera1 = new Esfera();

        System.out.println("Olá digite o raio da sua esfera: ");
        esfera1.setRaio(in.nextDouble());
        System.out.println("Qual a cor da sua esfera? ");
        esfera1.setCor(in.next());

        esfera1.info();
    }
}
