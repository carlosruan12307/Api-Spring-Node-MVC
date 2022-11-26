package com.v4.v4.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.v4.v4.models.UsuarioModel;
import com.v4.v4.responses.UsuarioResponse;
import com.v4.v4.services.UsuarioService;

import lombok.Getter;
import lombok.Setter;

@RestController
@Getter
@Setter
public class UsuarioController {
    @Autowired
    private UsuarioService us;

    @GetMapping("/")
    public String inicio() {
        return "api de usuario";
    }

    @PostMapping("/cadastrarUsuario")
    public ResponseEntity<UsuarioResponse> cadastrarUsuario(@RequestBody UsuarioModel usuario) {
        return us.cadastrarUsuario(usuario);
    }
    @PutMapping("/alterarUsuario")
    public ResponseEntity<UsuarioResponse> alterarUsuario(@RequestBody UsuarioModel usuario) {
        return us.alterarUsuario(usuario);
    }

    @DeleteMapping("/deletarUsuario/{idUsuario}")
    public ResponseEntity<UsuarioResponse> deletarUsuario(@PathVariable Long idUsuario) {
        return us.deletarUsuario(idUsuario);
    }

    
}
