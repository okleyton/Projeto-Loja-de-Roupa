package kleyton.dcx.ufpb;

public class VendaAddController {

    private VendaRoupas sistema;

    public VendaAddController(VendaRoupas sistema) {
        this.sistema = sistema;
    }

    public void cadastrar(String codigo, String descricao, double valor) {
        sistema.cadastrarRoupa(codigo, descricao, valor);
    }
}
