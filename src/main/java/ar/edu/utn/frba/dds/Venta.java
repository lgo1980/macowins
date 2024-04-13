package ar.edu.utn.frba.dds;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Calendar;

public abstract class Venta {

  private List<Item> items;
  private Date fecha;

  public Venta(Date fecha) {
    this.fecha = fecha;
    this.items = new ArrayList<>();
  }

  public Venta(Date fecha, List<Item> items) {
    this.fecha = fecha;
    this.items = items;
  }

  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }

  public void agregarItem(Item item) {
    this.items.add(item);
  }

  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public abstract Double conRecargo(Double importeBase);

  public Double importe() {
    return conRecargo(this.items.stream()
        .mapToDouble(Item::importe)
        .sum());
  }

  public boolean esDeFecha(Date fecha) {
    Calendar cal1 = Calendar.getInstance();
    Calendar cal2 = Calendar.getInstance();
    cal1.setTime(this.fecha);
    cal2.setTime(fecha);
    return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
        cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH) &&
        cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH);
  }
}
