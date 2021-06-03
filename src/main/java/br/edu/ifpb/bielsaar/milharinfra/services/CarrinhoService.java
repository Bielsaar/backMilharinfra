package br.edu.ifpb.bielsaar.milharinfra.services;


import br.edu.ifpb.bielsaar.milharinfra.model.Carrinho;
import br.edu.ifpb.bielsaar.milharinfra.repositories.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CarrinhoService {

    @Autowired
    private CarrinhoRepository carrinhoRepository;

    public List<Carrinho> getCarrinho(){
        List<Carrinho> aux = this.carrinhoRepository.findAll();
        return aux ;
    }

    public Carrinho getCarrinhoPorId(Long idProdutoCarrinho) {
        return this.carrinhoRepository.findById(idProdutoCarrinho).orElse(null);
    }

    public boolean existeProdutoCarrinho(Long idProdutoCarrinho) {
        return this.carrinhoRepository.existsById(idProdutoCarrinho);
    }

    @Transactional
    public Carrinho inserirAoCarrinho (Carrinho carrinho) {
        Carrinho produtoCarrinho = this.carrinhoRepository.findByNome(carrinho.getNome());
        System.out.println("carrinho");
        if (produtoCarrinho != null){
            produtoCarrinho.adicionarQuantidadeCarrinho();
        }
        Carrinho carrinhoInserido = this.carrinhoRepository.save(carrinho);
        return carrinhoInserido;
    }

    @Transactional
    public Carrinho atualizarProdutoCarrinho (Carrinho carrinho){
        System.out.println(carrinho.getQuantCarrinho());
        Carrinho produtoCarrinho = this.carrinhoRepository.findByNome(carrinho.getNome());
        if (produtoCarrinho == null){
            throw new RuntimeException("Não existe esse produto no carrinho");
        }
        return this.carrinhoRepository.save(carrinho);
    }



    public void apagarProdutoCarrinhoPorId (Long id) {
        this.carrinhoRepository.deleteById(id);
    }
}
