package PrimeiroProjetoPOO;

public class Quadrado{
    /*
     * atributos da classe
     */
    private double lado;
    private String cor;

    /*
     * método construtor. usando para criar instâncias de quadrado
     */
    public Quadrado(){
        lado = 0;
        cor = "";
    }

    /*
     * papel dos métodos gets:
     * retornar o conteúdos de atributos de uma classe
     */
    public double getLado(){
        return lado;
    }

    public String getCor(){
        return cor;
    }

    /*
     * papel dos métodos sets:
     * alterar o conteúdo de atributos de uma classe,
     * dando a eles o contéudo da variável de parâmetro
     */
    public void setLado(double novoLado){
        lado = novoLado;
    }

    public void setCor(String novaCor){
        cor = novaCor;
    }

    public double calculaArea(){
        return lado*lado;
    }

    public double calculaPerimetro(){
        return lado*4;
    }

    /*
     * imprime o conteúdo do objeto
     */

    public String toString(){
        return "Lado: "+getLado() + "\nCor: "+ getCor() +"\nArea: "+calculaArea();
    }

}