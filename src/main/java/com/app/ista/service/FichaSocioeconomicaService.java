package com.app.ista.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ista.model.FichaSocioeconomica;
import com.app.ista.repository.FichaSocioeconomicaRepository;

@Service
public class FichaSocioeconomicaService {
	
	@Autowired
	private FichaSocioeconomicaRepository fichaSocioeconomicaRepository;
	
	public FichaSocioeconomica guardarFichaSocioeconomica(FichaSocioeconomica fichaSocioeconomica) {
		if (fichaSocioeconomicaRepository.findAll().isEmpty()) {
			fichaSocioeconomica.setIdFichaSocioeconomica(1);
        } else {
        	fichaSocioeconomica.setIdFichaSocioeconomica(fichaSocioeconomicaRepository.id().get(0).getIdFichaSocioeconomica()+ 1);
        }
        return fichaSocioeconomicaRepository.save(fichaSocioeconomica);
	}
}
