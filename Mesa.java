public class Mesa {
    private int numero_mesa;
    private int capacidad;
    private String estado;

    public int getNumero_Mesa() {
        return numero_mesa;
    }

    public void setNumero_Mesa(int numero_mesa) {
        this.numero_mesa = numero_mesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void ocupar() {
        this.estado = "Ocupada";
        System.out.println("Mesa ocupada.");
    }

    public void liberar() {
        this.estado = "Libre";
        System.out.println("Mesa liberada.");
    }
}
