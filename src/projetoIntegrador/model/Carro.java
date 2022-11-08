package projetoIntegrador.model;

import projetoIntegrador.repository.VeiculoRepository;

public class Carro extends Veiculo implements VeiculoRepository {

        private String tracao;
        private float motor;

        public Carro(int id, String placa, String cor, String modelo, int ano, String combustivel) {
            super(id, placa, cor, modelo, ano, combustivel);

            this.tracao = tracao;
            this.motor = motor;
        }

    @Override
    public void listarVeiculos() {
        
    }

    @Override
    public void cadastrar() {

    }

    @Override
    public void deletar() {

    }
}


