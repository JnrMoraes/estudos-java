public class Autor {
    String nome;
    String email;
    String cpf;

    void mostrarDetalles(){

        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Cpf: " + cpf);
        System.out.println("---------------");
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

}
