package ar.edu.utn.frba.dds;

import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TiendaDeRopaTest {

  private TiendaDeRopa tiendaDeRopa;

  @BeforeEach
  public void setUp() {
    Nueva nueva = new Nueva();
    Promocion promocion1 = new Promocion(50.0);
    Promocion promocion2 = new Promocion(100.0);
    Liquidacion liquidacion = new Liquidacion();
    Prenda prendaNueva = new Prenda(TipoPrenda.CAMPERA, 150.0, nueva);
    Item itemNuevo = new Item(2, prendaNueva);
    Venta ventaEfvo = new VentaEfectivo(this.obtenerFechaEspecifica(2024, 3, 3));
    ventaEfvo.agregarItem(itemNuevo);
    Prenda prendaPromo1 = new Prenda(TipoPrenda.CAMPERA, 150.0, promocion1);
    Item itemPromo1 = new Item(4, prendaPromo1);
    ventaEfvo.agregarItem(itemPromo1);
    Venta ventaTarjeta = new VentaTarjeta(this.obtenerFechaEspecifica(2024, 3, 3), 1, 0.1);
    Prenda prendaPromo2 = new Prenda(TipoPrenda.CAMPERA, 150.0, promocion2);
    Item itemPromo2 = new Item(2, prendaPromo2);
    ventaTarjeta.agregarItem(itemPromo2);
    Prenda prendaLiqui = new Prenda(TipoPrenda.CAMPERA, 150.0, liquidacion);
    Item itemLiqui = new Item(2, prendaLiqui);
    ventaTarjeta.agregarItem(itemLiqui);
    Prenda prendaNueva2 = new Prenda(TipoPrenda.CAMPERA, 150.0, nueva);
    Item itemNuevo1 = new Item(5, prendaNueva2);
    Venta ventaEfvo2 = new VentaEfectivo(this.obtenerFechaEspecifica(2024, 3, 4));
    ventaEfvo.agregarItem(itemNuevo1);
    this.tiendaDeRopa = new TiendaDeRopa();
    this.tiendaDeRopa.registrarVenta(ventaEfvo);
    this.tiendaDeRopa.registrarVenta(ventaEfvo2);
    this.tiendaDeRopa.registrarVenta(ventaTarjeta);
  }

  @DisplayName("La ganancia del dia")
  @Test
  public void gananciaDiaTest() {
    Assertions.assertEquals(952.6, this.tiendaDeRopa.gananciaDia(this.obtenerFechaEspecifica(2024, 3, 3)));
  }

  public Date obtenerFechaEspecifica(int anno, int mes, int dia) {
    Calendar calendario = Calendar.getInstance();
    calendario.set(Calendar.YEAR, anno);
    calendario.set(Calendar.MONTH, mes);
    calendario.set(Calendar.DAY_OF_MONTH, 13);
    calendario.set(Calendar.HOUR_OF_DAY, 10); // 10 AM
    calendario.set(Calendar.MINUTE, 0);
    calendario.set(Calendar.SECOND, 0);
    calendario.set(Calendar.MILLISECOND, 0);

    return calendario.getTime();
  }
}
