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

import com.example.demo.model.JoyaModel;
import com.example.demo.service.JoyaService;

@RestController
@RequestMapping("/joyas")
public class JoyaController {
    @Autowired
    JoyaService joyaService;

    @GetMapping()
    public ArrayList<JoyaModel> obtenerJoyas() {
        return joyaService.obtenerJoyas();
    }

    @PostMapping()
    public JoyaModel guardarJoya(@RequestBody JoyaModel joya) {
        return this.joyaService.guardarJoya(joya);
    }

    @GetMapping(path = "/{id}")

    public Optional<JoyaModel> obtenerJoyaPorId(@PathVariable("id") Long id) {
        return this.joyaService.obtenerPorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.joyaService.eliminarJoya(id);
        if (ok) {
            return "Se eliminó la joya con id: " + id;
        } else {
            return "No se pudo eliminar la joya con id: " + id;
        }
    }
}
