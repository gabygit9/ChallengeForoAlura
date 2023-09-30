package alura.foro.controller;

import alura.foro.domain.topico.DatosListadoTopico;
import alura.foro.domain.topico.Topico;
import alura.foro.domain.usuario.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public void registrarUsuario(@RequestBody @Valid DatosRegistroUsuario datosRegistroUsuario){
        usuarioRepository.save(new Usuario(datosRegistroUsuario));
    }

    @GetMapping
    public Page<DatosListadoUsuario> listadoUsuarios(Pageable paginacion){
        return usuarioRepository.findByActivoTrue(paginacion).map(DatosListadoUsuario::new);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DatosListadoUsuario> obtenerUsuario(@PathVariable Long id){
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);
        if(usuarioOptional.isPresent()){
            Usuario usuario = usuarioOptional.get();
            DatosListadoUsuario datosListadoUsuario= new DatosListadoUsuario(usuario);
            return ResponseEntity.ok(datosListadoUsuario);
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping
    @Transactional
    public void actualizarUsuario(@RequestBody @Valid DatosActualizarUsuario datosActualizarUsuario){
        Usuario usuario = usuarioRepository.getReferenceById(datosActualizarUsuario.id());
        usuario.actualizarDatos(datosActualizarUsuario);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void eliminarUsuario(@PathVariable Long id){
        Usuario usuario = usuarioRepository.getReferenceById(id);
        usuario.desactivarUsuario();
    }
}
