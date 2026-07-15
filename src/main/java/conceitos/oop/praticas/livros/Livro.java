package conceitos.oop.praticas.livros;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirInformacoes() {
        System.out.printf("%s de %s com %d", titulo, autor, paginas);
    }
}
