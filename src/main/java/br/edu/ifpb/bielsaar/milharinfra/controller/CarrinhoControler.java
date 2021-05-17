package br.edu.ifpb.bielsaar.milharinfra.controller;


import br.edu.ifpb.bielsaar.milharinfra.model.Carrinho;
import br.edu.ifpb.bielsaar.milharinfra.services.CarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class CarrinhoControler {

    @Autowired
    private CarrinhoService carrinhoService;

    @GetMapping("/carrinho")
    public List<Carrinho> getCarrinho() {
        return this.carrinhoService.getCarrinho();
    }

    @GetMapping("/carrinho/{id}")
    public Carrinho getProdutoCarrinhoPorId(@PathVariable("id")Long idProdutoCarrinho) {
        return this.carrinhoService.getCarrinhoPorId(idProdutoCarrinho);
    }

    @PostMapping("/carrinho")
    public Carrinho inserirProdutoCarrinho(@RequestBody Carrinho carrinho) {
            return this.carrinhoService.inserirAoCarrinho(carrinho);
    }

    @PutMapping("/carrinho/{id}")
    public Carrinho atualizarQuantidadeProdutoCarrinho(@RequestBody Carrinho carrinho) {
        return this.carrinhoService.atualizarProdutoCarrinho(carrinho);
    }


    @DeleteMapping("/carrinho/{id}")
    public void removerProdutoCarrinho(@PathVariable("id")Long id){
        this.carrinhoService.apagarProdutoCarrinhoPorId(id);
    }
}
