package Lista3;/*
Faça um programa que recebe o valor do lado de um quadrado e exibe na
tela o quadrado conforme o exemplo abaixo. No exemplo o lado informado
foi 5.
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
 */
import java.util.*;
public class lista3_39 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int contrutor;
        String aux ="";
        System.out.println("Vamos contruir um quadrado: ");
        contrutor = in.nextInt();

        for(int i = 1; i<contrutor;i++){//Controla as linhas do quadrado
             aux = "";
            for(int j = 1; j<=contrutor;j++){//Aqui fica acrescentando um * na nossa string para formar um quadrado
                aux += "*";
            }

            System.out.println(aux);
            //System.out.println(" ");

        }
        System.out.println(aux);
    }

}
