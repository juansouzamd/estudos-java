package estrutura_de_dados;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {
    public static void main(String[] args) {
        String codigo = "R";
        String classe = obterClasse(codigo);
        System.out.println(classe); // Saída: ClasseA
    }

    public static String obterClasse(String codigo) {
        Map<String, String> classes = new HashMap<>();
        classes.put("R", "ClasseA");
        classes.put("G", "ClasseB");
        classes.put("B", "ClasseC");

        return classes.getOrDefault(codigo, "ClasseDesconhecida");
    }
}

