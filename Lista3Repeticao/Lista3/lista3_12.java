package Lista3;//Não Consegui

import java.util.*;
public class lista3_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int somaTotal = 0;

        System.out.println("Digite um valor inteiro: ");
        int number = in.nextInt();
        String b = Integer.toString(number);
        char[] a = String.valueOf( b ).toCharArray();



        for(int i = 0;i < a.length;i++){

            int num = a[i] - '0';

            if(num%2 !=0){
                somaTotal = somaTotal + num;
                System.out.println(num);
            }

        }
        //System.out.println(somaTotal);
    }
}
