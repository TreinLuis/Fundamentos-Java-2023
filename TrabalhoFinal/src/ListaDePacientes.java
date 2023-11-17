public class ListaDePacientes {
    private Paciente[] pacientes;
    private int tamanho;

    public ListaDePacientes(int capacidade) {
        this.pacientes = new Paciente[capacidade];
        this.tamanho = 0;
    }

    public void adicionarPaciente(Paciente paciente) {
        if (tamanho < pacientes.length) {
            pacientes[tamanho++] = paciente;
        } else {
            System.out.println("Lista de pacientes está cheia. Não é possível adicionar mais pacientes.");
        }
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
            System.out.println(pacientes[i]);
        }
    }
    public Paciente consultaNome(String nome){
        for(int i = 0;i< tamanho;i++)
            if(pacientes[i].getNome().equalsIgnoreCase(nome)){
                return pacientes[i];
            }else{
                return null
            }
     public Paciente consultaCodigo(int codigo){
        for(int i = 0;i< tamanho;i++)
            if(pacientes[i].getCodigo() == codigo){
                return pacientes[i];
            }else{
                return null
            }   
        
            
            
        
}
