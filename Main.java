public class Main {
    public static void main(String[] args) {
        Vetor meuVetor = new Vetor(5);
        meuVetor.inserir(2);
        meuVetor.inserir(4);
        meuVetor.inserir(6);
        meuVetor.inserir(12);
        meuVetor.inserir(21);
        meuVetor.remover(4);
        System.out.println(meuVetor);

    }
}