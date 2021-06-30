package com.app.ista.service;

import java.util.List;

import com.app.ista.model.ObservacionesPersona;
import com.app.ista.repository.ObservacionesPersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ObservacionesPersonaService {
    @Autowired
    private ObservacionesPersonaRepository observacionesPersonaRepository;

    public ObservacionesPersona guardarObservacionesPersonas(ObservacionesPersona observacionesPersona){
        if(observacionesPersonaRepository.findAll().isEmpty()){
            observacionesPersona.setIdObservacionesPersona(1);
        }else{
            observacionesPersona.setIdObservacionesPersona(observacionesPersonaRepository.id().get(0).getIdObservacionesPersona()+1);   
        }
        return observacionesPersonaRepository.save(observacionesPersona);
    }

    public List<ObservacionesPersona> listByCedula(String cedulaPersona){
       return observacionesPersonaRepository.findByCedulaPersona(cedulaPersona);
    }
}
