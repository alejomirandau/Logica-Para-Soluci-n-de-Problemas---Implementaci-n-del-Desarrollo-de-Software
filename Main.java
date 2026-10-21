import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("== Sistema ==");

        Mesero mesero = new Mesero();
        System.out.print("Ingrese la Cédula del mesero: ");
        mesero.setId_Empleado(teclado.nextInt());
        teclado.nextLine();
        System.out.print("Ingrese el nombre del mesero: ");
        mesero.setNombre(teclado.nextLine());
        mesero.setRol("Mesero");
        mesero.iniciarTurno();

        Cocinero cocinero = new Cocinero();
        System.out.print("Ingrese la Cédula del cocinero: ");
        cocinero.setId_Empleado(teclado.nextInt());
        teclado.nextLine();
        System.out.print("Ingrese el nombre del cocinero: ");
        cocinero.setNombre(teclado.nextLine());
        cocinero.setRol("Cocinero Pro");
        cocinero.iniciarTurno();
        System.out.println("---------------------------------------------------");

        System.out.println("== Cliente ==");
        Cliente cliente = new Cliente();
        System.out.print("Ingrese la C.C o T.I del cliente: ");
        cliente.setId_cliente(teclado.nextInt());
        teclado.nextLine();
        System.out.print("Ingrese el nombre del cliente: ");
        cliente.setNombre(teclado.nextLine());
        System.out.print("Ingrese el teléfono del cliente: ");
        cliente.setTelefono(teclado.nextLine());
        cliente.hacerReserva();
        System.out.println("---------------------------------------------------");

        Mesa mesa = new Mesa();
        System.out.print("Ingrese el número de la mesa a asignar: ");
        mesa.setNumero_Mesa(teclado.nextInt());
        teclado.nextLine();
        System.out.print("Ingrese la capacidad de la mesa:");
        mesa.setCapacidad(teclado.nextInt());
        mesa.setEstado("Libre");
        
        mesero.asignarMesa(mesa);
        mesa.ocupar(); 
        System.out.println("---------------------------------------------------");

        System.out.println("== Pedido ==");
        Plato plato = new Plato();
        plato.setId_plato(1);
        System.out.print("Ingrese el nombre del plato a pedir: ");
        plato.setNombre(teclado.nextLine());
        teclado.nextLine();
        System.out.print("Ingrese el precio del plato: ");
        plato.setPrecio(teclado.nextFloat());
        teclado.nextLine();
        System.out.print("Ingrese la categoría del plato");
        plato.setCategoria(teclado.nextLine());
        plato.obtenerDetalles();

        Pedido pedido = new Pedido();
        pedido.setId_pedido(5001);
        pedido.setFecha_hora(new Date());
        pedido.setEstado("Recibido");
        
        mesero.tomarPedido(pedido);
        pedido.agregarPlato(plato);
        pedido.calcularSubtotal();

        cocinero.prepararPedido(pedido);
        pedido.actualizarEstado("Cocinándose");
        pedido.actualizarEstado("Listo para servir");
        System.out.println("---------------------------------------------------");

        System.out.println("== Facturación ==");
        cliente.pedirCuenta();
        
        Factura factura = new Factura();
        factura.setId_factura(9001);
        factura.setTotal(plato.getPrecio()); 
        
        System.out.print("Ingrese el método de pago: ");
        factura.setMetodo_pago(teclado.nextLine());
        
        factura.generarFactura();
        System.out.println("Total a pagar: $" + factura.getTotal() + " con " + factura.getMetodo_pago());
        factura.procesarPago();
        System.out.println("---------------------------------------------------");

        mesa.liberar();
        mesero.finTurno();
        cocinero.finTurno();
        System.out.println("== Finalizado ==");
        
        teclado.close();
    }
}