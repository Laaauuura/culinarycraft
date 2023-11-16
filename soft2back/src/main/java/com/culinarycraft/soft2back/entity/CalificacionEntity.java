package com.culinarycraft.soft2back.entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Calificaciones")
public class Calificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CalificacionID")
    private int calificacionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RecetaID", nullable = false)
    private Receta receta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UserID", nullable = false)
    private Usuario usuario;

    @Column(name = "Puntuacion")
    private Integer puntuacion; // Puede ser nulo según la definición de la tabla

    @Column(name = "FechaHora")
    private LocalDateTime fechaHora = LocalDateTime.now(); // Default a la fecha y hora actual

    // Constructor vacío
    public Calificacion() {
    }

    // Getters y setters
    public int getCalificacionId() {
        return calificacionId;
    }

    public void setCalificacionId(int calificacionId) {
        this.calificacionId = calificacionId;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
}
