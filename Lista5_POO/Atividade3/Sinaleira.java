package Atividade3;

import java.util.Scanner;

public class Sinaleira {
    Scanner in = new Scanner(System.in);
    private String estado;

    public Sinaleira(){
        estado = "Verde";
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String trocaEstado(){

        String trocar;
        System.out.println("Deseja troca o estado da sinaleira? ");
        System.out.println("Lembrando que ordem é verde → amarelo → vermelho → verde e assim por diante");
        trocar = in.next().toLowerCase();

        do{
            if (estado.equals("Verde")) {
                estado = "Amarelo";
                System.out.println("Estado atual da sinaleira é Amarelo");
            } else if (estado.equals("Amarelo")) {
                estado = "Vermelho";
                System.out.println("Estado atual da sinaleira é Vermelho");
            } else {
                estado = "Verde";
                System.out.println("Estado atual da sinaleira é Verde");
            }
            System.out.println("Deseja troca novamente estado da sinaleira? ");
            trocar = in.next().toLowerCase();

        }while(!trocar.equals("nao") && !trocar.equals("não"));
        return estado;
    }
    public void ultimoEstado(){
        System.out.println("O estado atual da sinaleira é " + estado);
    }
}
