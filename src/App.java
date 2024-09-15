import dominio.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario usuario1 = new Usuario.UsuarioBuilder("Viviana Maria", "Moreno Valencia")
                // sin mas datos
                .build();

        Usuario usuario2 = new Usuario.UsuarioBuilder("Adrián David", "Pelaez Garcia ")
                .edad(42)
                // sin telefono
                // sin direccion
                .build();

        Usuario usuario3 = new Usuario.UsuarioBuilder("Gaia", "Pelaez Moreno ")
                .edad(2)
                .telefono("3135963948")
                // sin direccion
                .build();

        Usuario usuario4 = new Usuario.UsuarioBuilder("Toxi", "Pelaez Moreno ")
                .telefono("3135963948")
                .direccion("Calle 124 # 50 - 12")
                // sin edad
                .build();

        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(usuario3);
        System.out.println(usuario4);

    }
}
