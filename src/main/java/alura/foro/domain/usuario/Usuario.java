package alura.foro.domain.usuario;

import alura.foro.domain.topico.Topico;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Table(name = "usuarios")
@Entity(name = "Usuario")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nombre;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String contrasena;
    private Boolean activo;


    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public Usuario(DatosRegistroUsuario datosRegistroUsuario) {
        this.activo=true;
        this.nombre=datosRegistroUsuario.nombre();
        this.email=datosRegistroUsuario.email();
        this.contrasena=datosRegistroUsuario.contrasena();
    }

    @Override
    public String toString() {
        return "\"" + nombre + "\"";
    }

    public void actualizarDatos(DatosActualizarUsuario datosActualizarUsuario) {
        if (datosActualizarUsuario.nombre() != null){
            this.nombre=datosActualizarUsuario.nombre();
        }
        if (datosActualizarUsuario.email() != null){
            this.email=datosActualizarUsuario.email();
        }
    }

    public void desactivarUsuario() {
        this.activo=false;
    }
}
