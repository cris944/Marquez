package pe.edu.upeu.syscasos.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.syscasos.dao.GradoDAO;
import pe.edu.upeu.syscasos.entity.Grado;
import pe.edu.upeu.syscasos.repository.GradoRepository;
@Component
public class GradoDaoImpl implements GradoDAO{

	@Autowired
	private GradoRepository repository;
	
	@Override
	public Grado create(Grado a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Grado update(Grado a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Grado> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Grado> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
