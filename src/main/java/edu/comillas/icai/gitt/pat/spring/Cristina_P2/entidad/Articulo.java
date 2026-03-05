package edu.comillas.icai.gitt.pat.spring.Cristina_P2.entidad;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.persistence.Id;

@Entity
@Table(name = "articulos")
public class Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArticuloLinea;

    // @NotNull porque un artículo siempre debe pertenecer a un carrito.
    // Si fuese null, no tendría sentido en el modelo de negocio.
    @NotNull
    @ManyToOne
    private Carrito carrito;

    // nullable = false porque el id del producto es obligatorio en base de datos.
    @Column(nullable = false)
    private Long idArticulo;

    @Positive
    @Column(nullable = false)
    private Double precioUnitario;

    @Positive
    @Column(nullable = false)
    private Integer unidades;

    public Articulo() {}

    public Articulo(Carrito carrito, Long idArticulo, Double precioUnitario, Integer unidades) {
        this.carrito = carrito;
        this.idArticulo = idArticulo;
        this.precioUnitario = precioUnitario;
        this.unidades = unidades;
    }

    public Long getIdArticuloLinea() {return idArticuloLinea; }
    public void setIdArticuloLinea(Long idArticuloLinea) {
        this.idArticuloLinea = idArticuloLinea;
    }
    public Carrito getCarrito() {
        return carrito;
    }
    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
    public Long getIdArticulo() {
        return idArticulo;
    }
    public void setIdArticulo(Long idArticulo) {
        this.idArticulo = idArticulo;
    }
    public Double getPrecioUnitario() {
        return precioUnitario;
    }
    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public Integer getUnidades() {
        return unidades;
    }
    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }
}