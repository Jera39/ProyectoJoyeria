package com.example.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PedidoPersonalizadoModel;
import com.example.demo.repository.PedidoPersonalizadoRepository;

@Service
public class PedidoPersonalizadoService {

    @Autowired
    PedidoPersonalizadoRepository pedidoPersonalizadoRepository;

    public ArrayList<PedidoPersonalizadoModel> obtenerPedidoPersonalizado() {
        return (ArrayList<PedidoPersonalizadoModel>) pedidoPersonalizadoRepository.findAll();
    }

    public PedidoPersonalizadoModel guardarPedidoPersonalizado(PedidoPersonalizadoModel pedidoPersonalizado) {
        return pedidoPersonalizadoRepository.save(pedidoPersonalizado);
    }

    public Optional<PedidoPersonalizadoModel> obtenerPorId(Long id) {
        return pedidoPersonalizadoRepository.findById(id);
    }

    public ArrayList<PedidoPersonalizadoModel> obtenerPorIdCliente(Long idCliente) {
        return pedidoPersonalizadoRepository.findByIdCliente(idCliente);
    }

    public boolean aliminarPedidoPersonalizado(Long id) {
        try {
            pedidoPersonalizadoRepository.deleteById(id);
            return true;
        } catch (Exception erException) {
            return false;
        }
    }
}
