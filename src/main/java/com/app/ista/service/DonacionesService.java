package com.app.ista.service;

import java.util.List;
import java.util.Optional;

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
	
	public List<Donaciones> listaDoncionesByNombre(String nombreDonacion){
		return donacrepo.findByNombreDonacion(nombreDonacion);
	}
	
	public List<Donaciones> listaDonacionesByCategoria(String categoria){
		return donacrepo.findByCategoria(categoria);
	}
	
	public Optional<Donaciones> porId(Long idDonacion){
		return donacrepo.findById(idDonacion);
	}
	
	public Donaciones actualizaDonacion(Long idDonacion, Donaciones donaciones) {
		if (donacrepo.findById(idDonacion)!=null){
			donaciones.setIdDonacion(idDonacion.intValue());
			return donacrepo.save(donaciones);
		}else {
			return null;
		}
	}
	
	public boolean eliminarDonacion(Long idDonacion) {
		if (donacrepo.findById(idDonacion)!=null) {
			donacrepo.deleteById(idDonacion);
			return true;
		}else {
			return false;
		}
	}
}
