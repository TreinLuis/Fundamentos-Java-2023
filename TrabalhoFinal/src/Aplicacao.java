import java.util.*;
public class Aplicacao {
    public static void main(String[] args) {
        ListaDePacientes listaDePacientes = new ListaDePacientes(10);
        Scanner in = new Scanner(System.in);
        Paciente auxiliar;
        int opcao;
        do {
            menuPrincipal();
            System.out.print("Escolha uma opção: ");
            opcao = in.nextInt();

            switch (opcao) {
                case 1 :
                    // Adicionar Paciente
                    System.out.println("\nAdicionar Paciente:");
                    System.out.print("Código: ");
                    int codigo = in.nextInt();
                    System.out.print("Nome: ");
                    in.nextLine(); // Consumir a quebra de linha pendente
                    String nome = in.nextLine();
                    System.out.print("Sexo - Digite somente a inicial (Feminino/Masculino): ");
                    char sexo = in.next().charAt(0);
                    System.out.print("Peso: ");
                    double peso = in.nextDouble();
                    System.out.print("Altura (em Metros): ");
                    double altura = in.nextDouble();
                    System.out.print("Idade: ");
                    int idade = in.nextInt();
                    Paciente novoPaciente = new Paciente(codigo, nome, peso, sexo, altura, idade);
                    if(listaDePacientes.adicionarPaciente(novoPaciente)){
                        System.out.println("Paciente cadastrado com sucesso!");
                    }else{
                        System.out.println("Paciente não cadastrado!");
                    }
                    break;

                case 2:
                    // Remover Paciente
                    System.out.println("\nRemover Paciente:");
                    System.out.print("Digite o código do paciente a ser removido: ");
                    int codigoBusca = in.nextInt();
                    listaDePacientes.removerPaciente(codigoBusca);
                    break;
                case 3:
                    // Consulta Paciente por Nome
                    System.out.println("\nConsultar informações pelo nome do paciente:");
                    System.out.print("Digite o nome do paciente a ser consultado: ");
                    String pacienteNome = in.next();
                    auxiliar = listaDePacientes.consultaNome(pacienteNome);
                    if(auxiliar == null){
                        System.out.println("Paciente não encontrado!");
                    } else{
                        System.out.println(auxiliar.toString());
                    }
                    break;
                case 4:
                    // Consulta Paciente por Código
                    System.out.println("\nConsultar informações pelo código do paciente:");
                    System.out.print("Digite o código do paciente a ser consultado: ");
                    int pacienteCodigo = in.nextInt();
                    auxiliar = listaDePacientes.consultaCodigo(pacienteCodigo);
                    if(auxiliar == null){
                        System.out.println("Paciente não encontrado!");
                    } else{
                        System.out.println(auxiliar.toString());
                    }
                    break;
                case 5:
                    // Exibe somente o IMC
                    System.out.println("\nExibe IMC: ");
                    System.out.println("Informe o código: ");
                    codigoBusca = in.nextInt();
                    listaDePacientes.exibeIMC(codigoBusca);
                    break;
                case 6:
                // Listar Pacientes Apartir de Uma Idade Informada
                listaDePacientes.mediaDasIdades();
                break;
                case 7:
                    // Listar Pacientes Apartir de Uma Idade Informada
                    System.out.println("\nLista de Pacientes Apartir de Uma Idade Informada:");
                    System.out.println("Informe uma Idade: ");
                    int idadeInformada = in.nextInt();
                    listaDePacientes.listarPacientesPorIdade(idadeInformada);
                    break;
                case 8:
                    // Listar Todos Pacientes
                    System.out.println("\nLista de Todos os Pacientes:");
                    listaDePacientes.listarPacientes();
                    break;
                case 9:
                    // Alterar Alguma Informações de Um Determinado Paciente
                    System.out.print("Digite o código do paciente!");
                    codigoBusca = in.nextInt();
                    System.out.println("Digite o novo peso do paciente");
                    double novoPeso = in.nextDouble();

                    listaDePacientes.alteraPeso(codigoBusca,novoPeso);
                    break;
                case 10:
                    // Alterar Alguma Informações de Um Determinado Paciente
                    System.out.print("Digite o código do paciente!");
                     codigoBusca = in.nextInt();
                    System.out.println("Digite a nova altura do paciente");
                    double novaAltura = in.nextDouble();

                    listaDePacientes.alteraAltura(codigoBusca,novaAltura);
                    break;
                case 11:
                    // Alterar Alguma Informações de Um Determinado Paciente
                    System.out.print("Digite o código do paciente!");
                    codigoBusca = in.nextInt();
                    System.out.println("Digite o novo Sexo - Digite somente a inicial (Feminino/Masculino): ");
                    char novoSexo = in.next().charAt(0);
                    listaDePacientes.alteraSexo(codigoBusca,novoSexo);
                    break;
                case 0:
                    // Sair
                    System.out.println("Saindo do programa. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }
    public static void menuPrincipal(){
        Scanner in = new Scanner(System.in);
        System.out.println("\nMenu:");
        System.out.println("1 . Adicionar Paciente");
        System.out.println("2 . Remover Paciente");
        System.out.println("3 . Consultar Informações Pelo Nome Do Paciente");
        System.out.println("4 . Consultar Informações Pelo Código Do Paciente");
        System.out.println("5 . Consultar Somente IMC!");
        System.out.println("6 . Exibir a Media Das Idades!");
        System.out.println("7 . Listar Pacientes Apartir De Uma Idade Informada");
        System.out.println("8 . Listar Todos Os Pacientes");
        System.out.println("9 . Alterar Peso!");
        System.out.println("10. Alterar Altura!");
        System.out.println("11. Alterar Sexo!");
        System.out.println("00. Sair");
    }
}
