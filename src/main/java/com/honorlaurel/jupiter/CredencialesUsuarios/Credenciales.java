package com.honorlaurel.jupiter.CredencialesUsuarios;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import java.time.LocalDateTime;

@Entity
public class Credenciales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Usuario", nullable = false, unique = true)
    private String usuario;

    @Column(name = "Contraseña", nullable = false)
    private String contraseña;

    @Column(name = "Nom_Com", nullable = false)
    private String nombreCompleto;

    @Column(name = "Correo", nullable = false, unique = true)
    private String correo;

    @Column(name = "Fecha_Registro", nullable = false)
    private LocalDateTime fechaRegistro;

    // Constructor vacío
    public Credenciales() {}

    // Constructor con parámetros (opcional)
    public Credenciales(String usuario, String contraseña, String nombreCompleto, String correo) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.fechaRegistro = LocalDateTime.now(); // Asigna la fecha de registro automáticamente
    }

    // Getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "Credenciales{" +
                "id=" + id +
                ", usuario='" + usuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", correo='" + correo + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                '}';
    }
}
