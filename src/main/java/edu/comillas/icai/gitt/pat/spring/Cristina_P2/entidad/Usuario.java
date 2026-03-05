package edu.comillas.icai.gitt.pat.spring.Cristina_P2.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.Id;
import java.util.List;

package edu.comillas.icai.gitt.pat.spring.Cristina_P2.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    // @Email para asegurar formato correcto.
    // unique = true porque no pueden existir dos usuarios con el mismo correo en la BD.
    @NotBlank
    @Email
    @Column(nullable = false, unique = true)
    private String correo;

    public Usuario() {}

    public Usuario(String correo) {
        this.correo = correo;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}