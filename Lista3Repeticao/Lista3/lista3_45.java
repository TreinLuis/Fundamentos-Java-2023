package Lista3;/*Elabore um programa que lê uma frase e a escreve sem as vogais

*/
import java.util.*;
public class lista3_45 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma frase: ");

        String frase = in.nextLine().toUpperCase();
        char a[] = frase.toCharArray();
        String res = "";


        for(int i = 0 ; i < a.length ; i++){


            if(a[i] == 'A' || a[i] == 'E' ||a[i] == 'I' ||a[i] == 'O' || a[i] == 'U'  ){

                res += a[i];

            }
        }
        System.out.println(res);
    }
}
