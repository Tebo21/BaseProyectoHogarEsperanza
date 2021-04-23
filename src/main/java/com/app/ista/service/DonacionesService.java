package com.app.ista.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ista.model.Donaciones;
import com.app.ista.repository.DonacionesRepository;

@Service
public class DonacionesService {
	@Autowired
	private DonacionesRepository donacrepo;

	public Donaciones guardarDonacion(Donaciones donaciones) {
		if (donacrepo.findAll().isEmpty()) {
			donaciones.setIdDonacion(1);
		} else {
			donaciones.setIdDonacion(donacrepo.id().get(0).getIdDonacion() + 1);
		}
		return donacrepo.save(donaciones);
	}
	
	public List<Donaciones>listadoDonaciones(){
		return donacrepo.findAll();
	}
}
