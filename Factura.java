public class Factura {
    private int id_factura;
    private float impuestos;
    private float total;
    private String metodo_pago;

    public int getId_factura() { 
        return id_factura; 
    }

    public void setId_factura(int id_factura) { 
        this.id_factura = id_factura; 
    }

    public float getImpuestos() { 
        return impuestos; 
    }

    public void setImpuestos(float impuestos) { 
        this.impuestos = impuestos; 
    }

    public float getTotal() { 
        return total; 
    }

    public void setTotal(float total) { 
        this.total = total; 
    }

    public String getMetodo_pago() { 
        return metodo_pago; 
    }

    public void setMetodo_pago(String metodo_pago) { 
        this.metodo_pago = metodo_pago; 
    }

    public void generarFactura() {
        System.out.println("Factura generada.");
    }

    public void procesarPago() {
        System.out.println("Pago procesado");
    }
}