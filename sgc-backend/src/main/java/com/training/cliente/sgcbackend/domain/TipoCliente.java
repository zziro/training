package com.training.cliente.sgcbackend.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_cliente", schema = "public")
public class TipoCliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3295538936620089291L;

	@Id
	@GeneratedValue(generator = "tipoCienteSeq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "tipoCienteSeq", sequenceName = "tipo_cliente_seq", allocationSize = 1, initialValue = 1)
	@Column(name = "tipo_cliente_id", unique = true, nullable = false)
	private Long tipoClienteId;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "descripcion")
	private String descripcion;

	public TipoCliente() {
		// TODO Auto-generated constructor stub
	}

	public TipoCliente(Long tipoClienteId) {
		this.tipoClienteId = tipoClienteId;
	}

	public Long getTipoClienteId() {
		return tipoClienteId;
	}

	public void setTipoClienteId(Long tipoClienteId) {
		this.tipoClienteId = tipoClienteId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "TipoCliente [tipoClienteId=" + tipoClienteId + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ "]";
	}

}
