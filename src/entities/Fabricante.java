package entities;

public class Fabricante {
    private String nome;
    private String paisDeOrigem;

    // Construtor
    public Fabricante(String nome, String paisDeOrigem) {
        this.nome = nome;
        this.paisDeOrigem = paisDeOrigem;
    }

    public String getNome() {
        return nome;
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", getNome(), getPaisDeOrigem());
    }
}
