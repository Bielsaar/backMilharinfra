package br.edu.ifpb.bielsaar.milharinfra.model;


import javax.persistence.*;

@Entity
@Table(name = "tb_carrinho")
public class Carrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Integer valor;
    private Integer quantCarrinho;
    private String descricaoSimples;
    private String descricaoCompleta;
    private String imagem;


    public long getId() {
        return id;
    }

    public String getNome() {
        return this.nome;
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

    public Integer getQuantCarrinho() {
        return quantCarrinho;
    }

    public void setQuantCarrinho(Integer quantCarrinho) {
        this.quantCarrinho = quantCarrinho;
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

    public boolean isUltimoProduto() {
        if (this.getQuantCarrinho() == 1) {
            return true;
        } else return false;
    }

    public void adicionarQuantidadeCarrinho() {
        this.quantCarrinho++;
    }

    public void removerQuantidadeCarrinho() {
        this.quantCarrinho--;
    }
}
