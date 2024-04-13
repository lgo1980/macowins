package ar.edu.utn.frba.dds;

public class Promocion implements Estado {

    private float descuento;

    public Promocion(float descuento) {
        this.descuento = descuento;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    @Override
    public float precio(float precioBase) {

        return precioBase - this.descuento;
    }
}
