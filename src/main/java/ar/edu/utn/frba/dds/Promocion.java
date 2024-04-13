package ar.edu.utn.frba.dds;

public class Promocion implements Estado {

    private Double descuento;

    public Promocion(Double descuento) {
        this.descuento = descuento;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    @Override
    public Double precio(Double precioBase) {

        return precioBase - this.descuento;
    }
}
