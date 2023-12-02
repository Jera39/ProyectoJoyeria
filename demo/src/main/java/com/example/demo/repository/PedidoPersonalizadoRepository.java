package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PedidoPersonalizadoModel;

@Repository
public interface PedidoPersonalizadoRepository extends CrudRepository<PedidoPersonalizadoModel, Long> {

}
