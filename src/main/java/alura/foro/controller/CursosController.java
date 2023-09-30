package alura.foro.controller;

import alura.foro.domain.curso.Curso;
import alura.foro.domain.curso.CursoRepository;
import alura.foro.domain.curso.DatosActualizarCurso;
import alura.foro.domain.curso.DatosListadoCurso;
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
@RequestMapping("/cursos")
public class CursosController {

    @Autowired
    private CursoRepository cursoRepository;

    @PostMapping
    public ResponseEntity<List<Curso>> crearCurso(@RequestBody @Valid List<Curso> cursos){
        List<Curso> cursosGuardados = cursoRepository.saveAll(cursos);
        return ResponseEntity.ok(cursosGuardados);
    }

    @GetMapping
    public Page<DatosListadoCurso> listadoCursos(Pageable paginacion){

        return cursoRepository.findAll(paginacion).map(DatosListadoCurso::new);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DatosListadoCurso> obtenerCurso(@PathVariable Long id){
        Optional<Curso> cursoOptional = cursoRepository.findById(id);
        if(cursoOptional.isPresent()){
            Curso curso = cursoOptional.get();
            DatosListadoCurso datosListadoCurso = new DatosListadoCurso(curso);
            return ResponseEntity.ok(datosListadoCurso);
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping
    @Transactional
    public void actualizarDatos(@RequestBody @Valid DatosActualizarCurso datosActualizarCurso){
        Curso curso = cursoRepository.getReferenceById(datosActualizarCurso.id());
        curso.actualizarDatos(datosActualizarCurso);
    }
}
