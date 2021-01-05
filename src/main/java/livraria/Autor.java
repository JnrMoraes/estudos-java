package livraria;

public class Autor {
    private String nome;
    private String email;
    private String cpf;

    public Autor() {
    }

    public void mostrarDetalhes(){

    System.out.println("Nome livraria.Autor: " + getNome());
    System.out.println("Email livraria.Autor: " + getEmail());
    System.out.println("CPF livraria.Autor: " + getCpf());

}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Autor)) return false; // instanceof se o paramentro passado não foi uma instanca tipo Autor

        Autor autor = (Autor) o;

        if (getNome() != null ? !getNome().equals(autor.getNome()) : autor.getNome() != null) return false;
        if (getEmail() != null ? !getEmail().equals(autor.getEmail()) : autor.getEmail() != null) return false;
        return getCpf() != null ? getCpf().equals(autor.getCpf()) : autor.getCpf() == null;
    }

    @Override
    public int hashCode() {
        int result = getNome() != null ? getNome().hashCode() : 0;
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + (getCpf() != null ? getCpf().hashCode() : 0);
        return result;
    }
}
