public class Agendamento {
    public String clienteNome;
    public String dataHora;

    public Agendamento(String clienteNome, String dataHora) {
        this.clienteNome = clienteNome;
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return clienteNome + "," + dataHora;
    }

    public static Agendamento fromCsv(String linha) {
        String[] partes = linha.split(",");
        return new Agendamento(partes[0], partes[1]);
    }
}