package edu.comillas.icai.gitt.pat.spring.Cristina_P2.entidad;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.persistence.Id;

@Entity
@Table(name = "carritos")
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarrito;

    @NotNull
    @ManyToOne
    private Usuario usuario;
    //tenemos un carrito cuando hemos metido un artículo
    // por eso, en cuanto se crea tiene que haber un precio
    @Positive
    @Column(nullable = false)
    private Double totalPrecio;


    public Carrito() {}

    public Carrito(Usuario usuario, Double totalPrecio) {
        this.usuario = usuario;
        this.totalPrecio = totalPrecio;
    }
    public Long getIdCarrito() {
        return idCarrito;
    }
    public void setIdCarrito(Long idCarrito) {
        this.idCarrito = idCarrito;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Double getTotalPrecio() {
        return totalPrecio;
    }
    public void setTotalPrecio(Double totalPrecio) {
        this.totalPrecio = totalPrecio;
    }

}