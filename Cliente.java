public class Cliente {
    private int id_cliente;
    private String telefono;
    private String nombre;

    public int getId_cliente() { 
        return id_cliente; 
    }

    public void setId_cliente(int id_cliente) { 
        this.id_cliente = id_cliente; 
    }

    public String getTelefono() { 
        return telefono; 
    }

    public void setTelefono(String telefono) { 
        this.telefono = telefono; 
    }

    public String getNombre() { 
        return nombre; 
    }

    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public void hacerReserva() {
        System.out.println("Reserva realizada");
    }

    public void pedirCuenta() {
        System.out.println("Cuenta solicitada");
    }
}