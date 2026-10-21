public class Mesero extends Empleado {
    
    public void asignarMesa(Mesa mesa) {
        System.out.println("Mesa asignada.");
    }

    public void tomarPedido(Pedido ped) {
        System.out.println("Pedido tomado.");
    }
}