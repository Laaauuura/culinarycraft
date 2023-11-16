package com.culinarycraft.soft2back.bl;
import java.util.List;

public class CalificacionService {

    private CalificacionDAO calificacionDAO; // Suponiendo inyección de dependencias

    // Constructor
    public CalificacionService(CalificacionDAO calificacionDAO) {
        this.calificacionDAO = calificacionDAO;
    }

    // Agregar una nueva calificación
    public void addCalificacion(Calificacion calificacion) {
        // Aquí puedes agregar validaciones, como verificar la puntuación
        if (calificacion.getPuntuacion() == null || calificacion.getPuntuacion() < 1 || calificacion.getPuntuacion() > 5) {
            throw new IllegalArgumentException("Puntuación inválida.");
        }
        calificacionDAO.create(calificacion);
    }

    // Obtener una calificación por ID
    public Calificacion getCalificacionById(int id) {
        // Puedes agregar lógica adicional aquí, como manejo de errores
        return calificacionDAO.findById(id);
    }

    // Actualizar una calificación
    public void updateCalificacion(Calificacion calificacion) {
        // Validaciones o transformaciones antes de actualizar
        calificacionDAO.update(calificacion);
    }

    // Eliminar una calificación
    public void deleteCalificacion(int id) {
        Calificacion calificacion = calificacionDAO.findById(id);
        if (calificacion != null) {
            calificacionDAO.delete(calificacion);
        } else {
            // Manejo si la calificación no existe
            throw new IllegalArgumentException("Calificación no encontrada.");
        }
    }

    // Listar todas las calificaciones
    public List<Calificacion> getAllCalificaciones() {
        return calificacionDAO.findAll();
    }

    // Métodos adicionales según las necesidades de tu aplicación
    // Por ejemplo, métodos para calcular promedios, etc.
    // ...
}
