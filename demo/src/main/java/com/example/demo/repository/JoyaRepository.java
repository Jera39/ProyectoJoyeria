package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.JoyaModel;

@Repository
public interface JoyaRepository extends CrudRepository<JoyaModel, Long> {
    @Query(value = "SELECT * FROM joyas WHERE tipo = :tipo", nativeQuery = true)
    List<JoyaModel> joyaPorTipo(@Param("tipo") String tipo);
}
