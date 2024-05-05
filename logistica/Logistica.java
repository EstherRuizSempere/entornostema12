package logistica;

import java.util.ArrayList;
import java.util.List;

class Logistica {
    private List<Envio> enviosList;
    private List<Vehiculo> vehiculosList;
    private List<Conductor> conductoresList;

    public Logistica() {
        this.enviosList = new ArrayList<>();
        this.vehiculosList = new ArrayList<>();
        this.conductoresList = new ArrayList<>();
    }

    //método para añadir los datos:

    public void nuevoEnvio (Envio envio){
        enviosList.add(envio);
    }

    public void agregarVehiculo (Vehiculo vehiculo){
        vehiculosList.add(vehiculo);
    }

    public void agregarConductor (Conductor conductor){
        conductoresList.add(conductor);
    }
}
