package entities;

public class Automovel extends Veiculo{
    private int diametroRoda;

    //Construtor
    public Automovel(String nome, Fabricante fabricante, int anoFabricacao, int capacidade, int diametroRoda){
        super(nome, fabricante, anoFabricacao, capacidade);

        if (diametroRoda <= 0)
            throw new IllegalArgumentException("Diametro da roda deve ser superior a 0");

        this.diametroRoda = diametroRoda;
    }


    //Configura diametro da roda
    public void setDiametroRoda(int diametroRoda){
        if (diametroRoda <= 0)
            throw new IllegalArgumentException("Diametro da roda deve ser superior a 0");

        this.diametroRoda = diametroRoda;
    }

    // Retorna diametro da roda
    public int getDiametroRoda() {
        return diametroRoda;
    }

    public String acelerar(){
        return "O automóvel acelerou.";
    }

    public String abrirPortaMalas(){
        return "O porta malas do carro foi aberto";
    }

    //O metodo 'Mostrar Detalhes' vai ser diretamente um toString, será necessário somente chamar a classe.
    @Override
    public String toString() {
        return String.format("O carro %s, ano %d, produzido pela %s, possui capacidade para %d pessoas" +
                        " com sua roda de %d de diâmetro.",
                getNome(), getAnoFabricacao(), getFabricante(), getCapacidade(), getDiametroRoda());
    }


}
