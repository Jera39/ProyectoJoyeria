package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UsuarioService;
import com.example.demo.model.UsuarioModel;
import com.example.demo.request.LoginRequest;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios() {
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
        return this.usuarioService.guardarUsuario(usuario);
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return this.usuarioService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<UsuarioModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad) {
        return this.usuarioService.obtenerPorPrioridad(prioridad);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if (ok) {
            return "se eliminó el usuario con id: " + id;
        } else {
            return "no se pudo eliminar el usuario con id" + id;
        }
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String, Object>> login(@RequestBody LoginRequest loginRequest) {
        try {
            String correo = loginRequest.getEmail();
            String password = loginRequest.getContra();

            UsuarioModel usuarioAutenticado = usuarioService.autenticar(correo, password);

            if (usuarioAutenticado != null) {
                Map<String, Object> responseData = new HashMap<>();
                responseData.put("mensaje", "¡Inicio de sesión exitoso!");
                responseData.put("usuario", usuarioAutenticado.getUsuario());
                responseData.put("id", usuarioAutenticado.getId());

                return ResponseEntity.ok(responseData);
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(
                        Collections.singletonMap("mensaje", "Credenciales incorrectas. Inicio de sesión fallido."));
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Collections.singletonMap("mensaje", "Error durante el inicio de sesión: " + e.getMessage()));
        }
    }

}
