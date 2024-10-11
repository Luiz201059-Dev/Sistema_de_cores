import java.util.HashMap;
import java.util.Map;

public class ColorFactory {
    private Map<String, Color> cores = new HashMap<>();

    public Color getCor(String nome) {
        Color cor = cores.get(nome);
        if (cor == null) {
            cor = new Color(nome);
            cores.put(nome, cor);
        }
        return cor;
    }
}