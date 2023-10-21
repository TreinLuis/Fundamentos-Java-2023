package Atividade1;

public class Esfera {
    private double raio;
    private String cor;

    public Esfera() {
        raio = 0;
        cor = " ";
    }

    public double getRaio() {
        return raio;
    }

    public String getCor() {
        return cor;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double calculaVolume() {
        return (4 / 3) * Math.PI * Math.pow(raio, 3);
    }

    public double calculaArea() {
        return (4) * Math.PI * Math.pow(raio, 2);
    }
    public void info(){
        System.out.println("Você informou que a esfera possuí raio " + raio + " de cor "+ cor);
        System.out.printf("A area desta esfera é de %.2f" , calculaArea());
        System.out.printf("\nO volume desta esfera é de %.2f" , calculaArea());
    }

}