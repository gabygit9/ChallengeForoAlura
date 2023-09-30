package alura.foro.domain.topico;

import alura.foro.domain.curso.Curso;
import alura.foro.domain.usuario.Usuario;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(@NotNull Long id, String titulo, String mensaje, Usuario autor, Curso curso) {

}
