package kleyton.dcx.ufpb;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class GravadorDeDados {

    private static final String ARQUIVO_ROUPAS = "roupas.dat";

    public void salvarRoupas(Map<String, Roupa> roupas) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(ARQUIVO_ROUPAS));
        oos.writeObject(roupas);
        oos.close();
    }

    @SuppressWarnings("unchecked")
    public Map<String, Roupa> recuperarRoupas() throws IOException {
        try {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(ARQUIVO_ROUPAS));
            Map<String, Roupa> roupas = (HashMap<String, Roupa>) ois.readObject();
            ois.close();
            return roupas;
        } catch (ClassNotFoundException e) {
            throw new IOException(e);
        }
    }
}