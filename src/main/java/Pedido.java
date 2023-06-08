import java.util.Collection;
import java.util.HashSet;

public class Pedido {
    Mesero guardarPedido;
    private Collection<String> elPedido;
    private int estadoPedido;

    public Pedido() {
        this.elPedido = new HashSet<>();
        this.estadoPedido = 0;
    }

    public Collection<String> getElPedido() {
        return this.elPedido;
    }

    public void setElPedido(Collection<String> elPedido) {
        this.elPedido = elPedido;
    }

    public int getEstadoPedido() {
        return this.estadoPedido;
    }

    public void guardarPedido() {
        // Implementa la lógica para guardar el pedido
    }

    public void iniciarPedido() {
        // Implementa la lógica para iniciar el pedido
    }
}