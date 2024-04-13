package ar.edu.utn.frba.dds;

import java.util.Date;
import java.util.List;

public class VentaEfectivo extends Venta {

  public VentaEfectivo(Date fecha) {
    super(fecha);
  }

  public VentaEfectivo(Date fecha, List<Item> items) {
    super(fecha, items);
  }

  @Override
  public Double conRecargo(Double importeBase) {
    return importeBase;
  }
}
