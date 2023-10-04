package br.com.alura.screenmatch.modelos;

public class Titulo {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    public int duracaoEmMinutos;

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }


    public void exibeFichaTecnica(){

        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento " + anoDeLancamento);


    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return Math.round( (somaDasAvaliacoes / totalDeAvaliacoes)*100.0 )/100.0;
    }
}
