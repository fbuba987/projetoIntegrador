package projetoIntegrador.model;

public class Carro extends Veiculo{

        private String tracao;
        private float motor;

        public Carro(int id, String placa, String cor, String modelo, int ano, String combustivel) {
            super(id, placa, cor, modelo, ano, combustivel);

            this.tracao = tracao;
            this.motor = motor;
        }
    }


