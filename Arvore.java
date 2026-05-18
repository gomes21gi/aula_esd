public class Arvore {

    No raiz;

    public Arvore(String valor) {
        this.raiz = new No(valor, null);
    }

    public void adicionar(String valor) {
        No novoNo = new No(valor, this.raiz);
        this.raiz.adicionarFilho(novoNo);
    }

    public void adicionar(String valor, String valorPai) {
        No pai = null;

        No novoNo = new No(valor, pai);
        pai.adicionarFilho(novoNo);
    }

    public No buscar(String valor) {
        return buscar(valor, this.raiz);
    }

    public No buscar(String valor, No atual) {
        if (valor == atual.valor) {
            return atual;
        }

        for (No filho : this.raiz.filhos) {
            if (filho.valor.equals(valor)) {
                return filho;
            }
        }
        return null;
    }

    public class Arvore {

        No raiz;

        public Arvore(String valor) {
            this.raiz = new No(valor, null);
        }

        public void adicionar(String valor) {
            No novoNo = new No(valor, this.raiz);
            this.raiz.adicionarFilho(novoNo);
        }

        public void adicionar(String valor, String valorPai) {
            No pai = null;

            No novoNo = new No(valor, pai);
            pai.adicionarFilho(novoNo);
        }

        public No buscar(String valor) {
            return buscar(valor, this.raiz);
        }

        public No buscar(String valor, No atual) {
            if (valor == atual.valor) {
                return atual;
            }

            for (No filho : this.raiz.filhos) {
                if (filho.valor.equals(valor)) {
                    return filho;
                }
            }
            return null;
        }
    }

}
