package ar.edu.utn.frba.dds;

public class Nueva implements Estado{

    @Override
    public Double precio(Double precioBase) {
        return precioBase;
    }
}
