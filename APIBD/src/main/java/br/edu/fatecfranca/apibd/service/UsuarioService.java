package br.edu.fatecfranca.apibd.service;

import br.edu.fatecfranca.apibd.dto.UsuarioDTO;
import br.edu.fatecfranca.apibd.model.Usuario;
import br.edu.fatecfranca.apibd.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    // injeção de dependências
    @Autowired // usar os métodos da classe sem instânciar
    UsuarioRepository usuarioRepository;

    // lista todos os usuários
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    //lista usuário por id
    public Optional <Usuario> buscaPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    //salvar um usuário
    public Usuario salva(UsuarioDTO usuario) {
        Usuario newuser = new Usuario();

        newuser.setNome(usuario.getNome());
        newuser.setPassword(usuario.getPassword());

        return usuarioRepository.save(newuser);
    }

    public void excluir (Long id) {
        if (usuarioRepository.existsById(id)){
            usuarioRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Usuário não encontrado.");
        }
    }

    public Usuario atualiza(UsuarioDTO usuario) {
        Usuario newuser = new Usuario();

        newuser.setId(usuario.getId());
        newuser.setNome(usuario.getNome());
        newuser.setPassword(usuario.getPassword());

        return usuarioRepository.save(newuser);
    }


}
