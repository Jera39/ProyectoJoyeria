package com.example.demo.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PedidoPersonalizadoModel;

@Repository
public interface PedidoPersonalizadoRepository extends CrudRepository<PedidoPersonalizadoModel, Long> {
    public abstract ArrayList<PedidoPersonalizadoModel> findByIdCliente(Long idCliente);
}
