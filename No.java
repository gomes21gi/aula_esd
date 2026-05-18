import java.util.ArrayList;
import java.util.List;

public class No {

    String valor;
    No pai;
    List<No> filhos;

    public No(String valor, No pai) {
        this.valor = valor;
        this.pai = pai;
        filhos = new ArrayList<No>();
    }

    public void adicionarFilho(No filho) {
        filhos.add(filho);
    }
}
