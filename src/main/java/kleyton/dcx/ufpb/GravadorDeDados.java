package kleyton.dcx.ufpb;

import java.io.*;
import java.util.*;

public class GravadorDeDados {

    private final String ARQUIVO = "roupas.dat";

    public void salvarDados(Map<String, Roupa> roupas) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(ARQUIVO))) {
            oos.writeObject(roupas);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Map<String, Roupa> recuperarDados() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(ARQUIVO))) {
            return (Map<String, Roupa>) ois.readObject();
        } catch (Exception e) {
            return new HashMap<>();
        }
    }
}
