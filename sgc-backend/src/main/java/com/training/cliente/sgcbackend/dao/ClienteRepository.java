package com.training.cliente.sgcbackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.cliente.sgcbackend.domain.TipoCliente;

@Repository
public interface ClienteRepository extends JpaRepository<TipoCliente, Long> {

}
