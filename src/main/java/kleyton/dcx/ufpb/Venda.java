package kleyton.dcx.ufpb;

import java.io.IOException;
import java.util.Collection;

public interface Venda {

    boolean cadastrarRoupa(Roupa roupa);

    Roupa pesquisarRoupa(String codigo) throws Exception;

    Collection<Roupa> listarRoupas();

    void salvarDados() throws IOException;

    void recuperarDados() throws IOException;
}