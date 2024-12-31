package com.honorlaurel.jupiter.AR_RIBOS;

import com.honorlaurel.jupiter.service.AR_RIBOSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.honorlaurel.jupiter.AR_RIBOS.AR_RIBOSRepository;


@RestController
@RequestMapping("/ar_ribos")
public class AR_RIBOSController {
    private final AR_RIBOSService arRibosService;

    public AR_RIBOSController(AR_RIBOSService arRibosService) {
        this.arRibosService = arRibosService;
    }

    // Obtener todos los registros
    @GetMapping
    public List<AR_RIBOS> listarAR_RIBOS() {
        return arRibosService.getAllAR_RIBOS();
    }

    // Guardar un nuevo registro
    @Autowired
    private AR_RIBOSRepository arRibosRepository;
    @PostMapping
    public ResponseEntity<AR_RIBOS> crearRegistro(@RequestBody AR_RIBOS nuevoRegistro) {
        try {
            // Se guarda el nuevo registro en la base de datos
            AR_RIBOS registroGuardado = arRibosRepository.save(nuevoRegistro);
            return new ResponseEntity<>(registroGuardado, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Obtener un registro por ID
    @GetMapping("/{id}")
    public AR_RIBOS obtenerAR_RIBOSPorId(@PathVariable Long id) {
        return arRibosService.getAR_RIBOSById(id)
                .orElseThrow(() -> new RuntimeException("Registro no encontrado con ID: " + id));
    }

    // Eliminar un registro por ID
    @DeleteMapping("/{id}")
    public void eliminarAR_RIBOS(@PathVariable Long id) {
        arRibosService.deleteAR_RIBOS(id);
    }
}
