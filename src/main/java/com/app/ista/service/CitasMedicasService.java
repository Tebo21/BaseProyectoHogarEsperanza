package com.app.ista.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ista.model.CitasMedicas;
import com.app.ista.repository.CitasMedicasRepository;
import java.util.Optional;

@Service
public class CitasMedicasService {
	
	@Autowired
	private CitasMedicasRepository citasMedicasRepository;
	
	public CitasMedicas guardarCita(CitasMedicas cita) {
		if (citasMedicasRepository.findAll().isEmpty()) {
			cita.setIdCitasMedicas(1);
		} else {
			cita.setIdCitasMedicas(citasMedicasRepository.id().get(0).getIdCitasMedicas()+ 1);
		}
		return citasMedicasRepository.save(cita);
	}
	
	public List<CitasMedicas>listarCita(){
		return citasMedicasRepository.findAll();
	}

	public Optional<CitasMedicas> listarCitasId(Long id){
		return citasMedicasRepository.findById(id);
	}

	public void eliminarCita(Long idcita) {
		
		citasMedicasRepository.deleteById(idcita);
        }

   	/*public CitasMedicas editarCita(Long idCentro, Especialidad especialidad) {
	   return especiarepo.save(especialidad);
        }*/

}
