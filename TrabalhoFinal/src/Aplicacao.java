import java.util.*;
public class Aplicacao {
    public static void main(String[] args) {
        ListaDePacientes listaDePacientes = new ListaDePacientes(10);
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Paciente");
            System.out.println("2. Remover Paciente");
            System.out.println("3. Listar Pacientes");
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
                    // Listar Pacientes
                    System.out.println("\nLista de Pacientes:");
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


