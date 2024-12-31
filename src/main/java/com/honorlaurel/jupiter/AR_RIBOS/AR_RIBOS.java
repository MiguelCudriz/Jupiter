package com.honorlaurel.jupiter.AR_RIBOS;

import jakarta.persistence.*;
import java.time.LocalDate; // Para mapear la columna de tipo DATE

@Entity
public class AR_RIBOS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;  // Identificador único autoincremental

    @Column(name = "FEC_REGI", nullable = false)
    private LocalDate fecRegi; // Fecha de registro

    @Column(name = "NOM_FUNCI", nullable = false, length = 255)
    private String nomFunci; // Nombre de la función

    @Column(name = "NOMB_REGI", nullable = false, length = 255)
    private String nombRegi; // Nombre del registro

    @Column(name = "NOMB_CLIE", nullable = false, length = 255)
    private String nombClie; // Nombre del cliente

    @Column(name = "SEDE", nullable = false, length = 100)
    private String sede; // Sede

    @Column(name = "NOM_PUES_TRAB", nullable = false, length = 255)
    private String nomPuesTrab; // Nombre del puesto de trabajo

    @Column(name = "TURNO", nullable = false, length = 50)
    private String turno; // Turno

    @Column(name = "NOVE_PUES", nullable = false, length = 255)
    private String novePues; // Observación del puesto

    @Column(name = "OBS_ERVA", length = 255)
    private String obsErva; // Campo opcional para observaciones

    // Getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFecRegi() {
        return fecRegi;
    }

    public void setFecRegi(LocalDate fecRegi) {
        this.fecRegi = fecRegi;
    }

    public String getNomFunci() {
        return nomFunci;
    }

    public void setNomFunci(String nomFunci) {
        this.nomFunci = nomFunci;
    }

    public String getNombRegi() {
        return nombRegi;
    }

    public void setNombRegi(String nombRegi) {
        this.nombRegi = nombRegi;
    }

    public String getNombClie() {
        return nombClie;
    }

    public void setNombClie(String nombClie) {
        this.nombClie = nombClie;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getNomPuesTrab() {
        return nomPuesTrab;
    }

    public void setNomPuesTrab(String nomPuesTrab) {
        this.nomPuesTrab = nomPuesTrab;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getNovePues() {
        return novePues;
    }

    public void setNovePues(String novePues) {
        this.novePues = novePues;
    }

    public String getObsErva() {
        return obsErva;
    }

    public void setObsErva(String obsErva) {
        this.obsErva = obsErva;
    }
}
