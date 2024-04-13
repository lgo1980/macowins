package ar.edu.utn.frba.dds;

import java.util.Calendar;
import java.util.Date;

public class Principal {

  public static void main(String[] args) {

    Calendar calendario = Calendar.getInstance();
    calendario.set(Calendar.YEAR, 2024);
    calendario.set(Calendar.MONTH, Calendar.APRIL);
    calendario.set(Calendar.DAY_OF_MONTH, 13);
    calendario.set(Calendar.HOUR_OF_DAY, 10); // 10 AM
    calendario.set(Calendar.MINUTE, 0);
    calendario.set(Calendar.SECOND, 0);
    calendario.set(Calendar.MILLISECOND, 0);

    Date fecha1 = calendario.getTime();

    Calendar calendario2 = Calendar.getInstance();
    calendario2.set(Calendar.YEAR, 2024);
    calendario2.set(Calendar.MONTH, Calendar.APRIL);
    calendario2.set(Calendar.DAY_OF_MONTH, 12);
    calendario2.set(Calendar.HOUR_OF_DAY, 10); // 10 AM
    calendario2.set(Calendar.MINUTE, 0);
    calendario2.set(Calendar.SECOND, 0);
    calendario2.set(Calendar.MILLISECOND, 0);

    Date fecha2 = calendario2.getTime();


    Nueva nueva = new Nueva();
    Promocion promocion1 = new Promocion(50.0);
    Promocion promocion2 = new Promocion(100.0);
    Liquidacion liquidacion = new Liquidacion();
    Prenda prendaNueva = new Prenda(TipoPrenda.CAMPERA, 150.0, nueva);
    Item itemNuevo = new Item(2, prendaNueva);
    Venta ventaEfvo = new VentaEfectivo(fecha1);
    ventaEfvo.agregarItem(itemNuevo);
    Prenda prendaPromo1 = new Prenda(TipoPrenda.CAMPERA, 150.0, promocion1);
    Item itemPromo1 = new Item(4, prendaPromo1);
    ventaEfvo.agregarItem(itemPromo1);
    Venta ventaTarjeta = new VentaTarjeta(fecha1, 1, 0.1);
    Prenda prendaPromo2 = new Prenda(TipoPrenda.CAMPERA, 150.0, promocion2);
    Item itemPromo2 = new Item(2, prendaPromo2);
    ventaTarjeta.agregarItem(itemPromo2);
    Prenda prendaLiqui = new Prenda(TipoPrenda.CAMPERA, 150.0, liquidacion);
    Item itemLiqui = new Item(2, prendaLiqui);
    ventaTarjeta.agregarItem(itemLiqui);
    Prenda prendaNueva2 = new Prenda(TipoPrenda.CAMPERA, 150.0, nueva);
    Item itemNuevo1 = new Item(5, prendaNueva2);
    Venta ventaEfvo2 = new VentaEfectivo(fecha2);
    ventaEfvo2.agregarItem(itemNuevo1);
    TiendaDeRopa tiendaDeRopa = new TiendaDeRopa();
    tiendaDeRopa.registrarVenta(ventaEfvo);
    tiendaDeRopa.registrarVenta(ventaEfvo2);
    tiendaDeRopa.registrarVenta(ventaTarjeta);
    System.out.println(tiendaDeRopa.gananciaDia(fecha1));
  }
}
