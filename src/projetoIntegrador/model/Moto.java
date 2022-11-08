package projetoIntegrador.model;

public class Moto extends Veiculo{

    private String  capacete;
    private String cilindradas;

    public Moto(int id, String placa, String cor, String modelo, int ano, String combustivel, String capacete, String cilindradas) {
        super(id, placa, cor, modelo, ano, combustivel);

        this.capacete  = capacete;
        this.cilindradas = cilindradas;
    }
}
