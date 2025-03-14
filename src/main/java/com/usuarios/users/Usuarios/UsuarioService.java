package com.usuarios.users.Usuarios;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }
    public List<Usuario> getUsers(){
        return usuarioRepository.findAll();
    }
    public void registerUser(Usuario usuario){
        Optional<Usuario> usuarioEmail = usuarioRepository.findUserByEmail(usuario.getEmail());
        if(usuarioEmail.isPresent()){
            throw new IllegalArgumentException("ERRO ESSE EMAIL JA ESTA CADASTRADO");
        }
        usuarioRepository.save(usuario);

    }
}
