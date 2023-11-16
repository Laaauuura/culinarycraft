import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Recetas")
public class Receta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recetaId;

    @Column(nullable = false)
    private Integer userId;

    @Column(nullable = false, length = 255)
    private String nombreReceta;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String procedimiento;

    @Column(nullable = false)
    private Integer tiempoPreparacion;

    @Column(nullable = false)
    private Integer porciones;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String descripcionCorta;

    // Relación con la entidad Calificaciones
    @OneToMany(mappedBy = "receta")
    private List<Calificacion> calificaciones;

    // Getters y setters
    
    public Long getRecetaId() {
        return recetaId;
    }

    public void setRecetaId(Long recetaId) {
        this.recetaId = recetaId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        if (userId == null) {
            throw new IllegalArgumentException("El id del usuario no puede ser nulo");
        }
        this.userId = userId;
    }

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombreReceta) {
        if (nombreReceta == null || nombreReceta.isEmpty()) {
            throw new IllegalArgumentException("El nombre de la receta no puede ser nulo o vacío");
        }
        this.nombreReceta = nombreReceta;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        if (procedimiento == null || procedimiento.isEmpty()) {
            throw new IllegalArgumentException("El procedimiento no puede ser nulo o vacío");
        }
        this.procedimiento = procedimiento;
    }


    public Integer getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(Integer tiempoPreparacion) {
        if (tiempoPreparacion == null || tiempoPreparacion < 0) {
            throw new IllegalArgumentException("El tiempo de preparación no puede ser nulo o negativo");
        }
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public Integer getPorciones() {
        return porciones;
    }

    public void setPorciones(Integer porciones) {
        if (porciones == null || porciones < 0) {
            throw new IllegalArgumentException("El número de porciones no puede ser nulo o negativo");
        }
        this.porciones = porciones;
    }

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public void setDescripcionCorta(String descripcionCorta) {
        if (descripcionCorta == null || descripcionCorta.isEmpty()) {
            throw new IllegalArgumentException("La descripción corta no puede ser nula o vacía");
        }
        this.descripcionCorta = descripcionCorta;
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Calificacion> calificaciones) {
        if (calificaciones == null) {
            throw new IllegalArgumentException("La lista de calificaciones no puede ser nula");
        }
        this.calificaciones = calificaciones;
    }

    @Override
    public String toString() {
        return "Receta{" +
                "recetaId=" + recetaId +
                ", userId=" + userId +
                ", nombreReceta='" + nombreReceta + '\'' +
                ", procedimiento='" + procedimiento + '\'' +
                ", tiempoPreparacion=" + tiempoPreparacion +
                ", porciones=" + porciones +
                ", descripcionCorta='" + descripcionCorta + '\'' +
                ", calificaciones=" + calificaciones +
                '}';
    }

}
