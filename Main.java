import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Agendar horário");
            System.out.println("2. Ver agendamentos (comerciante)");
            System.out.println("3. Enviar mensagem");
            System.out.println("4. Ver mensagens");
            System.out.println("0. Sair");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> agendarHorario();
                case 2 -> listarAgendamentos();
                case 3 -> enviarMensagem();
                case 4 -> listarMensagens();
                case 0 -> System.exit(0);
            }
        }
    }

    static void agendarHorario() {
        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();
        System.out.print("Data e hora (ex: 2025-07-25 15:00): ");
        String dataHora = sc.nextLine();
        BancoCsv.salvar("agendamentos.csv", new Agendamento(nome, dataHora).toString());
        System.out.println("Agendado com sucesso!");
    }

    static void listarAgendamentos() {
        List<String> linhas = BancoCsv.ler("agendamentos.csv");
        if (linhas.isEmpty()) System.out.println("Nenhum agendamento.");
        else linhas.forEach(System.out::println);
    }

    static void enviarMensagem() {
        System.out.print("Remetente: ");
        String de = sc.nextLine();
        System.out.print("Destinatário: ");
        String para = sc.nextLine();
        System.out.print("Mensagem: ");
        String msg = sc.nextLine();
        BancoCsv.salvar("mensagens.csv", new Mensagem(de, para, msg).toString());
        System.out.println("Mensagem enviada!");
    }

    static void listarMensagens() {
        List<String> linhas = BancoCsv.ler("mensagens.csv");
        if (linhas.isEmpty()) System.out.println("Nenhuma mensagem.");
        else linhas.forEach(System.out::println);
    }
}