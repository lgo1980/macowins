package ar.edu.utn.frba.dds;

public class Liquidacion implements Estado {

    @Override
    public float precio(float precioBase) {

        return (float) (precioBase * 0.5);
    }
}
