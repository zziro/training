package com.training.cliente.sgcbackend.service;

import java.util.List;

import com.training.cliente.sgcbackend.domain.Cliente;
import com.training.cliente.sgcbackend.domain.TipoCliente;

public interface ClienteService {

	List<TipoCliente> findAllTipoCliente();

	List<Cliente> findAllCliente();

	Cliente saveCliente(Cliente cliente);

	Cliente updateCliente(Cliente Cliente);

	void deleteCliente(Long clienteId);

}
