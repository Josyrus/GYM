package gym;

public class UsuarioInstructor extends Persona {
    private String especialidad;

    public UsuarioInstructor(String nombre, int edad, String genero, String identificacion, String especialidad) {
        super(nombre, edad, genero, identificacion);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Especialidad: " + especialidad);
    }
}
