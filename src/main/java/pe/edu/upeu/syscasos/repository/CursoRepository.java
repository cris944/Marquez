package pe.edu.upeu.syscasos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.syscasos.entity.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{

}
