package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PedidoModel;
import com.example.demo.repository.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;

    public ArrayList<PedidoModel> obtenerPedido() {
        return (ArrayList<PedidoModel>) pedidoRepository.findAll();
    }

    public PedidoModel guardarPedido(PedidoModel pedido) {
        return pedidoRepository.save(pedido);
    }

    public Optional<PedidoModel> obtenerPorId(Long id) {
        return pedidoRepository.findById(id);
    }

    public ArrayList<PedidoModel> obtenerPorIdCliente(Long idCliente) {
        return pedidoRepository.findByIdCliente(idCliente);
    }

    public List<PedidoModel> getPedidoPorIdCliente(Integer idCliente) {
        return this.pedidoRepository.pedidoPorIdCliente(idCliente);
    }

    public boolean eliminarPedido(Long id) {
        try {
            pedidoRepository.deleteById(id);
            return true;
        } catch (Exception erException) {
            return false;
        }
    }
}
