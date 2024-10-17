package pe.edu.upeu.syscasos.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.syscasos.dao.AlumnoDAO;
import pe.edu.upeu.syscasos.entity.Alumno;
import pe.edu.upeu.syscasos.service.AlumnoService;

@Service
public class AlumnoServiceImpl  implements AlumnoService {

	@Autowired
	private AlumnoDAO dao;
	
	@Override
	public Alumno create(Alumno a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Alumno update(Alumno a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Alumno> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
