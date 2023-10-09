package Lista3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
public class lista3_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int number;
        double soma=0;

        System.out.println("Digite um valor ");
        number = in.nextInt();

        for (double i = number; i>= 1 ; i--){

            soma = soma + (1/i);



        }
        BigDecimal soma1 = new BigDecimal(soma).setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(soma1);
    }
}
