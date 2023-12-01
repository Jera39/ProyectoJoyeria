package com.example.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.JoyaModel;
import com.example.demo.repository.JoyaRepository;

@Service
public class JoyaService {

    @Autowired
    JoyaRepository joyaRepository;

    public ArrayList<JoyaModel> obtenerJoyas() {
        return (ArrayList<JoyaModel>) joyaRepository.findAll();
    }

    public JoyaModel guardarJoya(JoyaModel joya) {
        return joyaRepository.save(joya);
    }

    public Optional<JoyaModel> obtenerPorId(Long id) {
        return joyaRepository.findById(id);
    }

    public boolean eliminarJoya(Long id) {
        try {
            joyaRepository.deleteById(id);
            return true;
        } catch (Exception errException) {
            return false;
        }
    }
}
