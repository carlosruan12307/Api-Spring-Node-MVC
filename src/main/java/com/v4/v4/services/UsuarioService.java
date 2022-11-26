package com.v4.v4.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.v4.v4.models.UsuarioModel;
import com.v4.v4.repositorys.UsuarioRepository;
import com.v4.v4.responses.UsuarioResponse;

import lombok.Getter;
import lombok.Setter;

@Service
@Getter
@Setter
public class UsuarioService {
    @Autowired
    private UsuarioResponse ur;
    @Autowired
    private UsuarioRepository r;
    public ResponseEntity<UsuarioResponse> cadastrarUsuario(UsuarioModel usuario) {
            r.save(usuario);
            ur.setMensagem("cadastrado com sucesso");
            return new ResponseEntity<UsuarioResponse>(ur, HttpStatus.OK);
        
    }

    public ResponseEntity<UsuarioResponse> alterarUsuario(UsuarioModel usuario) {
        r.save(usuario);
        ur.setMensagem("usuario alterado com sucesso");
        return new ResponseEntity<UsuarioResponse>(ur, HttpStatus.OK);
    
}

public ResponseEntity<UsuarioResponse> deletarUsuario(Long idUsuario) {
    r.deleteById(idUsuario);
    ur.setMensagem("usuario deletado com sucesso");
    return new ResponseEntity<UsuarioResponse>(ur, HttpStatus.OK);

}

    
}
