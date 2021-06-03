package br.edu.ifpb.bielsaar.milharinfra.controller;



import br.edu.ifpb.bielsaar.milharinfra.model.Usuario;
import br.edu.ifpb.bielsaar.milharinfra.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuario/{id}")
    public Usuario getProdutoCarrinhoPorId(@PathVariable("id")Usuario idProdutoCarrinho) {
        return this.usuarioService.getUsuarioPorNome(idProdutoCarrinho);
    }

}
