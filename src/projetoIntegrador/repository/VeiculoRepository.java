package projetoIntegrador.repository;

import projetoIntegrador.model.Veiculo;

import java.util.ArrayList;

public interface VeiculoRepository {

    void listarVeiculos();

    // CRUD de veiculos
    public void cadastrar(Veiculo veiculo);
    public void deletar(Veiculo veiculo);

}
