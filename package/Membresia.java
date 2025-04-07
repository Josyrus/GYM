package gym;

public class Membresia {
    private String tipo; // General, Premium, etc.
    private double costo;
    private int duracionDias;

    public Membresia(String tipo, double costo, int duracionDias) {
        this.tipo = tipo;
        this.costo = costo;
        this.duracionDias = duracionDias;
    }

    // Getters y setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }
}
