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