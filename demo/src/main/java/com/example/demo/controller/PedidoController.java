package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PedidoModel;
import com.example.demo.service.PedidoService;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping()
    public ArrayList<PedidoModel> obtenerPedido() {
        return pedidoService.obtenerPedido();
    }

    @PostMapping()
    public PedidoModel guardarPedido(@RequestBody PedidoModel pedido) {
        return this.pedidoService.guardarPedido(pedido);
    }

    @GetMapping(path = "/{id}")
    public Optional<PedidoModel> obtenerPedidoPorId(@PathVariable("id") Long id) {
        return this.pedidoService.obtenerPorId(id);
    }

    @GetMapping("/pedidosNormalesUsuario")
    public ArrayList<PedidoModel> obtenerPedidoPorIdCliente(@RequestParam("idCliente") Long idCliente) {
        return this.pedidoService.obtenerPorIdCliente(idCliente);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.pedidoService.eliminarPedido(id);
        if (ok) {
            return "Se eliminó el pedido normal con id: " + id;
        } else {
            return "No se pudo eliminar el Pedido normal con id: " + id;
        }
    }
}
