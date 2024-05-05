package logistica;

public class Conductor {



    private String matricula;
    private double capacidadMaximaCarga;
    private boolean disponible;

    public Conductor(String matricula, double capacidadMaximaCarga, boolean disponible) {
        this.matricula = matricula;
        this.capacidadMaximaCarga = capacidadMaximaCarga;
        this.disponible = disponible;
    }



    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getCapacidadMaximaCarga() {
        return capacidadMaximaCarga;
    }

    public void setCapacidadMaximaCarga(double capacidadMaximaCarga) {
        this.capacidadMaximaCarga = capacidadMaximaCarga;
    }


    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
