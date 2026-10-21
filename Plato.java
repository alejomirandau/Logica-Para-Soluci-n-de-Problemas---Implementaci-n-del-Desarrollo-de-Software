public class Plato {
    private int id_plato;
    private Float precio;
    private String nombre;
    private String categoria;

    // Getters y Setters
    public int getId_plato() { 
        return id_plato; 
    }

    public void setId_plato(int id_plato) { 
        this.id_plato = id_plato; 
    }

    public Float getPrecio() { 
        return precio; 
    }

    public void setPrecio(Float precio) { 
        this.precio = precio; 
    }

    public String getNombre() { 
        return nombre; 
    }

    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public String getCategoria() { 
        return categoria; 
    }

    public void setCategoria(String categoria) { 
        this.categoria = categoria; 
    }

    public void obtenerDetalles() {
        System.out.println("Detalles del plato: " + nombre);
    }

    public void actualizarDisponibilidad() {
        System.out.println("Disponibilidad actualizada.");
    }
}