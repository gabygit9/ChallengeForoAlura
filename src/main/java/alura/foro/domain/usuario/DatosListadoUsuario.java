package alura.foro.domain.usuario;

public record DatosListadoUsuario(String nombre) {
    public DatosListadoUsuario (Usuario usuario){
        this(usuario.getNombre());
    }
}
