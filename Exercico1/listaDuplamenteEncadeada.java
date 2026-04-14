package Exercico1;

public class listaDuplamenteEncadeada {
    private No inicio;
    private No fim;
    private int tamanho;

    public listaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public int getTamanho() {
        return tamanho;
    }

    // Inserção no início
    public void inserirNoInicio(int valor) {
        No novoNo = new No(valor);

        if (estaVazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
        tamanho++;
    }

    // Inserção no fim
    public void inserirNoFim(int valor) {
        No novoNo = new No(valor);

        if (estaVazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            novoNo.anterior = fim;
            fim.proximo = novoNo;
            fim = novoNo;
        }
        tamanho++;
    }

    // Inserir após um nó (pelo valor do nó de referência)
    public boolean inserirApos(int valorReferencia, int valor) {
        No noReferencia = buscar(valorReferencia);

        if (noReferencia == null) {
            System.out.println("Valor de referência " + valorReferencia + " não encontrado");
            return false;
        }

        No novoNo = new No(valor);

        novoNo.proximo = noReferencia.proximo;
        novoNo.anterior = noReferencia;

        if (noReferencia.proximo != null) {
            noReferencia.proximo.anterior = novoNo;
        } else {
            // Se for o último nó, atualiza o fim
            fim = novoNo;
        }

        noReferencia.proximo = novoNo;
        tamanho++;
        return true;
    }

    // Buscar um valor (retorna o nó)
    public No buscar(int valor) {
        No atual = inicio;

        while (atual != null) {
            if (atual.valor == valor) {
                return atual;
            }
            atual = atual.proximo;
        }

        return null;
    }

    // Buscar por posição (retorna o nó)
    public No buscarPorPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            return null;
        }

        No atual = inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }

        return atual;
    }

    // Remover o início
    public boolean removerInicio() {
        if (estaVazia()) {
            System.out.println("Lista vazia");
            return false;
        }

        if (tamanho == 1) {
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }

        tamanho--;
        return true;
    }

    // Remover o fim
    public boolean removerFim() {
        if (estaVazia()) {
            System.out.println("Lista vazia");
            return false;
        }

        if (tamanho == 1) {
            inicio = null;
            fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }

        tamanho--;
        return true;
    }

    // Remover um valor
    public boolean remover(int valor) {
        No noRemover = buscar(valor);

        if (noRemover == null) {
            System.out.println("Valor " + valor + " não encontrado");
            return false;
        }

        // Se for o primeiro nó
        if (noRemover.anterior == null) {
            return removerInicio();
        }

        // Se for o último nó
        if (noRemover.proximo == null) {
            return removerFim();
        }

        // Nó do meio
        noRemover.anterior.proximo = noRemover.proximo;
        noRemover.proximo.anterior = noRemover.anterior;
        tamanho--;

        return true;
    }

    // Exibir a lista do início ao fim
    public void exibir() {
        if (estaVazia()) {
            System.out.println("Lista vazia");
            return;
        }

        System.out.print("Lista (início -> fim): ");
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor);
            if (atual.proximo != null) {
                System.out.print(" <-> ");
            }
            atual = atual.proximo;
        }
        System.out.println(" | Tamanho: " + tamanho);
    }

    // Exibir a lista do fim ao início (para verificar os ponteiros)
    public void exibirReverso() {
        if (estaVazia()) {
            System.out.println("Lista vazia");
            return;
        }

        System.out.print("Lista (fim -> início): ");
        No atual = fim;
        while (atual != null) {
            System.out.print(atual.valor);
            if (atual.anterior != null) {
                System.out.print(" <-> ");
            }
            atual = atual.anterior;
        }
        System.out.println();
    }
}
