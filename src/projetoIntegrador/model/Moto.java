package projetoIntegrador.model;

public class Moto extends Veiculo{

    private String  capacete;
    private String cilindradas;

    public Moto(int id, String placa, String cor, String modelo, int ano, String combustivel, String capacete, String cilindradas) {
        super(id, placa, cor, modelo, ano, combustivel);

        this.capacete = capacete;
        this.cilindradas = cilindradas;
    }

    public String getCapacete() {
        return capacete;
    }

    public void setCapacete(String capacete) {
        this.capacete = capacete;
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Capacidade: " + this.capacete);
        System.out.println("Cilindradas: " + this.cilindradas);
    }
}
