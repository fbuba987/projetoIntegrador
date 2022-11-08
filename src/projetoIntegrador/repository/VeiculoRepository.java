package projetoIntegrador.repository;

import projetoIntegrador.model.Veiculo;

public interface VeiculoRepository {

    // CRUD de veiculos
    public void listarVeiculos();
    public void cadastrar();
    public void deletar();

}
