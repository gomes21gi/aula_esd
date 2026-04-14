package Exercicio2;

public class listaTesteExercicio2 {
    public static void main(String[] args) {
        System.out.println("=== TESTE DO EXERCÍCIO 02 - LISTA DUPLAMENTE ENCADEADA ===\n");

        testarInsercaoInicio();
        testarInsercaoFim();
        testarInsercaoApos();
        testarBusca();
        testarRemocaoInicio();
        testarRemocaoFim();
        testarRemocaoValor();
        testarCenarioCompleto();
    }

    static void testarInsercaoInicio() {
        System.out.println("--- Teste: Inserção no início ---");
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.inserirNoInicio(30);
        lista.exibir();

        lista.inserirNoInicio(20);
        lista.exibir();

        lista.inserirNoInicio(10);
        lista.exibir();
        System.out.println();
    }

    static void testarInsercaoFim() {
        System.out.println("--- Teste: Inserção no fim ---");
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.inserirNoFim(10);
        lista.exibir();

        lista.inserirNoFim(20);
        lista.exibir();

        lista.inserirNoFim(30);
        lista.exibir();
        System.out.println();
    }

    static void testarInsercaoApos() {
        System.out.println("--- Teste: Inserção após um nó ---");
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.inserirNoFim(10);
        lista.inserirNoFim(30);
        lista.inserirNoFim(40);
        lista.exibir();

        System.out.println("Inserindo 20 após o 10:");
        lista.inserirApos(10, 20);
        lista.exibir();

        System.out.println("Inserindo 35 após o 30:");
        lista.inserirApos(30, 35);
        lista.exibir();

        System.out.println("Inserindo 50 após o 40 (no fim):");
        lista.inserirApos(40, 50);
        lista.exibir();

        System.out.println("Tentando inserir após valor inexistente (99):");
        lista.inserirApos(99, 100);
        System.out.println();
    }

    static void testarBusca() {
        System.out.println("--- Teste: Busca de valores ---");
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.inserirNoFim(10);
        lista.inserirNoFim(20);
        lista.inserirNoFim(30);
        lista.exibir();

        No noBuscado = lista.buscar(20);
        System.out.println("Buscando 20: encontrado (valor: " + noBuscado.valor + ")");

        noBuscado = lista.buscar(99);
        System.out.println("Buscando 99: " + (noBuscado == null ? "não encontrado" : "encontrado"));

        noBuscado = lista.buscarPorPosicao(1);
        System.out.println("Buscando por posição 1: valor = " + noBuscado.valor);

        System.out.println();
    }

    static void testarRemocaoInicio() {
        System.out.println("--- Teste: Remoção do início ---");
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.inserirNoFim(10);
        lista.inserirNoFim(20);
        lista.inserirNoFim(30);
        lista.exibir();

        System.out.println("Removendo início:");
        lista.removerInicio();
        lista.exibir();

        System.out.println("Removendo início:");
        lista.removerInicio();
        lista.exibir();

        System.out.println("Removendo início:");
        lista.removerInicio();
        lista.exibir();

        System.out.println("Tentando remover de lista vazia:");
        lista.removerInicio();
        System.out.println();
    }

    static void testarRemocaoFim() {
        System.out.println("--- Teste: Remoção do fim ---");
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.inserirNoFim(10);
        lista.inserirNoFim(20);
        lista.inserirNoFim(30);
        lista.exibir();

        System.out.println("Removendo fim:");
        lista.removerFim();
        lista.exibir();

        System.out.println("Removendo fim:");
        lista.removerFim();
        lista.exibir();

        System.out.println("Removendo fim:");
        lista.removerFim();
        lista.exibir();

        System.out.println("Tentando remover de lista vazia:");
        lista.removerFim();
        System.out.println();
    }

    static void testarRemocaoValor() {
        System.out.println("--- Teste: Remoção por valor ---");
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.inserirNoFim(10);
        lista.inserirNoFim(20);
        lista.inserirNoFim(30);
        lista.inserirNoFim(40);
        lista.inserirNoFim(50);
        lista.exibir();

        System.out.println("Removendo 30 (meio):");
        lista.remover(30);
        lista.exibir();

        System.out.println("Removendo 10 (início):");
        lista.remover(10);
        lista.exibir();

        System.out.println("Removendo 50 (fim):");
        lista.remover(50);
        lista.exibir();

        System.out.println("Removendo valor inexistente (99):");
        lista.remover(99);
        System.out.println();
    }

    static void testarCenarioCompleto() {
        System.out.println("--- Teste: Cenário completo ---");
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        System.out.println("Inserindo no início: 10, 20, 30");
        lista.inserirNoInicio(10);
        lista.inserirNoInicio(20);
        lista.inserirNoInicio(30);
        lista.exibir();
        lista.exibirReverso();

        System.out.println("\nInserindo no fim: 40, 50");
        lista.inserirNoFim(40);
        lista.inserirNoFim(50);
        lista.exibir();
        lista.exibirReverso();

        System.out.println("\nInserindo 25 após o 20:");
        lista.inserirApos(20, 25);
        lista.exibir();
        lista.exibirReverso();

        System.out.println("\nRemovendo o início:");
        lista.removerInicio();
        lista.exibir();

        System.out.println("\nRemovendo o fim:");
        lista.removerFim();
        lista.exibir();

        System.out.println("\nRemovendo o 25:");
        lista.remover(25);
        lista.exibir();

        System.out.println("\nBuscando 40: " + (lista.buscar(40) != null ? "encontrado" : "não encontrado"));
        System.out.println("Tamanho final: " + lista.getTamanho());
    }
}
