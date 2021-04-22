package com.app.ista.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ista.model.ActividadPersona;
import com.app.ista.repository.ActividadPersonaRepository;

@Service
public class ActividadPersonaService {
	
	@Autowired
	ActividadPersonaRepository actividadPersonaRepository;
	
	public ActividadPersona guardarActividadPersona(ActividadPersona actividadPersona) {
		if (actividadPersonaRepository.findAll().isEmpty()) {
			actividadPersona.setIdActividadPersona(1);
        } else {
        	actividadPersona.setIdActividadPersona(actividadPersonaRepository.id().get(0).getIdActividadPersona()+ 1);
        }
		return actividadPersonaRepository.save(actividadPersona);
	}

}