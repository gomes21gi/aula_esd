public class ListaEncadeada {

    No inicio;

    public ListaEncadeada() {

    }

    public void inserirNoInicio(int valor) {
        No novoNo = new No (valor);
        novoNo.proximo = this.inicio;
        this.inicio = novoNo;
    }

    public void removerNoInicio() {
        //this.inicio = this.inicio.proximo;
        No novoInicio = this.inicio.proximo;
        this.inicio = novoInicio;
    }

    public void remover(int valor) {
        No noAnterior = null;
        No noAtual = this.inicio;

        while (noAtual != null) {
            if (noAtual.valor == valor) {
                break;
            }
            noAnterior = noAtual;
            noAtual = noAtual.proximo;
        }

        if (noAtual == null) {
            System.out.println("Valor ñ encontrado para remover");
            return;
        }

        noAnterior.proximo = noAtual.proximo;
    }
}
