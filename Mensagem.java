public class Mensagem {
    public String remetente;
    public String destinatario;
    public String conteudo;

    public Mensagem(String remetente, String destinatario, String conteudo) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return remetente + "," + destinatario + "," + conteudo;
    }

    public static Mensagem fromCsv(String linha) {
        String[] partes = linha.split(",", 3);
        return new Mensagem(partes[0], partes[1], partes[2]);
    }
}