package com.app.ista.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ista.model.RegistroFamliares;
import com.app.ista.repository.RegistroFamiliaresRepository;

@Service
public class RegistroFamiliaresService {

	@Autowired
	private RegistroFamiliaresRepository regisfamrepo;

	public RegistroFamliares guardarRegistroFamiliares(RegistroFamliares registrofamiliares) {
		if (regisfamrepo.findAll().isEmpty()) {
			registrofamiliares.setIdRegistroFamiliares(1);
		} else {
			registrofamiliares.setIdRegistroFamiliares(regisfamrepo.id().get(0).getIdRegistroFamiliares() + 1);
		}
		return regisfamrepo.save(registrofamiliares);
	}
}
