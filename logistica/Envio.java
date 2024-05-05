package logistica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Envio {
    private Cliente cliente;
    private Date fechaRecogidaPaquete;
    private Date fechaEntregaPaquete;
    private List <Articulo> articulos;
    private List <Coste> costes;

    public Envio(Cliente cliente, Date fechaRecogidaPaquete, Date fechaEntregaPaquete, Articulo articulo, Coste coste) {
        this.cliente = cliente;
        this.fechaRecogidaPaquete = fechaRecogidaPaquete;
        this.fechaEntregaPaquete = fechaEntregaPaquete;
        this.articulos = new ArrayList<Articulo>();
        this.costes = new ArrayList<>();
    }
    //agregamos artículos
    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);

    }
    public void agregarCoste (Coste coste){
        costes.add(coste);

    }

}
