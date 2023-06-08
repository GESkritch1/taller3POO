import java.util.Collection;
import java.util.ArrayList;

public class Mesero {

    Pedido comidaPedida;
    Collection<Plato> hacerPlatos;
    private Collection<String> pedidos;

    public Mesero() {
        this.pedidos = new ArrayList<>();
    }

    public Collection<String> getPedidos() {
        return this.pedidos;
    }

    public void guardarPedidosdePedido() {
        // Implementa la lógica para guardar los pedidos del mesero
    }

    public void decirPedidosAPlato() {
        // Implementa la lógica para decir los pedidos al plato
    }
}