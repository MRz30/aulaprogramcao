package ExHospital;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Paciente> pacientes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n--- Sistema de Consulta Médica ---");
            System.out.println("1. Incluir Paciente");
            System.out.println("2. Alterar Paciente");
            System.out.println("3. Realizar Atendimento");
            System.out.println("4. Listar Pacientes");
            System.out.println("5. Mostrar Paciente");
            System.out.println("6. Apagar Paciente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    incluirPaciente();
                    break;
                case 2:
                    alterarPaciente();
                    break;
                case 3:
                    realizarAtendimento();
                    break;
                case 4:
                    listarPacientes();
                    break;
                case 5:
                    mostrarPaciente();
                    break;
                case 6:
                    apagarPaciente();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private static void incluirPaciente() {
        System.out.print("Nome do paciente: ");
        String nome = scanner.nextLine();
        System.out.print("Data de nascimento (AAAA-MM-DD): ");
        LocalDate dataNascimento = LocalDate.parse(scanner.nextLine());

        Paciente paciente = new Paciente(nome, dataNascimento);
        pacientes.add(paciente);
        System.out.println("Paciente incluído com sucesso.");
    }

    private static void alterarPaciente() {
        System.out.print("Nome do paciente a ser alterado: ");
        String nome = scanner.nextLine();

        Paciente paciente = buscarPaciente(nome);
        if (paciente != null) {
            System.out.print("Novo nome do paciente: ");
            paciente.setNome(scanner.nextLine());
            System.out.println("Paciente alterado com sucesso.");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    private static void realizarAtendimento() {
        System.out.print("Nome do paciente para atendimento: ");
        String nome = scanner.nextLine();

        Paciente paciente = buscarPaciente(nome);
        if (paciente != null) {
            System.out.print("Descrição do atendimento: ");
            String descricao = scanner.nextLine();
            Atendimento atendimento = new Atendimento(LocalDate.now(), descricao);
            paciente.adicionarAtendimento(atendimento);
            System.out.println("Atendimento realizado com sucesso.");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    private static void listarPacientes() {
        System.out.println("\n--- Lista de Pacientes ---");
        for (Paciente paciente : pacientes) {
            if (paciente.isAtivo()) {
                System.out.println(paciente);
            }
        }
    }

    private static void mostrarPaciente() {
        System.out.print("Nome do paciente a ser mostrado: ");
        String nome = scanner.nextLine();

        Paciente paciente = buscarPaciente(nome);
        if (paciente != null) {
            System.out.println(paciente);
            ArrayList<Atendimento> atendimentos = paciente.getAtendimentos();
            for (int i = 0; i < atendimentos.size(); i++) {
                System.out.println(atendimentos.get(i));
                if ((i + 1) % 5 == 0 && (i + 1) < atendimentos.size()) {
                    System.out.println("Pressione Enter para continuar...");
                    scanner.nextLine();
                }
            }
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    private static void apagarPaciente() {
        System.out.print("Nome do paciente a ser apagado: ");
        String nome = scanner.nextLine();

        Paciente paciente = buscarPaciente(nome);
        if (paciente != null) {
            paciente.desativar();
            System.out.println("Paciente apagado (desativado) com sucesso.");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    private static Paciente buscarPaciente(String nome) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNome().equalsIgnoreCase(nome) && paciente.isAtivo()) {
                return paciente;
            }
        }
        return null;
    }
}
