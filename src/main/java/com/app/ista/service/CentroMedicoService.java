package com.app.ista.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ista.model.CentroMedico;
import com.app.ista.repository.CentroMedicoRepository;

@Service
public class CentroMedicoService {
	
	@Autowired
	private CentroMedicoRepository centroMedicoRepository;
	
	public CentroMedico guardarCentroMedico(CentroMedico centroMedico) {
		if (centroMedicoRepository.findAll().isEmpty()) {
			centroMedico.setIdCentroMedico(1);
        } else {
        	centroMedico.setIdCentroMedico(centroMedicoRepository.id().get(0).getIdCentroMedico()+ 1);
        }
        return centroMedicoRepository.save(centroMedico);
	}

}
