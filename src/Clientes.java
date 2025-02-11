import java.util.ArrayList;
import java.util.List;

public class Clientes {
    private List<String> clientes = new ArrayList<String>();
    private String nomeCliente;

    public Clientes(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCliente() {
        return nomeCliente;
    }


}
