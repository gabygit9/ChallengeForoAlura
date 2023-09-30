package alura.foro.domain.topico;

import alura.foro.domain.curso.Curso;
import alura.foro.domain.usuario.Usuario;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosRegistroTopico(@NotBlank String titulo, @NotBlank String mensaje, @NotNull @Valid Usuario autor, @NotNull @Valid Curso curso) {
}
