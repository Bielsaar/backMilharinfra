package br.edu.ifpb.bielsaar.milharinfra.repositories;


import br.edu.ifpb.bielsaar.milharinfra.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public Usuario findByNomeAndSenha(String nome, String Senha);

}
