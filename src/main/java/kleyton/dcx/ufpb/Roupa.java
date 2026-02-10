package kleyton.dcx.ufpb;

import java.io.Serializable;

public class Roupa implements Serializable {

    private static final long serialVersionUID = 1L;

    private String codigo;
    private String nome;
    private String tamanho;
    private double preco;

    public Roupa(String codigo, String nome, String tamanho, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
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
}