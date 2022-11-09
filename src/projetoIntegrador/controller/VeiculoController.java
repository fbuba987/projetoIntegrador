package projetoIntegrador.controller;

import projetoIntegrador.model.Veiculo;
import projetoIntegrador.repository.VeiculoRepository;

import java.util.ArrayList;

public class VeiculoController implements VeiculoRepository {

    private ArrayList<Veiculo> listarVeiculo = new ArrayList<Veiculo>();

    // Procurar modelo por ID
    @Override
    public void procurarPorModelo(int id) {

        var veiculo = buscarNaCollection(id);

        if (veiculo != null)
            veiculo.visualizar();
        else
            System.out.println("\nO modelo: " + id + " não foi encontrada!");

    }

    /**
     * Método para buscar a Conta na Collection
     * */
    public Veiculo buscarNaCollection(int id) {

        return  null;
    }

    @Override
    public void listarTodas() {
        for (var veiculo : listarVeiculo) {
            veiculo.visualizar();
        }
    }

    @Override
    public void cadastrar(Veiculo veiculo) {
        listarVeiculo.add(veiculo);
        System.out.println("\nA Conta número: " + veiculo.getId() + " foi criada com sucesso!");

    }

    @Override
    public void atualizar(Veiculo veiculo) {

    }

    @Override
    public void deletar(int id) {

    }

    @Override
    public void alugar(int id, float valor) {

    }
}
