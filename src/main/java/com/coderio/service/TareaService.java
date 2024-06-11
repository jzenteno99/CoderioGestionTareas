package com.coderio.service;

import java.util.List;

import com.coderio.model.Tarea;

public interface TareaService {
	
	public List<Tarea> getAllTareas();

	public Tarea findTareaById(long id);
	
	public Tarea addTarea(Tarea body);
	
	public Tarea updateTarea(Tarea body);
	
	public boolean deleteTarea(long id);

}
