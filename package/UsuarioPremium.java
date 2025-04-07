package gym;

public class UsuarioPremium extends UsuarioGimnasio {
    private String beneficios;

    public UsuarioPremium(String nombre, int edad, String genero, String identificacion, Membresia membresia, String beneficios) {
        super(nombre, edad, genero, identificacion, membresia);
        this.beneficios = beneficios;
    }

    // Getter y setter
    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Beneficios adicionales: " + beneficios);
    }
}
