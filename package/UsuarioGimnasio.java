package gym;

public class UsuarioGimnasio extends Persona {
    private Membresia membresia;

    public UsuarioGimnasio(String nombre, int edad, String genero, String identificacion, Membresia membresia) {
        super(nombre, edad, genero, identificacion);
        this.membresia = membresia;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    public void mostrarInfo() {
        super.mostrarDatos();
        System.out.println("Tipo de Membresía: " + membresia.getTipo());
    }
}
