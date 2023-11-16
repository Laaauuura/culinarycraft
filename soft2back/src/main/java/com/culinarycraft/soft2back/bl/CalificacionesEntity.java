import javax.persistence.*;

@Entity
@Table(name = "Calificaciones")
public class Calificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long calificacionId;

    @Column(nullable = false)
    private Integer userId;

    @Column(nullable = true)
    private Integer puntuacion;

    @ManyToOne
    @JoinColumn(name = "recetaId", nullable = false)
    private Receta receta;

    // Getters y setters
    
    public Long getCalificacionId() {
        return calificacionId;
    }

    public void setCalificacionId(Long calificacionId) {
        this.calificacionId = calificacionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Integer puntuacion) {
        if (puntuacion < 0 || puntuacion > 5) {
            throw new IllegalArgumentException("La puntuación debe estar entre 0 y 5");
        }
        this.puntuacion = puntuacion;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        if (receta == null) {
            throw new IllegalArgumentException("La receta no puede ser nula");
        }
        this.receta = receta;
    }

    @Override
    public String toString() {
        return "Calificacion{" +
                "calificacionId=" + calificacionId +
                ", userId=" + userId +
                ", puntuacion=" + puntuacion +
                ", receta=" + receta +
                '}';
    }

}
