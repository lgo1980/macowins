package ar.edu.utn.frba.dds;

import java.util.Date;
import java.util.List;

public class VentaTarjeta extends Venta {

  private Integer cantidadCuotas;
  private Double coeficienteTarjeta;

  public VentaTarjeta(Date fecha, Integer cantidadCuotas, Double coeficienteTarjeta) {
    super(fecha);
    this.cantidadCuotas = cantidadCuotas;
    this.coeficienteTarjeta = coeficienteTarjeta;
  }

  public VentaTarjeta(Date fecha, List<Item> items) {
    super(fecha, items);
  }

  @Override
  public Double conRecargo(Double importeBase) {
    return (importeBase * 1.01) + (this.coeficienteTarjeta * this.cantidadCuotas);
  }
}
