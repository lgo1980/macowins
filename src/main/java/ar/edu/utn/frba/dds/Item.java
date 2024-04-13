package ar.edu.utn.frba.dds;

public class Item {

  private Integer cantidad;
  private Prenda prenda;

  public Item(Integer cantidad, Prenda prenda) {
    this.cantidad = cantidad;
    this.prenda = prenda;
  }

  public Integer getCantidad() {
    return cantidad;
  }

  public void setCantidad(Integer cantidad) {
    this.cantidad = cantidad;
  }

  public Prenda getPrenda() {
    return prenda;
  }

  public void setPrenda(Prenda prenda) {
    this.prenda = prenda;
  }

  public Double importe() {
    return this.prenda.precio() * this.cantidad;
  }
}
