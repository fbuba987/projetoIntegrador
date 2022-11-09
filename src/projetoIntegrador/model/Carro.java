package projetoIntegrador.model;

public class
Carro extends Veiculo{

    private String tração;
    private float motor;

    public Carro(int id, String placa, String cor, String modelo, int ano, String combostivel) {
        super(id, placa, cor, modelo, ano, combostivel);
    }
}

