package com.example.demo.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.demo.controller.dto.UsuarioRegistroDTO;
import com.example.demo.model.Usuario;

public interface UsuarioServicio extends UserDetailsService {

	public Usuario guardar(UsuarioRegistroDTO registroDTO);

	public List<Usuario> listarUsuarios();

}
