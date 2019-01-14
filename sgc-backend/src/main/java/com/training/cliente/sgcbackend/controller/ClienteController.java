package com.training.cliente.sgcbackend.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.cliente.sgcbackend.domain.Cliente;
import com.training.cliente.sgcbackend.domain.TipoCliente;
import com.training.cliente.sgcbackend.facade.ClienteFacade;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteFacade clienteFacade;

	@GetMapping("findAllTipoCliente")
	public Map<String, Object> findAllTipoCliente() {

		Map<String, Object> map = new HashMap<String, Object>();
		List<TipoCliente> tipoClienteList = clienteFacade.findAllTipoCliente();
		map.put("data", tipoClienteList);
		map.put("message", "success");
		return map;
	}

	@GetMapping("findAllCliente")
	public Map<String, Object> findAllCliente() {

		Map<String, Object> map = new HashMap<String, Object>();
		List<Cliente> clienteList = clienteFacade.findAllCliente();
		map.put("data", clienteList);
		map.put("message", "success");
		return map;
	}

	@PutMapping("saveCliente")
	public Cliente saveCliente(@RequestBody Cliente cliente) {
		return clienteFacade.saveCliente(cliente);
	}

	@PostMapping("updateCliente")
	public Cliente updateCliente(@RequestBody Cliente cliente) {
		return clienteFacade.updateCliente(cliente);
	}

	@DeleteMapping("deleteCliente")
	public void deleteCliente(@RequestParam Long clienteId) {
		clienteFacade.deleteCliente(clienteId);
	}

}
