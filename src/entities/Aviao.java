package entities;

public class Aviao extends Veiculo{
    private int numTurbinas; // Número de turbinas

    // Construtor
    public Aviao(String nome, Fabricante fabricante, int anoFabricacao, int capacidade, int numTurbinas){
        super(nome, fabricante, anoFabricacao, capacidade);

        if (numTurbinas < 2 || numTurbinas > 8)
            throw new IllegalArgumentException("O número mínimo de turbinas deve ser 2 e <= 8");

        this.numTurbinas = numTurbinas;
    }

    // Configura numéro de turbinas
    public void setNumTurbinas(int numTurbinas){
        if (numTurbinas < 2 || numTurbinas > 8)
            throw new IllegalArgumentException("O número mínimo de turbinas deve ser 2 e <= 8");

        this.numTurbinas = numTurbinas;
    }

    // Retorna número de turbinas
    public int getNumTurbinas(){
        return numTurbinas;
    }

    public String acelerar(){
        return "O avião acelerou.";
    }

    public String decolar(){
        return "O avisão decolou.";
    }

    public String pousar(){
        return "O avião pousou.";
    }


    @Override
    public String toString() {
        return String.format("O %s, ano %d, produzido pela %s, com capacidade para %d. Possui %d turbinas.",
                getNome(), getAnoFabricacao(), getFabricante().getNome(), getCapacidade(), getNumTurbinas());

    }
}
