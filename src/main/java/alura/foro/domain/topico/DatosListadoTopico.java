package alura.foro.domain.topico;

import alura.foro.domain.curso.Curso;
import alura.foro.domain.usuario.Usuario;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public record DatosListadoTopico(Long id, String titulo, String mensaje, LocalDateTime fechaCreacion, StatusTopico status, Usuario autor, Curso curso) {
    public DatosListadoTopico (Topico topico){
        this(topico.getId(), topico.getTitulo(),topico.getMensaje(),topico.getFechaCreacion(), topico.getStatus(),topico.getAutor(),topico.getCurso());
    }

}
