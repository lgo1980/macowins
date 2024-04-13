package ar.edu.utn.frba.dds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PrendaTest {

  private Nueva nueva;
  private Promocion promocion1;
  private Promocion promocion2;
  private Liquidacion liquidacion;
  private Prenda prenda;

  @BeforeEach
  public void setUp() {
    this.nueva = new Nueva();
    this.promocion1 = new Promocion(50.0);
    this.promocion2 = new Promocion(100.0);
    this.liquidacion = new Liquidacion();
    this.prenda = new Prenda(TipoPrenda.CAMPERA, 150.0, this.nueva);
  }

  @DisplayName("El precio del estado nuevo")
  @Test
  public void precioNuevaTest() {
    Assertions.assertEquals(150.0, this.prenda.precio());
  }

  @DisplayName("El precio de los estados promocion")
  @Test
  public void precioPromocionTest() {
    this.prenda.setEstado(this.promocion1);
    Assertions.assertEquals(100.0, this.prenda.precio());
    this.prenda.setEstado(this.promocion2);
    Assertions.assertEquals(50.0, this.prenda.precio());
  }

  @DisplayName("El precio del estado Liquidación")
  @Test
  public void precioLiquidacionTest() {
    this.prenda.setEstado(this.liquidacion);
    Assertions.assertEquals(75.0, this.prenda.precio());
  }
}
