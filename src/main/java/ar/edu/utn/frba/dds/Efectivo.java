package ar.edu.utn.frba.dds;

public class Efectivo extends Venta{

    @Override
    public Double conRecargo(Double importeBase) {
        return importeBase;
    }
}
