package Lista4;

import java.util.Scanner;

/**
 *Faça um programa que leia um número inteiro de 4 dígitos e o escreva
 * invertido. Exemplo: 1234 -> 4321 . A inversão do valor deve ser feita por
 * um método. Só podem ser usados valores inteiros. O valor de entrada não
 * pode ser lido digito a dígito
 * Notas relevantes:
 * %10 sempre retorna o ultimo valor como resto
 * como dividimos um inteiro por 10(o inteiro esquece a virgula) o número se torno de 3 digitos
 * como dividimos um inteiro por 100(o inteiro esquece a virgula) o número se torno de 2 digitos
 * como dividimos um inteiro por 1000(o inteiro esquece a virgula) o número se torno de 1 digitos
 */
public class lista4_8 {
    public static void main(String[] args) {
        int valor = leValor();
        System.out.println("O valor original era: " + valor +
                           "\nO valor invertido é de " + inverteValor(valor));


    }
    public static int leValor(){
        Scanner in = new Scanner(System.in);
        int valor;
        System.out.println("Digite um valor inteiro de quatro digitos");
        valor = in.nextInt();
        if(valor>9999 || valor<=0000){
            do{
                System.out.println("Por favor digite um valor com a condição anterior: ");
                valor = in.nextInt();
            }while(valor>9999 || valor<=0000);

        }
        return valor;
    }
    public static int inverteValor(int valor){
        int digito1 = valor % 10;
        int digito2 = (valor / 10) % 10;
        int digito3 = (valor / 100) % 10;
        int digito4 = (valor / 1000) % 10;
        return  digito1*1000 + digito2*100 + digito3*10 +digito4;

    }
}
