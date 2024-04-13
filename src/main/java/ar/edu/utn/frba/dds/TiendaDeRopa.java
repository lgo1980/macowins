package ar.edu.utn.frba.dds;

import java.util.List;

public class TiendaDeRopa {

   private List<Venta> ventas;

    public void registrarVenta(Venta venta){
        this.ventas.add(venta);
    }

    public Double gananciaDia(){
        return ventasDelDia()
                .sum(venta -> venta.importe());
    }

    public List<Venta> ventasDelDia(fecha){
        return ventas
                .filter(venta -> venta.esDeFecha(fecha));
    }

}
