package com.training.cliente.sgcbackend.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.cliente.sgcbackend.SgcBackendApplication;
import com.training.cliente.sgcbackend.dao.ClienteRepository;
import com.training.cliente.sgcbackend.dao.TipoClienteRepository;
import com.training.cliente.sgcbackend.domain.Cliente;
import com.training.cliente.sgcbackend.domain.TipoCliente;
import com.training.cliente.sgcbackend.service.ClienteService;

@Service
@Transactional("transactionManager")
public class ClienteServiceImpl implements ClienteService {

	private static final Logger logger = LogManager.getLogger(SgcBackendApplication.class);

	@Autowired
	private TipoClienteRepository tipoClienteRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<TipoCliente> findAllTipoCliente() {

		List<TipoCliente> tipoClienteList = tipoClienteRepository.findAll();

		if (tipoClienteList.size() > 0) {
			logger.info("[INFO] - Listing Clients" + tipoClienteList);
			return tipoClienteRepository.findAll();
		} else {
			return null;
		}
	}

	@Override
	public List<Cliente> findAllCliente() {

		List<Cliente> clientesList = clienteRepository.findAll();
		if (clientesList.size() > 0) {
			return clienteRepository.findAll();
		}
		return null;
	}

	@Override
	public Cliente saveCliente(Cliente cliente) {
		Cliente clienteStored = clienteRepository.save(cliente);
		return clienteStored;
	}

	@Override
	public Cliente updateCliente(Cliente cliente) {
		Cliente clienteStored = clienteRepository.getOne(cliente.getClienteId());
		clienteStored.setTipoClienteId(cliente.getTipoClienteId());
		clienteStored.setApellidoPaterno(cliente.getApellidoPaterno());
		clienteStored.setApellidoMaterno(cliente.getApellidoMaterno());
		clienteStored.setNombre(cliente.getNombre());
		clienteRepository.save(clienteStored);
		return clienteStored;
	}

	@Override
	public void deleteCliente(Long clienteId) {
		clienteRepository.deleteById(clienteId);
	}

}
