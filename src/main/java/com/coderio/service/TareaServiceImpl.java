package com.coderio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderio.model.Tarea;
import com.coderio.repository.TareaRepository;

@Service
public class TareaServiceImpl implements TareaService {

	@Autowired
	private TareaRepository repository;
	
	@Override
	public List<Tarea> getAllTareas() {
		return repository.findAll();
	}

	@Override
	public Tarea findTareaById(long id) {
		try {
			return repository.getById((int) id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public Tarea addTarea(Tarea body) {
		return repository.save(body);
	}

	@Override
	public Tarea updateTarea(Tarea body) {
		return repository.save(body);
	}

	@Override
	public boolean deleteTarea(long id) {
		repository.deleteById((int) id);
		return true;
	}

}
