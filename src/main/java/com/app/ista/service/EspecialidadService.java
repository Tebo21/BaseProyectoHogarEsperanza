package com.app.ista.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ista.model.Especialidad;
import com.app.ista.repository.EspecialidadRepository;

@Service
public class EspecialidadService {

	@Autowired
	private EspecialidadRepository especiarepo;

	public Especialidad guardarEspecialidad(Especialidad especialidad) {
		if (especiarepo.findAll().isEmpty()) {
			especialidad.setIdEspecialidad(1);
		} else {
			especialidad.setIdEspecialidad(especiarepo.id().get(0).getIdEspecialidad() + 1);
		}
		return especiarepo.save(especialidad);
	}
}
