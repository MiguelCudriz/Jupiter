package com.honorlaurel.jupiter.CredencialesUsuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private com.honorlaurel.jupiter.CredencialesUsuarios.CredencialesService credencialesService;

    @PostMapping("/login")
    public boolean login(@RequestParam String usuario, @RequestParam String contraseña) {
        return credencialesService.autenticarUsuario(usuario, contraseña);
    }
}
