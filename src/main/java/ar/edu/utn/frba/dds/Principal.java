package ar.edu.utn.frba.dds;

import java.util.Date;

public class Principal {

  public static void main(String[] args) {
    Nueva nueva = new Nueva();
    Promocion promocion1 = new Promocion(50.0);
    Promocion promocion2 = new Promocion(100.0);
    Liquidacion liquidacion = new Liquidacion();
    Prenda prendaNueva = new Prenda(TipoPrenda.CAMPERA, 150.0, nueva);
    Item itemNuevo = new Item(2, prendaNueva);
    Venta ventaEfvo = new VentaEfectivo(new Date());
    ventaEfvo.agregarItem(itemNuevo);
    Prenda prendaPromo1 = new Prenda(TipoPrenda.CAMPERA, 150.0, promocion1);
    Item itemPromo1 = new Item(4, prendaPromo1);
    ventaEfvo.agregarItem(itemPromo1);
    Venta ventaTarjeta = new VentaTarjeta(new Date(), 1, 0.1);
    Prenda prendaPromo2 = new Prenda(TipoPrenda.CAMPERA, 150.0, promocion2);
    Item itemPromo2 = new Item(2, prendaPromo2);
    ventaTarjeta.agregarItem(itemPromo2);
    Prenda prendaLiqui = new Prenda(TipoPrenda.CAMPERA, 150.0, liquidacion);
    Item itemLiqui = new Item(2, prendaLiqui);
    ventaTarjeta.agregarItem(itemLiqui);
    Prenda prendaNueva2 = new Prenda(TipoPrenda.CAMPERA, 150.0, nueva);
    Item itemNuevo1 = new Item(5, prendaNueva2);
    Venta ventaEfvo2 = new VentaEfectivo(new Date());
    ventaEfvo2.agregarItem(itemNuevo1);
    TiendaDeRopa tiendaDeRopa = new TiendaDeRopa();
    tiendaDeRopa.registrarVenta(ventaEfvo);
    tiendaDeRopa.registrarVenta(ventaEfvo2);
    tiendaDeRopa.registrarVenta(ventaTarjeta);
    System.out.println(tiendaDeRopa.ventasDelDia(new Date()));
  }
}
