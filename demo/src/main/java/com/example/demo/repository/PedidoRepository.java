package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PedidoModel;

@Repository
public interface PedidoRepository extends CrudRepository<PedidoModel, Long> {
    public abstract ArrayList<PedidoModel> findByIdCliente(Long idCliente);

    @Query(value = "SELECT * FROM pedido WHERE idCliente = :idCliente", nativeQuery = true)
    List<PedidoModel> pedidoPorIdCliente(@Param("idCliente") Integer idCliente);
}
