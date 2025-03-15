package com.usuarios.users.Usuarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/usuario")
public class UsuarioControler {

    private final UsuarioService usuarioService;
    @Autowired
    public UsuarioControler(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }
    @GetMapping
    public List<Usuario> getUsers(){
        return usuarioService.getUsers();
    }
    @PostMapping
    public void registerUser(@RequestBody Usuario user){
        usuarioService.registerUser(user);
    }
    @DeleteMapping(path= "{userId}")
	public void deleteStudent(@PathVariable("userId") long id){
        usuarioService.deleteUser(id);
 	}
}
