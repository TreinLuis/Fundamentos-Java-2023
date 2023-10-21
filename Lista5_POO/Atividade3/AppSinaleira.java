package Atividade3;
import java.util.*;
public class AppSinaleira {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Sinaleira sinaleira1 = new Sinaleira();

        System.out.println("Olá bem vindo a sinaleira digital! ");
        sinaleira1.trocaEstado();
        sinaleira1.ultimoEstado();
    }

}
