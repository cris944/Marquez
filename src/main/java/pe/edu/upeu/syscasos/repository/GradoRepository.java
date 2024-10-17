package pe.edu.upeu.syscasos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.syscasos.entity.Grado;

@Repository
public interface GradoRepository extends JpaRepository<Grado, Long>{

}
