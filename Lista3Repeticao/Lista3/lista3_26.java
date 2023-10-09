package Lista3;/*
 Em uma eleição presidencial existem quatro candidatos. Os votos são
informados através de códigos. Os dados utilizados para a contagem dos
votos obedecem a seguinte codificação:
• 1,2,3,4 = voto para os respectivos candidatos;
• 0 = voto branco;
• qualquer valor diferente de 0 a 4 = voto nulo;
Elabore um programa que leia o código do candidado em um voto. Calcule
e escreva:
3
• total de votos para cada candidato;
• total de votos nulos;
• total de votos em branco;
Como finalizador do conjunto de votos, utilize valores negativos.
 */
import java.util.*;
public class lista3_26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int encerra = 0,voto,luis=0,leonardo=0,arthur=0,olivia=0,branco=0,nulo=0;
        System.out.println("Bem Vindo á nossa eleição presidencial!!! ");
        do{
            System.out.println("Aperte 0 para votar em branco");
            System.out.println("Aperte 1 para votar em Luís Trein");
            System.out.println("Aperte 2 para votar em Arthur Blasi");
            System.out.println("Aperte 3 para votar em Leonardo Fagunde");
            System.out.println("Aperte 4 para votar em Olivia Livak");
            System.out.println("Qualquer outro valor o voto será nulo");
            voto = in.nextInt();

            if(voto == 1){
                luis++;
            }else if(voto == 2){
                arthur++;
            }else if(voto == 3){
                leonardo++;
            } else if (voto == 4) {
                olivia++;
            } else if (voto==0) {
                branco++;
            }else
                nulo++;
            System.out.println("Para encerrar o programa digite um valor negativo: ");
            encerra = in.nextInt();

        }while (encerra >=0);

        System.out.println("Votos em branco: "+ branco);
        System.out.println("Luís Trein teve: "+ luis);
        System.out.println("Arthur Blasi teve: "+ arthur);
        System.out.println("Leonardo Fagunde teve: "+ leonardo);
        System.out.println("Olivia Livak teve : "+ olivia);
        System.out.println("Votos nulos: "+ nulo);
    }
}
