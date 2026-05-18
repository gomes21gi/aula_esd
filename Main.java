public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore("C://");
        arvore.adicionar("Arquivos");
        arvore.adicionar("Java");
        arvore.adicionar("PHP");
        System.out.println(arvore);
    }
}