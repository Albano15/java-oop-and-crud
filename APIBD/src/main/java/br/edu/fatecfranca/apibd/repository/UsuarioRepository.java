package br.edu.fatecfranca.apibd.repository;

import br.edu.fatecfranca.apibd.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // essa classe  terá todas as operações de CRUD
}
