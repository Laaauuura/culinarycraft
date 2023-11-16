package com.culinarycraft.soft2back.dto;
public class RecetaDTO {

    private int recetaId;
    private int userId; // Id del usuario, en lugar de toda la entidad Usuario
    private String nombreReceta;
    private String procedimiento;
    private int tiempoPreparacion;
    private int porciones;
    private String descripcionCorta;
    private byte[] imagenReceta;
    private int categoriaCategoriaId;

    // Constructor vacío
    public RecetaDTO() {
    }

    // Constructor completo
    public RecetaDTO(int recetaId, int userId, String nombreReceta, String procedimiento, int tiempoPreparacion, int porciones, String descripcionCorta, byte[] imagenReceta, int categoriaCategoriaId) {
        this.recetaId = recetaId;
        this.userId = userId;
        this.nombreReceta = nombreReceta;
        this.procedimiento = procedimiento;
        this.tiempoPreparacion = tiempoPreparacion;
        this.porciones = porciones;
        this.descripcionCorta = descripcionCorta;
        this.imagenReceta = imagenReceta;
        this.categoriaCategoriaId = categoriaCategoriaId;
    }

    // Getters y setters
    // ... (para todos los campos)
}
