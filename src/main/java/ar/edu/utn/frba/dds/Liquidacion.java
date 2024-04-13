package ar.edu.utn.frba.dds;

public class Liquidacion implements Estado {

    @Override
    public Double precio(Double precioBase) {
        return (precioBase * 0.5);
    }
}
