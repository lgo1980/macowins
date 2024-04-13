package ar.edu.utn.frba.dds;

public class Tarjeta extends Venta {

    private Integer cantidadCuotas;
    private Double coeficienteTarjeta;

    @Override
    public Double conRecargo(Double importeBase) {
        return (importeBase *
                (this.coeficienteTarjeta * this.cantidadCuotas + 1.01));
    }
}
