package com.training.cliente.sgcbackend.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.training.cliente.sgcbackend.domain.TipoCliente;
import com.training.cliente.sgcbackend.facade.ClienteFacade;
import com.training.cliente.sgcbackend.service.ClienteService;

@Component("tipoClienteFacade")
public class ClienteFacadeImpl implements ClienteFacade {

	@Autowired
	private ClienteService clienteService;

	@Override
	public List<TipoCliente> findAllTipoCliente() {
		return clienteService.findAllTipoCliente();
	}

}
