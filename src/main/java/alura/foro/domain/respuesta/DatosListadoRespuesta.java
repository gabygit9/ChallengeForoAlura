package alura.foro.domain.respuesta;


import java.time.LocalDateTime;

public record DatosListadoRespuesta(Long id, String mensajes, String mensaje, LocalDateTime fechaCreacion, String nombre) {
    public DatosListadoRespuesta(Respuesta respuesta){
        this(respuesta.getId(), respuesta.getMensajes(), respuesta.getTopico().getMensaje(), respuesta.getFechaCreacion(),respuesta.getAutor().getNombre());
    }
}
