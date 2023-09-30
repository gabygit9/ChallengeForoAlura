package alura.foro.domain.respuesta;

import alura.foro.domain.topico.Topico;
import alura.foro.domain.usuario.Usuario;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroRespuesta(@NotBlank String mensajes,@NotNull @Valid Topico topico,@NotNull @Valid Usuario autor) {
}
