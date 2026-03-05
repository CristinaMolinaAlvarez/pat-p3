package edu.comillas.icai.gitt.pat.spring.Cristina_P2.repositorio;

import org.springframework.data.repository.CrudRepository;
import edu.comillas.icai.gitt.pat.spring.Cristina_P2.entidad.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    boolean existsByCorreo(String correo);
}
