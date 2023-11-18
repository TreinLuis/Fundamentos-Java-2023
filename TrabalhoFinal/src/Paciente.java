public class Paciente {
    private int codigo;
    private String nome;
    private double peso;
    private char sexo;
    private double altura;
    private int idade;

    public Paciente(int codigo,String nome,double peso,char sexo,double altura,int idade){
        this.codigo = codigo;
        if(nome != null && !nome.isEmpty()){
            this.nome = nome;
        }else{
            throw new IllegalArgumentException("O nome do paciente não pode estar vazio!");
        }
        if(peso >0 && peso <= 150){
            this.peso = peso;
        }else{
            throw new IllegalArgumentException("Peso inválido");
        }
        if(sexo == 'f' || sexo =='F' || sexo == 'M' || sexo =='m' ){
            this.sexo = sexo;
        }else{
            throw new IllegalArgumentException("O sexo do paciente não pode ser nulo");
        }
        if(altura > 0 && altura<=2.5){
            this.altura = altura;
        }else{
            throw new IllegalArgumentException("Altura inválida");
        }
        if(idade >= 0 && idade<=120){
            this.idade = idade;
        }else{
            throw new IllegalArgumentException("Idade inválida");
        }

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty()){
            this.nome = nome;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso >0 && peso <= 150){
            this.peso = peso;
        }
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if(sexo == 'F' || sexo =='f' || sexo =='M' || sexo =='m' ){
            this.sexo = sexo;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura > 0 && altura<=2.5){
            this.altura = altura;
        }

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade >= 0 && idade<=120){
            this.idade = idade;
        }

    }
    public double imc(double peso,double altura){
        return peso/Math.pow(altura,2);
    }
    public double pesoIdael(double altura, char sexo){
        if(sexo == 'm' || sexo =='M'){
            return 72.7 * altura -58;
        }else{
            return 62.1 * altura -44.7;
        }
    }
    @Override
    public String toString() {
        String sexoPrint;
        if (sexo == 'm' || sexo == 'M') {
            sexoPrint = "Masculino";
        } else {
            sexoPrint = "Feminino";
        }
        return String.format("Código: %d, Nome: %s, Sexo: %s, Peso: %.2f kg, Altura: %.2f m, Idade: %d, IMC: %.2f, Peso Ideal: %.2f kg",
                codigo, nome, sexoPrint, peso, altura, idade, imc(peso, altura), pesoIdael(altura, sexo));
    }
}

