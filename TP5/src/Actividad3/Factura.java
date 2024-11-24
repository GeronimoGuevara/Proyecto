package Actividad3;

import java.util.ArrayList;

public class Factura {
    private String fechaFactura;
    private Long numeroFactura;
    private double totalCalculadoFactura;
    private String cliente;
    private ArrayList<DetalleFactura> detallesFactura = new ArrayList<>();

    public Factura() {
        this(null, null, 0.0, null);
    }

    public Factura(String fechaFactura, Long numeroFactura, double totalCalculadoFactura, String cliente) {
        this.fechaFactura = fechaFactura;
        this.numeroFactura = numeroFactura;
        this.totalCalculadoFactura = totalCalculadoFactura;
        this.cliente = cliente;
    }


    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Long getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(Long numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public double getTotalCalculadoFactura() {
        return totalCalculadoFactura;
    }

    public void setTotalCalculadoFactura(double totalCalculadoFactura) {
        this.totalCalculadoFactura = totalCalculadoFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public ArrayList<DetalleFactura> getDetallesFactura() {
        return detallesFactura;
    }

    public void addDetalleFactura(DetalleFactura detalle) {
        detallesFactura.add(detalle);
    }

    public void calcularMontoTotal () {
        totalCalculadoFactura = 0;
        for(DetalleFactura detalle: detallesFactura){
            totalCalculadoFactura += detalle.getSubTotal();

        }
    }
}


