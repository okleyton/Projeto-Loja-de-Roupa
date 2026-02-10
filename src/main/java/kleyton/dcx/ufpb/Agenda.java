package kleyton.dcx.ufpb;
import java.util.Collection;
import java.io.IOException;


public interface Agenda {

    boolean cadastraContato( String nome, int dia, int mes);
    void salvarDados() throws IOException;
    void recuperarDados() throws IOException;
}
