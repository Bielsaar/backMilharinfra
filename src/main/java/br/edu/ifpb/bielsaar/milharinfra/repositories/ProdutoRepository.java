package br.edu.ifpb.bielsaar.milharinfra.repositories;

import br.edu.ifpb.bielsaar.milharinfra.model.Produto;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    @Override
    public List<Produto> findAll(Sort sort);

    @Override
    public List<Produto> findAll();

    public List<Produto> findByNomeContaining(String s);
}
