//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserirNoInicio(14);
        lista.inserirNoInicio(98);
        lista.inserirNoInicio(7);
        lista.inserirNoInicio(47);
        lista.removerNoInicio();
        System.out.println(lista.inicio);
    }
}