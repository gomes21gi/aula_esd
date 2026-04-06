public class ListaEncadeada {

    No inicio;

    No fim;

    public ListaEncadeada() {}

    public void inserirNoInicio(int valor) {
        No novoNo = new No(valor);

        if (this.estaVazia()) {
            this.inserirPrimeiro(novoNo);
            return;
        }

        No antigoInicio = inicio;
        antigoInicio.anterior = novoNo;

        novoNo.proximo = antigoInicio;
        this.inicio = novoNo;
    }

    public void inserirPrimeiro(No novoNo) {
        this.inicio = novoNo;
        this.fim = novoNo;
    }

    public boolean estaVazia() {
        return inicio == null;
    }


    public No buscar(int valor) {
        if (estaVazia()) return null;

        No atual = inicio;
        while (atual.proximo != null) {
            if (atual.valor == valor) {
                break;
            }

            atual = atual.proximo;
        }

        return atual;
    }

//    public void inserirNoInicio(int valor) {
//        No novoNo = new No (valor);
//        novoNo.proximo = this.inicio;
//        this.inicio = novoNo;
//    }
//
//    public void removerNoInicio() {
//        //this.inicio = this.inicio.proximo;
//        No novoInicio = this.inicio.proximo;
//        this.inicio = novoInicio;
//    }
//
//    public void remover(int valor) {
//        No noAnterior = null;
//        No noAtual = this.inicio;
//
//        while (noAtual != null) {
//            if (noAtual.valor == valor) {
//                break;
//            }
//            noAnterior = noAtual;
//            noAtual = noAtual.proximo;
//        }
//
//        if (noAtual == null) {
//            System.out.println("Valor ñ encontrado para remover");
//            return;
//        }
//
//        noAnterior.proximo = noAtual.proximo;
//    }
}