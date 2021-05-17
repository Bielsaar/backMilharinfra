package br.edu.ifpb.bielsaar.milharinfra.services;

import br.edu.ifpb.bielsaar.milharinfra.model.Produto;
import br.edu.ifpb.bielsaar.milharinfra.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> getProdutos() {
        return this.produtoRepository.findAll();
    }

    public Produto getProdutoPorId(Long idProduto) {

        return this.produtoRepository.findById(idProduto).orElse(null);
    }

    @Transactional
    public Produto inserirOuAtualizar (Produto produto) {
        if (produto.hasEmpty()){
            throw new RuntimeException("Um dos campos está vazio ou com numereção menor que 1, por favor, preencha todos os campos");
        }
        Produto produtoInserido = this.produtoRepository.save(produto);
        return produtoInserido;
    }

    public void apagarPorId(Long id) {
        this.produtoRepository.deleteById(id);
    }
}
