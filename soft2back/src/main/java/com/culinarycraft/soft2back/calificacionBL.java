import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CalificacionService {

    private final CalificacionRepository calificacionRepository;

    @Autowired
    public CalificacionService(CalificacionRepository calificacionRepository) {
        this.calificacionRepository = calificacionRepository;
    }

    // Métodos para manejar la lógica de Calificaciones
    // Ejemplo: añadir una calificación, buscar por receta, etc.
}
