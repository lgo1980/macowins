package ar.edu.utn.frba.dds;

import java.util.List;

public abstract class Venta {

    private List<Item> items;

    public abstract Double conRecargo(Double importeBase);


    public Double importe() {
        return conRecargo(this.items.stream()
                .mapToDouble(Item::importe)
                .sum());
    }

}
