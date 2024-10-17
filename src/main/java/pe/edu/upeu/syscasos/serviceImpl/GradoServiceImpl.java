package pe.edu.upeu.syscasos.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.syscasos.dao.GradoDAO;
import pe.edu.upeu.syscasos.entity.Grado;
import pe.edu.upeu.syscasos.service.GradoService;

@Service
public class GradoServiceImpl implements GradoService{
	
	@Autowired
	private GradoDAO dao;
	
	@Override
	public Grado create(Grado g) {
		// TODO Auto-generated method stub
		return dao.create(g);
	}

	@Override
	public Grado update(Grado g) {
		// TODO Auto-generated method stub
		return dao.update(g);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Grado> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Grado> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
