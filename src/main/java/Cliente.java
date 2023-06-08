import java.util.Scanner;

public class Cliente {
    static Scanner sc = new Scanner(System.in);

    public static void hacerPedido() {
        Pedido pedido1 = new Pedido();
        System.out.println("que desea agregar:");
        agregarPedido(pedido1);
        boolean salir=false;
        do {
            salir = opciones(pedido1);
        }while (salir==false);

    }

    public static void agregarPedido(Pedido pedido) {
        System.out.println("Ingrese los elementos del pedido (separados por coma):");
        String elementos = sc.nextLine();
        String[] elementosArray = elementos.split(",");
        for (String elemento : elementosArray) {
            pedido.getElPedido().add(elemento.trim());
        }

    }

    public static void eliminarPedido(Pedido pedido) {
        System.out.println("Ingrese el elemento a eliminar:");
        String elemento = sc.nextLine();
        if (pedido.getElPedido().contains(elemento)) {
            pedido.getElPedido().remove(elemento);
            System.out.println("Elemento eliminado del pedido.");
        } else {
            System.out.println("El elemento no existe en el pedido.");
        }
    }

    public static void verEstado(Pedido pedido) {
        System.out.println("Estado del pedido: " + pedido.getEstadoPedido());
    }

    private static void salirLocal() {
        // TODO - implement Cliente.salirLocal
        throw new UnsupportedOperationException();
    }

    private static boolean opciones(Pedido pedido) {
        System.out.println("que desea hacer: ");
        System.out.println("(1) agregar pedido");
        System.out.println("(2) eliminar pedido");
        System.out.println("(3) ver estado del pedido");
        System.out.println("(4) salir ");
        int opcionelegida;
        opcionelegida = sc.nextInt();

        switch (opcionelegida) {
            case 1:
                Cliente.agregarPedido(pedido);
                break;
            case 2:
                Cliente.eliminarPedido(pedido);
                break;
            case 3:
                Cliente.verEstado(pedido);
                break;
            case 4:
                salirLocal();
                return true;
            default:
                System.out.println("no existe esa opcion");
                break;

        }
        return false;
    }
}