//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FormManager manager = new FormManager();

        manager.addForma("Vermelho", "0,0", 55);
        manager.addForma("Verde", "1,2", 37);
        manager.addForma("Vermelho", "2,4", 28);
        manager.addForma("Azul", "3,6", 41);

        manager.apresentar();
    }
}