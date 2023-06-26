package entities;

public class Barco extends Veiculo{
    private int numVelas; // Números de ela do barco.

    // Constutor
    public Barco(String nome, Fabricante fabricante, int anoFabricacao, int capacidade, int numVelas){
        super(nome, fabricante, anoFabricacao, capacidade);

        if (numVelas <= 0)
            throw new IllegalArgumentException("Número de velas tem que ser maior que 0");

        this.numVelas = numVelas;
    }

    // Configuração de número de velas
    public void setNumVelas(int numVelas) {
        if (numVelas <= 0)
            throw new IllegalArgumentException("Número de velas tem que ser maior que 0");

        this.numVelas = numVelas;
    }

    // Retorna número de velas
    public int getNumVelas() {
        return numVelas;
    }

    public String acelerar(){
        return "O barco acelerou";
    }

    public String icarVelas(){
        return "O barco está com as velas içadas";
    }

    public String recolherVelas(){
        return "Velas recolhidas";
    }


    @Override
    public String toString() {
        return String.format("O %s, ano %d, produzido pela %s, com capacidade para %d. Possui %d velas.",
                getNome(), getAnoFabricacao(), getFabricante().getNome(), getCapacidade(), getNumVelas());

    }

}
