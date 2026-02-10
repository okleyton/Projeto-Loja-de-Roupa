package kleyton.dcx.ufpb;

import java.io.*;
import java.util.Map;

public class GravadorDeDados {

    private final String arquivo = "roupas.dat";

    public void salvarDados(Map<String, Roupa> roupas) throws IOException {
        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream(arquivo));
        oos.writeObject(roupas);
        oos.close();
    }

    @SuppressWarnings("unchecked")
    public Map<String, Roupa> recuperarDados() throws IOException {
        try {
            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream(arquivo));
            Map<String, Roupa> roupas =
                    (Map<String, Roupa>) ois.readObject();
            ois.close();
            return roupas;
        } catch (ClassNotFoundException e) {
            throw new IOException(e);
        } catch (FileNotFoundException e) {
            return new java.util.HashMap<>();
        }
    }
}