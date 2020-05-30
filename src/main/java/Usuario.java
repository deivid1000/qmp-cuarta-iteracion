public class Usuario {

    private final String nombreUsuario;
    private TipoUsuario tipo;

    public Usuario (String username, TipoUsuario tipo_usuario) {
        nombreUsuario = username;
        tipo = tipo_usuario;
    }

}
