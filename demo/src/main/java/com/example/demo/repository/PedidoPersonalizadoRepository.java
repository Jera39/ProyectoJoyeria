package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PedidoPersonalizadoModel;

@Repository
public interface PedidoPersonalizadoRepository extends CrudRepository<PedidoPersonalizadoModel, Long> {
    public abstract ArrayList<PedidoPersonalizadoModel> findByIdCliente(Long idCliente);

    @Query(value = "SELECT * FROM pedidoPersonalizado WHERE idCliente = :idCliente", nativeQuery = true)
    List<PedidoPersonalizadoModel> pedidoPorIdCliente(@Param("idCliente") Long idCliente);
}
