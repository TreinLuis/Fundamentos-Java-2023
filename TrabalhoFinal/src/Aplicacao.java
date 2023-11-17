import java.util.*;
public class Aplicacao {
    public static void main(String[] args) {
        ListaDePacientes listaDePacientes = new ListaDePacientes(10);
        Scanner scanner = new Scanner(System.in);
        Paciente auxiliar = new Paciente;

        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Paciente");
            System.out.println("2. Remover Paciente");
            System.out.println("3. Consultar informações pelo nome do paciente");
            System.out.println("4. Consultar informações pelo código do paciente");
            System.out.println("5. Listar Pacientes Apartir de Uma Idade Informada");
            System.out.println("6. Listar Todos os Pacientes");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Adicionar Paciente
                    System.out.println("\nAdicionar Paciente:");
                    System.out.print("Código: ");
                    int codigo = scanner.nextInt();
                    System.out.print("Nome: ");
                    scanner.nextLine(); // Consumir a quebra de linha pendente
                    String nome = scanner.nextLine();
                    System.out.print("Sexo - Digite somente a inicial (H/M): ");
                    char sexo = scanner.next().charAt(0);
                    System.out.print("Peso: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Altura: ");
                    double altura = scanner.nextDouble();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();

                    Paciente novoPaciente = new Paciente(codigo, nome, peso, sexo, altura, idade);
                    listaDePacientes.adicionarPaciente(novoPaciente);

                    System.out.println("Paciente adicionado com sucesso!");
                    break;

                case 2:
                    // Remover Paciente
                    System.out.println("\nRemover Paciente:");
                    System.out.print("Digite o código do paciente a ser removido: ");
                    int codigoRemover = scanner.nextInt();
                    listaDePacientes.removerPaciente(codigoRemover);
                    break;
                case 3:
                    // Consulta Paciente por Nome
                    System.out.println("\nConsultar informações pelo nome do paciente:");
                    System.out.print("Digite o nome do paciente a ser consultado: ");
                    String pacienteNome = scanner.next();
                    auxiliar = listaDePacientes.consultaNome(pacienteNome);
                    if(auxilar == null){
                        System.out.println("Paciente não encontrado!");
                    } else{
                        System.out.println(auxilar.toString())
                    }
                    break;
                case 4:
                   // Consulta Paciente por Código
                    System.out.println("\nConsultar informações pelo código do paciente:");
                    System.out.print("Digite o código do paciente a ser consultado: ");
                    int pacienteCodigo = scanner.nextInt();
                    auxiliar = listaDePacientes.consultaCodigo(pacienteCodigo);
                    if(auxilar == null){
                        System.out.println("Paciente não encontrado!");
                    } else{
                        System.out.println(auxilar.toString())
                    }
                case 5:
                    // Listar Pacientes Apartir de Uma Idade Informada
                    System.out.println("\nLista de Pacientes Apartir de Uma Idade Informada:");
                    System.out.println("Informe uma Idade: ");
                    int idadeInformada = in.nextInt();
                    listaDePacientes.listarPacientesPorIdade(idadeInformada);
                    break;
                case 6:
                    // Listar Todos Pacientes
                    System.out.println("\nLista de Todos os Pacientes:");
                    listaDePacientes.listarPacientes();
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
}


