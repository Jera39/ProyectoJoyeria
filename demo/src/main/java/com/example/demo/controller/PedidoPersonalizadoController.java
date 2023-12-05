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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PedidoPersonalizadoModel;
import com.example.demo.service.PedidoPersonalizadoService;

@RestController
@RequestMapping("/pedidosPersonalizados")
public class PedidoPersonalizadoController {

    @Autowired
    PedidoPersonalizadoService pedidoPersonalizadoService;

    @GetMapping()
    public ArrayList<PedidoPersonalizadoModel> obtePedidoPersonalizado() {
        return pedidoPersonalizadoService.obtenerPedidoPersonalizado();
    }

    @PostMapping()
    public PedidoPersonalizadoModel guardarPedidoPersonalizado(
            @RequestBody PedidoPersonalizadoModel pedidoPersonalizado) {
        return this.pedidoPersonalizadoService.guardarPedidoPersonalizado(pedidoPersonalizado);
    }

    @GetMapping(path = "/{id}")
    public Optional<PedidoPersonalizadoModel> obtenerPedidoPersonalizadoPorId(@PathVariable("id") Long id) {
        return this.pedidoPersonalizadoService.obtenerPorId(id);
    }

    @GetMapping("/pedidosUsuario")
    public ArrayList<PedidoPersonalizadoModel> obtenerPedidoPersonalizadoPorIdCliente(
            @RequestParam("idCliente") Long idCliente) {
        return this.pedidoPersonalizadoService.obtenerPorIdCliente(idCliente);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.pedidoPersonalizadoService.aliminarPedidoPersonalizado(id);
        if (ok) {
            return "Se eliminó el Pedido Personalizado con id: " + id;
        } else {
            return "No se pudo Eliminar el Pedido Personalizado con id: " + id;
        }
    }
}
