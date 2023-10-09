package Lista3;/*Faça um programa que leia uma frase e escreva quantas letras ’a’ esta
frase possui
*/
import java.util.*;
public class lista3_42 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int numA = 0;

        System.out.println("Digite uma frase: ");
        String frase = in.nextLine().toUpperCase();
        char a[] = frase.toCharArray();

        //Para evitar o erro foi necessario colocar o lenght com - 1
        /*
        The indices of elements in Java (and most other languages) will always begin with 0.
        When considering an array/string the indices of the contained elements will start at 0 and end at
        (size of array/length of string - 1).
         */
        for(int i = 0 ; i <= frase.length() -1 ; i++){
            if( a[i] == 'A'){
                numA++;

            }
            //System.out.println(numA);
        }
        System.out.println("Está frase tem " + numA + " A's escritos");



    }
}
