package com.culinarycraft.soft2back.entity;
import javax.persistence.*;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "Recetas")
public class Receta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RecetaID")
    private int recetaId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UserID", nullable = false)
    private Usuario usuario;

    @Column(name = "NombreReceta", nullable = false, length = 255)
    private String nombreReceta;

    @Lob
    @Column(name = "Procedimiento", nullable = false)
    private String procedimiento;

    @Column(name = "TiempoPreparacion", nullable = false)
    private int tiempoPreparacion;

    @Column(name = "Porciones", nullable = false)
    private int porciones;

    @Lob
    @Column(name = "DescripcionCorta", nullable = false)
    private String descripcionCorta;

    @Lob
    @Column(name = "ImagenReceta", nullable = false)
    private byte[] imagenReceta;

    @Column(name = "Categoria_CategoriaID", nullable = false)
    private int categoriaCategoriaId;

    // Constructor vacío
    public Receta() {
    }

    // Getters y setters
    public int getRecetaId() {
        return recetaId;
    }

    public void setRecetaId(int recetaId) {
        this.recetaId = recetaId;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    // Getters y setters para otros campos
}
