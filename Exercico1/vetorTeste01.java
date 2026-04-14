package Exercico1;

public class vetorTeste01 {
    public static void main(String[] args) {
        System.out.println("=== TESTE DO EXERCÍCIO 01 - VETORES ===\n");

        testarInsercaoComExpansao();
        testarBusca();
        testarRemocao();
        testarExibicao();
        testarInsercaoNaPosicao();
        testarCenariosCompletos();
    }

    static void testarInsercaoComExpansao() {
        System.out.println("--- Teste: Inserção com expansão automática ---");
        Vetor v = new Vetor(3);

        System.out.println("Vetor criado com tamanho inicial: 3");
        v.inserir(10);
        v.inserir(20);
        v.inserir(30);
        v.exibir();

        System.out.println("Inserindo 40 (deve expandir para 6)...");
        v.inserir(40);
        v.exibir();

        System.out.println("Inserindo 50...");
        v.inserir(50);
        v.exibir();

        System.out.println();
    }

    static void testarBusca() {
        System.out.println("--- Teste: Busca de elementos ---");
        Vetor v = new Vetor(5);
        v.inserir(10);
        v.inserir(20);
        v.inserir(30);
        v.inserir(40);

        System.out.println("Buscando 30: posição " + v.buscar(30));
        System.out.println("Buscando 100: posição " + v.buscar(100));
        System.out.println("Buscando 10: posição " + v.buscar(10));
        System.out.println();
    }

    static void testarRemocao() {
        System.out.println("--- Teste: Remoção de elementos ---");
        Vetor v = new Vetor(5);
        v.inserir(10);
        v.inserir(20);
        v.inserir(30);
        v.inserir(40);

        v.exibir();
        System.out.println("Removendo 20...");
        v.remover(20);
        v.exibir();

        System.out.println("Removendo 10...");
        v.remover(10);
        v.exibir();

        System.out.println("Removendo 99 (inexistente): " + v.remover(99));
        v.exibir();
        System.out.println();
    }

    static void testarExibicao() {
        System.out.println("--- Teste: Exibição do vetor ---");
        Vetor v1 = new Vetor(5);
        System.out.println("Vetor vazio:");
        v1.exibir();

        Vetor v2 = new Vetor(5);
        v2.inserir(100);
        v2.inserir(200);
        v2.inserir(300);
        System.out.println("Vetor com elementos:");
        v2.exibir();
        System.out.println();
    }

    static void testarInsercaoNaPosicao() {
        System.out.println("--- Teste: Inserção na posição ---");
        Vetor v = new Vetor(4);

        v.inserir(10);
        v.inserir(30);
        v.inserir(40);
        v.exibir();

        System.out.println("Inserindo 20 na posição 1:");
        v.inserirNaPosicao(1, 20);
        v.exibir();

        System.out.println("Inserindo 5 no início (posição 0):");
        v.inserirNaPosicao(0, 5);
        v.exibir();

        System.out.println("Inserindo 50 no final (posição " + v.getNumElementos() + "):");
        v.inserirNaPosicao(v.getNumElementos(), 50);
        v.exibir();

        System.out.println("Tentando inserir em posição inválida (10):");
        v.inserirNaPosicao(10, 99);
        System.out.println();
    }

    static void testarCenariosCompletos() {
        System.out.println("--- Teste: Cenário completo ---");
        Vetor v = new Vetor(2);

        System.out.println("Inserindo 1, 2, 3, 4, 5 (expansões automáticas):");
        v.inserir(1);
        v.inserir(2);
        v.inserir(3);  // Deve expandir para 4
        v.inserir(4);
        v.inserir(5);  // Deve expandir para 8
        v.exibir();

        System.out.println("Inserindo 99 na posição 2:");
        v.inserirNaPosicao(2, 99);
        v.exibir();

        System.out.println("Removendo 3:");
        v.remover(3);
        v.exibir();

        System.out.println("Removendo 1 e 5:");
        v.remover(1);
        v.remover(5);
        v.exibir();

        System.out.println("Buscando 99: posição " + v.buscar(99));
        System.out.println("Buscando 100: posição " + v.buscar(100));
    }
}
