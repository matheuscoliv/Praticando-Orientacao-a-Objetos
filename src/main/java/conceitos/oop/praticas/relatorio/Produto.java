package conceitos.oop.praticas.relatorio;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirInformacoes() {
        System.out.printf("Nome: %s\nPreço: %.2f\nQuantidade: %d\n\n", nome, preco, quantidade);
    }
}
