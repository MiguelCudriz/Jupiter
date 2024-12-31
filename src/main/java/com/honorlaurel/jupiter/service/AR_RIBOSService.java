package com.honorlaurel.jupiter.service;

import com.honorlaurel.jupiter.AR_RIBOS.AR_RIBOS;
import com.honorlaurel.jupiter.AR_RIBOS.AR_RIBOSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AR_RIBOSService {

    @Autowired
    private AR_RIBOSRepository arRibosRepository;

    // Método para obtener todos los AR_RIBOS
    public List<AR_RIBOS> getAllAR_RIBOS() {
        return arRibosRepository.findAll();
    }

    // Método para obtener un AR_RIBOS por su ID
    public Optional<AR_RIBOS> getAR_RIBOSById(Long id) {
        return arRibosRepository.findById(id);
    }

    // Método para guardar un AR_RIBOS
    public AR_RIBOS saveAR_RIBOS(AR_RIBOS arRibos) {
        return (AR_RIBOS) arRibosRepository.save(arRibos);
    }

    // Método para eliminar un AR_RIBOS por su ID
    public void deleteAR_RIBOS(Long id) {
        arRibosRepository.deleteById(id);
    }
}
