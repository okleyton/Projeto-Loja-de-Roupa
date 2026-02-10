package kleyton.dcx.ufpb;

import java.io.Serializable;
import java.util.Objects;

public class Roupa implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private String tamanho;
    private double preco;

    public Roupa(String nome, String tamanho, double preco) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Roupa{" +
                "nome='" + nome + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Roupa)) return false;
        Roupa roupa = (Roupa) o;
        return Objects.equals(nome, roupa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}