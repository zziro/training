package com.training.cliente.sgcbackend.service;

import java.util.List;

import com.training.cliente.sgcbackend.domain.TipoCliente;

public interface ClienteService {

	List<TipoCliente> findAllTipoCliente();
}
