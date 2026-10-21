public class Empleado {
    private int id_empleado;
    private String nombre;
    private String rol;

    public int getId_Empleado(){
        return id_empleado;
    }

    public void setId_Empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void iniciarTurno() {
        System.out.println(nombre + " inició el turno como " + rol + ".");
    }

    public void finTurno() {
        System.out.println(nombre + " acabó el turno.");
    }
}
