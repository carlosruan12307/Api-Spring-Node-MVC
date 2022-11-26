package com.v4.v4.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.v4.v4.models.UsuarioModel;


@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel,Long> {
    
}
