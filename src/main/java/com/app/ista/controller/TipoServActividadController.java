package com.app.ista.controller;

import java.util.List;

import com.app.ista.model.TipoServicio;
import com.app.ista.service.TipoSerActiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tipoactividad")
@CrossOrigin(origins = "*")
public class TipoServActividadController {
    
    @Autowired
    TipoSerActiService TipoActiService;


    @PostMapping
    @CrossOrigin
    public TipoServicio guardarTipoActividadPersona(@RequestBody TipoServicio tipoActividad){
        TipoActiService.guardadTipoAct(tipoActividad);
        return tipoActividad;
    }

    @GetMapping(path = "/listadoTipoAct", produces = "application/json")
	public List<TipoServicio> listarActividadesPersona() {
		return TipoActiService.listarAll();
	}

    @GetMapping(path = "/bynombre/{nombreActividad}", produces = "application/json")
	public TipoServicio porNombre(@PathVariable String nombreActividad) {
		return TipoActiService.byNombreActi(nombreActividad);
	}
}
