package kleyton.dcx.ufpb;

import java.io.IOException;
import java.util.Collection;

public interface Venda {

    boolean cadastrarRoupa(String nome, String tamanho, double preco);
    Collection<Roupa> pesquisarPorTamanho(String tamanho);
    boolean removerRoupa(String nome) throws RoupaInexistenteException;
    void salvarDados() throws IOException;
    void recuperarDados() throws IOException;
}