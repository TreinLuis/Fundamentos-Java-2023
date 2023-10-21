package Atividade2;

/**
 *Defina a classe Retângulo. Todo retângulo possui base e altura. Defina seus atributos (variáveis de instância) e métodos de instância básicos.
 * Implemente também um método que calcula a área e outro que calcula
 * o perímetro de um retângulo. Construa ainda um método que calcula o
 * comprimento da diagonal de um retângulo (use o teorema de Pitágoras).
 */
public class Retangulo
{
    double altura;
    double base;
    String cor;

    public Retangulo(){
        altura = 0;
        base = 0;
        cor = " ";
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getBase(){
        return altura;
    }
    public void setBase(double Base){
        this.base = base;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public double calculaPerimetro(){
        return base*2 + altura*2;
    }
    public double calculaArea(){
        return base*altura;
    }
    public double diagonal(){
        return Math.round(Math.sqrt(Math.pow(altura,2) + Math.pow(base,2))*100)/100;
    }

    public String toString(){
        return "\nA area do retângulo é de " + calculaArea() + "\nO perimetro é de " + calculaPerimetro() + "\nSua diagonal é de " + diagonal() + "\nSua cor é de " + getCor();
    }
}


