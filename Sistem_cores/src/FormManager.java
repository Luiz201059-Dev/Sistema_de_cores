import java.util.ArrayList;
import java.util.List;

public class FormManager {
    private List<Form> formas;
    private ColorFactory corFactory;

    public FormManager() {
        this.formas = new ArrayList<>();
        this.corFactory = new ColorFactory();
    }

    public void addForma(String nomeCor, String posicao, int tamanho) {
        Color cor = corFactory.getCor(nomeCor);
        Form forma = new Form(cor, posicao, tamanho);
        formas.add(forma);
    }

    public void apresentar() {
        for (Form forma : formas) {
            System.out.println(forma);
        }
    }
}