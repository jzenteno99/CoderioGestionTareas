package com.coderio.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderio.model.Tarea;
import com.coderio.service.TareaService;


@RestController
@RequestMapping("coderio/services")
public class TareasController {

	@Autowired
	private TareaService tareaService;
	
	private static final Logger LOG = LoggerFactory.getLogger(TareasController.class);
	private final String URL_ORIG_ANGULAR="http://localhost:4200";

	
	//@CrossOrigin(origins = URL_ORIG_ANGULAR)
	@GetMapping("/getTareas")
	public ResponseEntity<List<Tarea>> allTareas() {
		
		LOG.info("Consume service coderio/services/getTareas -- allTareas");
		List <Tarea> res = tareaService.getAllTareas();
		return ResponseEntity.ok(res);
	}

	@SuppressWarnings("deprecation")
	@GetMapping("/getTareas/{id}")
	public ResponseEntity<Tarea> getByIdClient(@PathVariable("id") long id){

		LOG.info("Consume service coderio/services/getTareas -- getByIdClient");
		Tarea res = tareaService.findTareaById(id);
		
		return 	ResponseEntity.ok(res);
	}
	
	@PostMapping("/addTarea")
	public ResponseEntity<Tarea> addTarea(@RequestBody Tarea body){

		LOG.info("Consume service coderio/services/addTarea -- addTarea");
		Tarea res = tareaService.addTarea(body);
		return ResponseEntity.ok(res);
		
	}
	
	@PutMapping("/updateTarea")
	public ResponseEntity<Tarea> updateTarea(@RequestBody Tarea body){

		LOG.info("Consume service coderio/services/updateTarea -- updateTarea");
		Tarea res = tareaService.updateTarea(body);
		return ResponseEntity.ok(res);
		
	}
	
	@DeleteMapping("/delateTarea/{id}")
	public ResponseEntity<Boolean> delateTarea(@PathVariable("id") long id){

		LOG.info("Consume service coderio/services/delateTarea -- updateTarea");
		boolean res = tareaService.deleteTarea(id);
		return ResponseEntity.ok(res);
		
	}
	
	
}
