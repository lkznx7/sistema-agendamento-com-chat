import java.io.*;
import java.util.*;

public class BancoCsv {
    public static void salvar(String arquivo, String linha) {
        try (FileWriter fw = new FileWriter(arquivo, true)) {
            fw.write(linha + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> ler(String arquivo) {
        List<String> linhas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                linhas.add(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linhas;
    }
}