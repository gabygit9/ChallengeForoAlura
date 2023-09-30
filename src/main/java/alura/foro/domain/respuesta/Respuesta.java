package alura.foro.domain.respuesta;

import alura.foro.domain.topico.Topico;
import alura.foro.domain.usuario.Usuario;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "respuestas")
@Entity(name = "Respuesta")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensajes;
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    private Topico topico;
    private LocalDateTime fechaCreacion = LocalDateTime.now();
    @ManyToOne
    private Usuario autor;
    @Column(name = "solucion")
    private Boolean solucion;

    public Respuesta(DatosRegistroRespuesta datosRegistroRespuesta) {
        this.solucion=true;
        this.mensajes=datosRegistroRespuesta.mensajes();
        this.topico=datosRegistroRespuesta.topico();
        this.autor=datosRegistroRespuesta.autor();
    }

    public void actualizarDatos(DatosActualizarRespuesta datosActualizarRespuesta) {
        if(datosActualizarRespuesta.mensajes() != null){
            this.mensajes= datosActualizarRespuesta.mensajes();
        }

    }
}
