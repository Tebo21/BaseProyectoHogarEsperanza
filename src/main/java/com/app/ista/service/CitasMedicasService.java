package com.app.ista.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ista.model.CitasMedicas;
import com.app.ista.repository.CitasMedicasRepository;



@Service
public class CitasMedicasService {
	
	@Autowired
	private CitasMedicasRepository citasMedicasRepository;
	
	
	public CitasMedicas guardarCitaMedica(CitasMedicas citasMedicas) {
		if (citasMedicasRepository.findAll().isEmpty()) {
			citasMedicas.setIdCitasMedicas(1);
        } else {
        	citasMedicas.setIdCitasMedicas(citasMedicasRepository.id().get(0).getIdCitasMedicas()+ 1);
        }
        return citasMedicasRepository.save(citasMedicas);
	}

}
