package kleyton.dcx.ufpb;

import java.io.Serializable;

public class Roupa implements Serializable {

    private static final long serialVersionUID = 1L;

    private String codigo;
    private String descricao;
    private double valor;

    public Roupa(String codigo, String descricao, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                "\nDescrição: " + descricao +
                "\nValor: R$ " + valor;
    }
}
