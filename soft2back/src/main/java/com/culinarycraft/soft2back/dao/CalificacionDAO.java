package com.culinarycraft.soft2back.dao;
import jakarta.persistence.*;
import java.util.List;

public class CalificacionDAO {

    @PersistenceContext
    private EntityManager entityManager;

    // Guardar una nueva calificación
    public void create(Calificacion calificacion) {
        entityManager.persist(calificacion);
    }

    // Obtener una calificación por su ID
    public Calificacion findById(int id) {
        return entityManager.find(Calificacion.class, id);
    }

    // Actualizar una calificación existente
    public Calificacion update(Calificacion calificacion) {
        return entityManager.merge(calificacion);
    }

    // Eliminar una calificación
    public void delete(Calificacion calificacion) {
        if (entityManager.contains(calificacion)) {
            entityManager.remove(calificacion);
        } else {
            entityManager.remove(entityManager.merge(calificacion));
        }
    }

    // Listar todas las calificaciones
    public List<Calificacion> findAll() {
        return entityManager.createQuery("SELECT c FROM Calificacion c", Calificacion.class).getResultList();
    }

    // Métodos adicionales según las necesidades de tu aplicación
    // Por ejemplo, buscar calificaciones por RecetaID, UserID, etc.
    // ...
}
