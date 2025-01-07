package com.honorlaurel.jupiter.CredencialesUsuarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredencialesRepository extends JpaRepository<Credenciales, Integer> {
    // Puedes agregar consultas personalizadas si es necesario
    // Ejemplo: buscar por usuario
    Credenciales findByUsuario(String usuario);
}
