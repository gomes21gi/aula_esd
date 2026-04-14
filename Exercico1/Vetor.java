package Exercico1;

public class Vetor {
    private int[] vetor;
    private int numElementos;

    // Construtor: inicializa o vetor com tamanho fixo
    public Vetor(int tamanho) {
        this.vetor = new int[tamanho];
        this.numElementos = 0;
    }

    public int getNumElementos() {
        return this.numElementos;
    }

    public int getTamanho() {
        return this.vetor.length;
    }

    // Método privado para dobrar o tamanho do vetor
    private void dobrarTamanho() {
        int novoTamanho = this.vetor.length * 2;
        int[] novoVetor = new int[novoTamanho];

        // Copia os elementos para o novo vetor
        for (int i = 0; i < this.numElementos; i++) {
            novoVetor[i] = this.vetor[i];
        }

        this.vetor = novoVetor;
        System.out.println("Vetor expandido para tamanho: " + novoTamanho);
    }

    // Inserção: insere o valor na última posição; se o vetor estiver cheio, dobra o tamanho
    public boolean inserir(int valor) {
        if (numElementos == vetor.length) {
            dobrarTamanho();
        }

        vetor[numElementos] = valor;
        numElementos++;
        return true;
    }

    // Buscar: percorre item por item e retorna a posição se encontrado
    public int buscar(int valor) {
        for (int i = 0; i < numElementos; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    // Remoção: encontra o elemento, realoca os próximos uma posição para trás
    public boolean remover(int valor) {
        int posicao = buscar(valor);
        if (posicao == -1) {
            return false;
        }

        // Desloca os elementos para a esquerda
        for (int i = posicao; i < numElementos - 1; i++) {
            vetor[i] = vetor[i + 1];
        }

        numElementos--;
        return true;
    }

    // Exibir: Printa elemento por elemento do vetor
    public void exibir() {
        if (numElementos == 0) {
            System.out.println("Vetor vazio");
            return;
        }

        System.out.print("Vetor: [");
        for (int i = 0; i < numElementos; i++) {
            System.out.print(vetor[i]);
            if (i < numElementos - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Tamanho atual: " + numElementos + "/" + vetor.length);
    }

    // Inserção na posição: insere o valor na posição indicada, realocando os próximos elementos se necessário
    public boolean inserirNaPosicao(int posicao, int valor) {
        // Valida posição
        if (posicao < 0 || posicao > numElementos) {
            System.out.println("Posição inválida: " + posicao);
            return false;
        }

        // Se o vetor estiver cheio, dobra o tamanho
        if (numElementos == vetor.length) {
            dobrarTamanho();
        }

        // Desloca os elementos para a direita a partir da posição
        for (int i = numElementos; i > posicao; i--) {
            vetor[i] = vetor[i - 1];
        }

        // Insere o novo valor
        vetor[posicao] = valor;
        numElementos++;
        return true;
    }
}