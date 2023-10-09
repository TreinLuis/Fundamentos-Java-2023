package Lista3;

import java.util.*;

public class lista3_35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = 0, div =0 , primos = 0 ;



        for (int i = 1 ; primos < 100 ; i++ ){
            div = 0;
            for(int j = 1 ; j <= i ; j++){
                if( i%j == 0 ){
                    div++;
                }

            }
            if(div == 1 || div ==2){
            System.out.println(i);
            primos++;
            }
        }
    }
}
