package projetoIntegrador.model;

public class Carro extends Veiculo {

        private String tracao;
        private float motor;

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

    public Carro(int id, String placa, String cor, String modelo,float valor, int ano,float motor,String tracao,int status) {
            super(id, placa, cor, modelo, valor, ano, status);

            this.tracao = tracao;
            this.motor = motor;
        }

    @Override
    public void listar() {
        super.listar();
        System.out.println("Tração: "+getTracao());
        System.out.println("Motor: "+getMotor());
    }
}


