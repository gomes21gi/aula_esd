//public class Vetor {
//
//    int[] vetor;
//    int tamanho;
//    int numElementos;
//
//    public Vetor(int tamanho) {
//        this.tamanho = tamanho;
//        this.vetor = new int[tamanho];
//        this.numElementos = 0;
//    }
//
//    public boolean inserir(int valor) {
//        if (numElementos == tamanho) {
//            System.out.println("vetor cheio");
//            return false;
//        }
//        this.vetor[numElementos] = valor;
//        numElementos++;
//        return true;
//
////        for (int indice = 0; indice < this.tamanho; indice++) {
////            if (this.vetor[indice] == 0) {
////                this.vetor[indice] = valor;
////                this.numElementos++;
////                return true;
////            }
////        }
////        return false;
//    }
//
//    public int buscar(int valor) {
//        for (int i = 0; i < numElementos; i++) {
//            if (vetor[i] == valor) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
////    public boolean remover(int valor) {
////        for (int i = 0; i < numElementos; i++) {
////            if (vetor[i] == valor) {
////                vetor[i] = 0;
////                numElementos--;
////                return true;
////            }
////
////        }
////        return false;
////    }
//
//    public boolean remover(int valor) {
//        int posicao = buscar(valor);
//        if (posicao == -1) {
//            return false;
//        }
//        for (int indice = 0; indice < numElementos - 1; indice++) {
//            this.vetor[indice] = vetor[indice + 1];
//        }
//
//        this.vetor[numElementos - 1] = 0;
//        numElementos--;
//        return true;
//    }
//}

public class Vetor {
    private int[] vetor;
    private int numElementos;

    // Construtor: inicializa o vetor com tamanho fixo [2]
    public Vetor(int tamanho) {
        this.vetor = new int[tamanho];
        this.numElementos = 0;
    }

    public int getNumElementos() {
        return this.numElementos;
    }

    // Inserção: adiciona na última posição disponível [5]
    public boolean inserir(int valor) {
        if (numElementos < vetor.length) {
            vetor[numElementos] = valor;
            numElementos++;
            return true;
        }
        return false; // Vetor cheio
    }

    // Busca: verifica item por item e retorna a posição [6]
    public int buscar(int valor) {
        for (int i = 0; i < numElementos; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    // Remoção pelo valor: localiza e desloca os itens para não deixar espaços [4, 6, 7]
    public boolean remover(int valor) {
        int posicao = buscar(valor);
        if (posicao != -1) {
            // Regra da alocação contígua: desloca itens subsequentes para trás [6, 7]
            for (int i = posicao; i < numElementos - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            numElementos--;
            return true;
        }
        return false;
    }
}