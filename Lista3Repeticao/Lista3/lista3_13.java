package Lista3;

import java.util.*;
public class lista3_13 {
    public static void main(String[] args) {
        System.out.println("Celsius " + " Fahrenheit");
        for(int i = 0; i<=100;i++){
            double fahrenheit = i *1.8 + 32;
            System.out.println("     "+i + "      "+ Math.round(fahrenheit*10)/10);

        }



    }
}
