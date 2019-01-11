package com.training.cliente.sgcbackend.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
		map.put("header", "{user: password}");
		map.put("message", "success");
		return map;
	}
}
