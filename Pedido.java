import java.util.Date;

public class Pedido {
    private int id_pedido;
    private Date fecha_hora;
    private String estado;

    public int getId_pedido() { 
        return id_pedido; 
    }

    public void setId_pedido(int id_pedido) { 
        this.id_pedido = id_pedido; 
    }

    public Date getFecha_hora() { 
        return fecha_hora; 
    }

    public void setFecha_hora(Date fecha_hora) { 
        this.fecha_hora = fecha_hora; 
    }

    public String getEstado() { 
        return estado; 
    }

    public void setEstado(String estado) { 
        this.estado = estado; 
    }

    public void agregarPlato(Plato plato) {
        System.out.println("Plato agregado al pedido.");
    }

    public void calcularSubtotal() {
        System.out.println("Calculando subtotal");
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("Estado actualizado a: " + nuevoEstado);
    }
}