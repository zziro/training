package com.training.cliente.sgcbackend.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.training.cliente.sgcbackend.domain.Cliente;
import com.training.cliente.sgcbackend.domain.TipoCliente;
import com.training.cliente.sgcbackend.facade.ClienteFacade;
import com.training.cliente.sgcbackend.service.ClienteService;

@Component("clienteFacade")
public class ClienteFacadeImpl implements ClienteFacade {

	@Autowired
	private ClienteService clienteService;

	@Override
	public List<TipoCliente> findAllTipoCliente() {
		return clienteService.findAllTipoCliente();
	}

	@Override
	public List<Cliente> findAllCliente() {
		return clienteService.findAllCliente();
	}

	@Override
	public Cliente saveCliente(Cliente cliente) {
		return clienteService.saveCliente(cliente);
	}

	@Override
	public Cliente updateCliente(Cliente Cliente) {
		return clienteService.updateCliente(Cliente);
	}

	@Override
	public void deleteCliente(Long clienteId) {
		clienteService.deleteCliente(clienteId);
	}

}
