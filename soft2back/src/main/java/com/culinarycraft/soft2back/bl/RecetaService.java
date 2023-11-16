package com.culinarycraft.soft2back.bl;
import java.util.List;

public class RecetaService {

    private RecetaDAO recetaDAO; // Suponiendo que hay un mecanismo de inyección de dependencias

    // Constructor
    public RecetaService(RecetaDAO recetaDAO) {
        this.recetaDAO = recetaDAO;
    }

    // Agregar una nueva receta
    public void addReceta(Receta receta) {
        // Aquí puedes agregar validaciones o lógica de negocio antes de guardar la receta
        recetaDAO.create(receta);
    }

    // Obtener una receta por ID
    public Receta getRecetaById(int id) {
        // Puedes agregar lógica adicional aquí, como manejo de errores o lógica específica
        return recetaDAO.findById(id);
    }

    // Actualizar una receta
    public void updateReceta(Receta receta) {
        // Validaciones o transformaciones antes de actualizar
        recetaDAO.update(receta);
    }

    // Eliminar una receta
    public void deleteReceta(int id) {
        Receta receta = recetaDAO.findById(id);
        if (receta != null) {
            recetaDAO.delete(receta);
        }
        // Manejo de caso en que la receta no exista, si es necesario
    }

    // Listar todas las recetas
    public List<Receta> getAllRecetas() {
        return recetaDAO.findAll();
    }

    // Métodos adicionales para lógica de negocio
    // ...
}
