package entities;

public abstract class Veiculo {
    private final String nome;
    private final Fabricante fabricante;
    private final int anoFabricacao;
    private final int capacidade;

    // Construtor
    public Veiculo(String nome, Fabricante fabricante, int anoFabricacao, int capacidade){
        this.nome = nome;
        this.fabricante = fabricante;
        this.anoFabricacao = anoFabricacao;
        this.capacidade = capacidade;
    }

    // Metodo Getters, não é necessário Setters logo que é uma classe abstrata.
    public String getNome() {
        return nome;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", getNome(), getFabricante());
    }


}
