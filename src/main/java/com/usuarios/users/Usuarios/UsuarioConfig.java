package com.usuarios.users.Usuarios;


import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {
    @Bean
    CommandLineRunner commandLineRunner(UsuarioRepository usuarioRepository){
        return args -> {
            Usuario davi = new Usuario("Davi Souza", "davisouza@gmail.com", 17);
            usuarioRepository.saveAll(List.of(davi));
        };
    }
}
