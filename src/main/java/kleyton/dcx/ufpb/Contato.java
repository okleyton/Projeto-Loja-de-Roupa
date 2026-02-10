package kleyton.dcx.ufpb;
import java.util.Objects;
import java.io.Serializable;

public class Contato implements Serializable {
    private String nome;
    private int diaAniversario;
    private int mesAniversario;

    public Contato(String nome, int dia, int mes) {
        this.nome = nome;
        this.diaAniversario = dia;
        this.mesAniversario = mes;

    }

    public String getNome() {
        return nome;
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public int getMesAniversario() {
        return mesAniversario;
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato)) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome);


    }

    @Override

    public int hasCode() {
        return Objects.hash(nome);
    }
}
