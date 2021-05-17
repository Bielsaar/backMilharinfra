package br.edu.ifpb.bielsaar.milharinfra.controller;

import br.edu.ifpb.bielsaar.milharinfra.model.Produto;
import br.edu.ifpb.bielsaar.milharinfra.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/produtos")
    public List<Produto> getProdutos() {
        return this.produtoService.getProdutos();
    }

    @GetMapping("/produtos/{id}")
    public Produto getProdutoPorId(@PathVariable("id") Long idProduto) {
        return this.produtoService.getProdutoPorId(idProduto);
    }

    @PostMapping("/produtos")
    public Produto inserirProduto (@RequestBody Produto produto) {
        return this.produtoService.inserirOuAtualizar(produto);
    }

    @PutMapping("/produtos/{id}")
    public Produto atualizarProduto (@RequestBody Produto produto) {
        return this.produtoService.inserirOuAtualizar(produto);
    }

    @DeleteMapping("/produtis/{id}")
    public void apagarProduto (@PathVariable("id") Long id) {
        this.produtoService.apagarPorId(id);
    }
}
