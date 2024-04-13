package ar.edu.utn.frba.dds;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class TiendaDeRopa {

  private final List<Venta> ventas;

  public TiendaDeRopa() {
    this.ventas = new ArrayList<>();
  }

  public void registrarVenta(Venta venta) {
    this.ventas.add(venta);
  }

  public Double gananciaDia(Date fecha) {
    List<Venta> ventas = ventasDelDia(fecha);
    return ventas.stream()
        .mapToDouble(Venta::importe)
        .sum();
  }

  public List<Venta> ventasDelDia(Date fecha) {
    return this.ventas.stream()
        .filter(venta -> venta.esDeFecha(fecha))
        .collect(Collectors.toList());
  }

}
