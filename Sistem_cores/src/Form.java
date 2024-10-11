public class Form {
    private Color cor;
    private String posicao;
    private int tamanho;

    public Form(Color cor, String posicao, int tamanho) {
        this.cor = cor;
        this.posicao = posicao;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Forma [cor=" + cor.getNome() + ", posição=" + posicao + ", tamanho=" + tamanho + "]";
    }
}
