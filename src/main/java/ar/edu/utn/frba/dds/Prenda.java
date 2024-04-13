package ar.edu.utn.frba.dds;

public class Prenda {

    private TipoPrenda tipo;
    private Double precioBase;
    private Estado estado;

    public Prenda(TipoPrenda tipo, Double precioBase, Estado estado) {
        this.tipo = tipo;
        this.precioBase = precioBase;
        this.estado = estado;
    }

    public TipoPrenda getTipo() {
        return tipo;
    }

    public void setTipo(TipoPrenda tipo) {
        this.tipo = tipo;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
