package projetoIntegrador.model;

import projetoIntegrador.util.Cores;

public class Moto extends Veiculo{

    private int  capacete;
    private String cilindradas;

    public int getCapacete() {
        return capacete;
    }

    public void setCapacete(int capacete) {
        this.capacete = capacete;
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Moto(int id, String placa, String cor, String modelo,float valor,int ano, int capacete, String cilindradas,int status) {
        super(id, placa, cor, modelo, valor, ano, status);

        this.capacete  = capacete;
        this.cilindradas = cilindradas;
    }

    @Override
    public void listar() {
        super.listar();
        System.out.println(Cores.TEXT_YELLOW+"Quantidades de Capacete: "+Cores.TEXT_RESET+getCapacete());
        System.out.println(Cores.TEXT_YELLOW+"Cilindradas: "+Cores.TEXT_RESET+getCilindradas());
    }
}
