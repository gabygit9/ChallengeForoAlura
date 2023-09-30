package alura.foro.controller;

import alura.foro.domain.respuesta.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/respuestas")
public class RespuestasController {

    @Autowired
    private RespuestaRepository respuestaRepository;

    @PostMapping
    public void registrarRespuesta(@RequestBody @Valid DatosRegistroRespuesta datosRegistroRespuesta){
        respuestaRepository.save(new Respuesta(datosRegistroRespuesta));
    }


    @GetMapping
    public Page<DatosListadoRespuesta> listadoRespuestas(Pageable paginacion) {
        return respuestaRepository.findAll(paginacion).map(DatosListadoRespuesta::new);
    }

    @PutMapping
    @Transactional
    public void actualizarRespuestas(@RequestBody @Valid DatosActualizarRespuesta datosActualizarRespuesta){
        Respuesta respuesta = respuestaRepository.getReferenceById(datosActualizarRespuesta.id());
        respuesta.actualizarDatos(datosActualizarRespuesta);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void eliminarRespuesta(@PathVariable Long id){
        Respuesta respuesta = respuestaRepository.getReferenceById(id);
        respuestaRepository.delete(respuesta);
    }
}
