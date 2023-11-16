package com.culinarycraft.soft2back.dto;    
import java.time.LocalDateTime;

public class CalificacionDTO {

    private int calificacionId;
    private int recetaId; // Usamos el ID de la receta en lugar de la entidad completa
    private int userId; // Usamos el ID del usuario en lugar de la entidad completa
    private Integer puntuacion;
    private LocalDateTime fechaHora;

    // Constructor vacío
    public CalificacionDTO() {
    }

    // Constructor con todos los campos
    public CalificacionDTO(int calificacionId, int recetaId, int userId, Integer puntuacion, LocalDateTime fechaHora) {
        this.calificacionId = calificacionId;
        this.recetaId = recetaId;
        this.userId = userId;
        this.puntuacion = puntuacion;
        this.fechaHora = fechaHora;
    }

    // Getters y setters
    public int getCalificacionId() {
        return calificacionId;
    }

    public void setCalificacionId(int calificacionId) {
        this.calificacionId = calificacionId;
    }

    public int getRecetaId() {
        return recetaId;
    }

    public void setRecetaId(int recetaId) {
        this.recetaId = recetaId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
