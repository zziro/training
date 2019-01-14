package com.training.cliente.sgcbackend.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author xt8870
 *
 */
@Entity
@Table(name = "cliente", schema = "public")
public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4377907827356333388L;
	@Id
	@GeneratedValue(generator = "clienteSeq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "clienteSeq", sequenceName = "cliente_seq", allocationSize = 1, initialValue = 1)
	@Column(name = "cliente_id", unique = true, nullable = false)
	private Long clienteId;
	@Column(name = "tipo_cliente_id")
	private Long tipoClienteId;
	@Column(name = "apellido_paterno")
	private String apellidoPaterno;
	@Column(name = "apellido_materno")
	private String apellidoMaterno;
	@Column(name = "nombre")
	private String nombre;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

	public Long getTipoClienteId() {
		return tipoClienteId;
	}

	public void setTipoClienteId(Long tipoClienteId) {
		this.tipoClienteId = tipoClienteId;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
