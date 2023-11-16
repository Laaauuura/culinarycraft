package com.culinarycraft.soft2back.dao;
import jakarta.persistence.*;
import java.util.List;

public class RecetaDAO {

    // Inyectar el EntityManager
    @PersistenceContext
    private EntityManager entityManager;

    // Guardar una nueva receta
    public void create(Receta receta) {
        entityManager.persist(receta);
    }

    // Obtener una receta por su ID
    public Receta findById(int id) {
        return entityManager.find(Receta.class, id);
    }

    // Actualizar una receta existente
    public Receta update(Receta receta) {
        return entityManager.merge(receta);
    }

    // Eliminar una receta
    public void delete(Receta receta) {
        if (entityManager.contains(receta)) {
            entityManager.remove(receta);
        } else {
            entityManager.remove(entityManager.merge(receta));
        }
    }

    // Listar todas las recetas
    public List<Receta> findAll() {
        return entityManager.createQuery("SELECT r FROM Receta r", Receta.class).getResultList();
    }

    // Otros métodos útiles como búsqueda por criterios específicos
    // ...
}
