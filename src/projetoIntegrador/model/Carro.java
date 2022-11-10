package projetoIntegrador.model;

import java.util.ArrayList;

public class Carro extends Veiculo{

    private String tracao;
    private float motor;

    public Carro(int id, String placa, String cor, String modelo, int ano, String combustivel, String tracao, float motor) {
        super(id, placa, cor, modelo, ano, combustivel);

        this.tracao = tracao;
        this.motor = motor;
    }

    public String getTracao() {
        return tracao;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Atração: " + this.tracao);
        System.out.println("Modelo de motor: " + this.motor);
    }
}

