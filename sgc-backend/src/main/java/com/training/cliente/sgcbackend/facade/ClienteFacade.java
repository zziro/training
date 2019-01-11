package com.training.cliente.sgcbackend.facade;

import java.util.List;

import com.training.cliente.sgcbackend.domain.TipoCliente;

public interface ClienteFacade {

	List<TipoCliente> findAllTipoCliente();
}
