package br.com.acrf.pontonline.service;

import br.com.acrf.pontonline.model.Usuario;
import br.com.acrf.pontonline.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario update(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void delete(Long id) throws Exception {
        usuarioRepository.deleteById(id);
    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> findByID(Long id) {
        return usuarioRepository.findById(id);
    }
}