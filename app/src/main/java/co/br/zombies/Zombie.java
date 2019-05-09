package co.br.zombies;

public class Zombie {

    private String nome;
    private int idade;
    private int imagem;

    public Zombie() {
    }

    public Zombie(String nome, int idade, int imagem) {
        super();
        this.nome = nome;
        this.idade = idade;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return nome;
    }
}