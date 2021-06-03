package br.edu.ifpb.bielsaar.milharinfra.repositories;

import br.edu.ifpb.bielsaar.milharinfra.model.Carrinho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrinhoRepository extends JpaRepository<Carrinho, Long> {

    public Carrinho findByNome(String nome);
}
