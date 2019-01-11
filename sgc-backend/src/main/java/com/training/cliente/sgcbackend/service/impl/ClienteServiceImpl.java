package com.training.cliente.sgcbackend.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.cliente.sgcbackend.dao.ClienteRepository;
import com.training.cliente.sgcbackend.domain.TipoCliente;
import com.training.cliente.sgcbackend.service.ClienteService;

@Service
@Transactional
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<TipoCliente> findAllTipoCliente() {

		List<TipoCliente> tipoClienteList = clienteRepository.findAll();
		if (tipoClienteList.size() > 0) {
			return clienteRepository.findAll();
		} else {
			return null;
		}
	}

}
