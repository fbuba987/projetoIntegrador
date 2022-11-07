package projetoIntegrador.model;

public class Moto extends Veiculo{

    private String  capacete;
    private String cilindradas;

    public Moto(int id, String placa, String cor, String modelo, int ano, String combostivel, String capacete, String cilindradas) {
        super(id, placa, cor, modelo, ano, combostivel);

        this.capacete = capacete;
        this.cilindradas = cilindradas;
    }
}
