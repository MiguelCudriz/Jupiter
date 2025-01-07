package com.honorlaurel.jupiter.CredencialesUsuarios;

import com.honorlaurel.jupiter.CredencialesUsuarios.Credenciales;
import com.honorlaurel.jupiter.CredencialesUsuarios.CredencialesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CredencialesService {

    @Autowired
    private CredencialesRepository credencialesRepository;

    // Método para autenticar usuario
    public boolean autenticarUsuario(String usuario, String contraseña) {
        Credenciales credenciales = credencialesRepository.findByUsuario(usuario);
        if (credenciales != null && credenciales.getContraseña().equals(contraseña)) {
            return true;
        }
        return false;
    }
}
