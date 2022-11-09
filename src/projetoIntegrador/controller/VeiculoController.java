package projetoIntegrador.controller;

import projetoIntegrador.model.Veiculo;
import projetoIntegrador.repository.VeiculoRepository;

import java.util.ArrayList;

public class VeiculoController implements VeiculoRepository {
    ArrayList<Veiculo> listVeiculos = new ArrayList<Veiculo>();

    @Override
    public void listarVeiculos() {

        for (var veiculo : listVeiculos)
        {
            veiculo.listar();
        }

    }

    @Override
    public void cadastrar(Veiculo veiculo) {
        var result = listVeiculos.add(veiculo);
        if(result == true)
            System.out.println("Veiculo cadastrado com cucesso!");

    }

    @Override
    public void deletar(Veiculo veiculo) {
        var result = listVeiculos.remove(veiculo);
        if(result == true)
            System.out.println("Veiculo excluido com sucesso!");

    }
    public int newId()
    {
        return listVeiculos.size() + 1;
    }
}
