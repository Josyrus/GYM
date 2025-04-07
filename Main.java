import gym.*;

public class Main {
    public static void main(String[] args) {
        Membresia membresia1 = new Membresia("General", 500, 30);
        UsuarioGeneral user1 = new UsuarioGeneral("Ana", 25, "Femenino", "U001", membresia1);
        user1.mostrarInfo();

        Membresia membresia2 = new Membresia("Premium", 900, 30);
        UsuarioPremium user2 = new UsuarioPremium("Carlos", 32, "Masculino", "U002", membresia2, "Acceso a spa y entrenador personal");
        user2.mostrarInfo();

        UsuarioInstructor instructor = new UsuarioInstructor("Laura", 28, "Femenino", "I001", "Entrenamiento funcional");
        instructor.mostrarDatos();
    }
}
