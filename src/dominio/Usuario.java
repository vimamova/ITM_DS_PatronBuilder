package dominio;

public class Usuario {

    private final String nombres; // Requeridos
    private final String apellidos; // Requeridos

    private final int edad; // Opcional
    private final String telefono; // Opcional
    private final String direccion; // Opcional

    public Usuario(UsuarioBuilder builder) {
        this.apellidos = builder.apellidos;
        this.nombres = builder.nombres;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;

    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public static class UsuarioBuilder {
        private final String nombres;
        private final String apellidos;

        private int edad;
        private String telefono;
        private String direccion;

        public UsuarioBuilder(String nombres, String apellidos) {
            this.nombres = nombres;
            this.apellidos = apellidos;
        }

        public UsuarioBuilder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public UsuarioBuilder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public UsuarioBuilder edad(int edad) {
            this.edad = edad;
            return this;
        }

        public Usuario build() {
            Usuario usuario = new Usuario(this);
            validadUsuario(usuario);
            return usuario;
        }

        public void validadUsuario(Usuario usuario) {
            // Validación de la información
        }

    }

}
