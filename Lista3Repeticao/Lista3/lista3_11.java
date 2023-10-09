package Lista3;

import java.sql.SQLOutput;
import java.util.*;

public class lista3_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int number;
        System.out.println("Digite um valor inteiro positivo: " );
        number = in.nextInt();

        for(int i=1 ;i<=number;i++){
            if(number % i == 0){
                System.out.println(i);
            }
        }

    }
}
