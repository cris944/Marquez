package pe.edu.upeu.syscasos.daoImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.syscasos.dao.AlumnoDAO;
import pe.edu.upeu.syscasos.entity.Alumno;
import pe.edu.upeu.syscasos.repository.AlumnoRepository;
@Component
public class AlumnoDaoImpl implements AlumnoDAO{
	
	@Autowired
	private AlumnoRepository repository;
	
	@Override
	public Alumno create(Alumno a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Alumno update(Alumno a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Alumno> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
