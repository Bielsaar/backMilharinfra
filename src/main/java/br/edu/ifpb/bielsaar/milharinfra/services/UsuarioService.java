package br.edu.ifpb.bielsaar.milharinfra.services;

import br.edu.ifpb.bielsaar.milharinfra.model.Usuario;
import br.edu.ifpb.bielsaar.milharinfra.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Boolean verificaUsuario(Usuario usuario) {
        Usuario teste = usuarioRepository.findByNomeAndSenha(usuario.getNome(), usuario.getSenha());
        if (teste == null){
            return false;
        }else {
            return true;
        }
    }

    public Usuario getUsuarioPorNome(Usuario usuario) {
        return usuarioRepository.findByNomeAndSenha(usuario.getNome(), usuario.getSenha());
    }
}
