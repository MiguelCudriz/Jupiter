package com.honorlaurel.jupiter.AR_RIBOS;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AR_RIBOSRepository extends JpaRepository<AR_RIBOS, Long> {
    // Aquí puedes agregar consultas personalizadas si es necesario


}
