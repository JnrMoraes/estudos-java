public class EBook extends Livro{

    private String waterMark;

    public EBook(Autor autor) {
        super(autor);
    }

    public EBook() {

    }

    public void adiciona(Livro livro){
        EBook eBook = (EBook) livro;
        eBook.getWaterMark();
        System.out.println("Adiconando: " + livro);
    }

    @Override
    public boolean aplicarDescontoDe(double porcentagem){
        if(porcentagem > 0.15 ){
            return false;
        }
        return super.aplicarDescontoDe(porcentagem);
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
}
