package ar.edu.utn.frba.dds;

public class Item {

    private Integer cantidad;
    private Prenda prenda;

    public Double importe() {
        return this.prenda.getPrecioBase() * this.cantidad;
    }
}
