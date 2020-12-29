public abstract class Livro implements Produto {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private boolean impresso;
    private Autor autor;

    public Livro(Autor autor) {
        super();
        this.isbn = "00-000-00000-00";
        this.impresso = true; // para o livro estar sempre impresso
        this.autor = autor;
    }

    public Livro(String isbn) {
        this.isbn = "00-000-00000-00";
    }

    public Livro() {
    }

    boolean temAutor(){
        return this.autor != null;
}

    public void mostrarDetalhes(){
        System.out.println("Nome livro: " + getNome());
        System.out.println("Descrição livro: " + getDescricao());
        System.out.println("Valor livro: " + getValor());
        System.out.println("ISBN livro: " + getIsbn());

    if(this.temAutor()){
        autor.mostrarDetalhes(); // faz acesso ao objeto Autor
    }
        System.out.println("-- -- -- -- -- -- -- --");
}


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isImpresso() {
        return impresso;
    }

    public void setImpresso(boolean impresso) {
        this.impresso = impresso;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
