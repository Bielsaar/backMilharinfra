package br.edu.ifpb.bielsaar.milharinfra.model;


import javax.persistence.*;

@Entity
@Table(name = "tb_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Integer valor;
    private Integer estoque;
    private String descricaoSimples;
    private String descricaoCompleta;
    private String imagem;


    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public String getDescricaoSimples() {
        return descricaoSimples;
    }

    public void setDescricaoSimples(String descricaoSimples) {
        this.descricaoSimples = descricaoSimples;
    }

    public String getDescricaoCompleta() {
        return descricaoCompleta;
    }

    public void setDescricaoCompleta(String descricaoCompleta) {
        this.descricaoCompleta = descricaoCompleta;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public boolean hasEmpty() {
        if (this.getValor() < 1
                || this.getNome().isBlank()
                || this.getDescricaoCompleta().isBlank()
                || this.getEstoque() < 1
                || this.getDescricaoSimples().isBlank()
                || this.getImagem().isBlank()){
            return true;
        }
        else return false;
    }
}
