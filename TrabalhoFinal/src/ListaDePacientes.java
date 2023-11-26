public class ListaDePacientes {
    private Paciente[] pacientes;
    private int tamanho;

    public ListaDePacientes(int capacidade) {
        this.pacientes = new Paciente[capacidade];
        this.tamanho = 0;
    }

    public boolean adicionarPaciente(Paciente paciente) {
        if(tamanho==0){
            pacientes[tamanho] = paciente;
            tamanho++;
            return true;
        }
        for(int i=0;i<tamanho;i++){
            if(pacientes[i].getCodigo() == paciente.getCodigo()){
                return false;
            }
            if(pacientes[i].getNome().equalsIgnoreCase(paciente.getNome())){
                return false;
            }
        }
            pacientes[tamanho] = paciente;
            tamanho++;
            return true;
    }

    public void removerPaciente(int codigo) {
        int indiceRemover = -1;
        for (int i = 0; i < tamanho; i++) {
            if (pacientes[i].getCodigo() == codigo) {
                indiceRemover = i;
                break;
            }
        }

        if (indiceRemover != -1) {
            for (int i = indiceRemover; i < tamanho - 1; i++) {
                pacientes[i] = pacientes[i + 1];
            }
            pacientes[tamanho - 1] = null;
            tamanho--;
            System.out.println("Paciente removido com sucesso!");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    public void listarPacientes() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(pacientes[i].getNome());
        }
    }

    public void listarPacientesPorIdade(int idadeInformada) {
        int controlador = 0;
        for (int i = 0; i < tamanho; i++) {
            if (pacientes[i].getIdade() >= idadeInformada) {
                controlador++;
                System.out.println(pacientes[i].getNome());
                if(controlador == 0){
                    System.out.println("Não temos nenhum paciente com uma idade superior á "+ idadeInformada);
                }
            }
        }
    }

    public Paciente consultaNome(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (pacientes[i].getNome().equalsIgnoreCase(nome)){
                return pacientes[i];
            }
        }
        return null;
    }

    public Paciente consultaCodigo(int codigo) {
        for (int i = 0; i < tamanho; i++) {
            if (pacientes[i].getCodigo() == codigo) {
                return pacientes[i];
            }
        }
        return null;
    }
    public void alteraPeso(int codigo, double peso) {
        if(peso >0 && peso <= 150){
            for (int i = 0; i < tamanho; i++) {
                if (pacientes[i].getCodigo() == codigo) {
                    System.out.println("Peso alterado com sucesso");
                    pacientes[i].setPeso(peso);
                }else{
                    System.out.println("Paciente não encontrado");
                }
            }
        }else{
            throw new IllegalArgumentException("Peso inválido");
        }
    }
    public void alteraAltura(int codigo, double altura) {
        if(altura > 0 && altura<=2.5){
            for (int i = 0; i < tamanho; i++) {
                if (pacientes[i].getCodigo() == codigo) {
                    System.out.println("Altura alterado com sucesso");
                    pacientes[i].setAltura(altura);
                }else{
                    System.out.println("Paciente não encontrado");
                }
            }
        }else{
            throw new IllegalArgumentException("Peso inválido");
        }
    }
    public void alteraSexo(int codigo, char sexo) {
        if(sexo == 'm' || sexo =='M' || sexo == 'f' || sexo =='F' ){
            for (int i = 0; i < tamanho; i++) {
                if (pacientes[i].getCodigo() == codigo) {
                    System.out.println("Sexo alterado com sucesso");
                    pacientes[i].setSexo(sexo);
                }else{
                    System.out.println("Paciente não encontrado");
                }
            }
        }else{
            throw new IllegalArgumentException("O sexo do paciente não pode ser nulo");
        }
    }
    public void exibeIMC(int codigo){
        for (int i = 0; i < tamanho; i++) {
            if (pacientes[i].getCodigo() == codigo) {
                double peso = pacientes[i].getPeso();
                double altura = pacientes[i].getAltura();
                System.out.print("O IMC do paciente de código número: "+ codigo +" é ");
                System.out.printf("%.2f",pacientes[i].imc(peso , altura));
            }else{
                System.out.println("Paciente não encontrado");
            }
        }
    }
}

