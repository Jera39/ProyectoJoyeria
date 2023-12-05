package com.example.demo.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PedidoModel;

@Repository
public interface PedidoRepository extends CrudRepository<PedidoModel, Long> {
    public abstract ArrayList<PedidoModel> findByIdCliente(Long idCliente);
}
