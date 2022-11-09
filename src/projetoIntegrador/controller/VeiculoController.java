package projetoIntegrador.controller;

import projetoIntegrador.model.Veiculo;
import projetoIntegrador.repository.VeiculoRepository;

import java.util.ArrayList;

public class VeiculoController implements VeiculoRepository {

    private static ArrayList<Veiculo> listarVeiculo = new ArrayList<Veiculo>();

    public  Object newId() {
        return listarVeiculo.size() + 1;
    }

    // Procurar modelo por ID
    @Override
    public void procurarPorModelo(String modelo) {

        var veiculo = buscarNaCollection(modelo);

        if (veiculo != null)
            veiculo.visualizar();
        else
            System.out.println("\nO modelo: " + modelo + " não foi encontrada!");



    }
    /**
     * Método para buscar a Conta na Collection
     * */
    public Veiculo buscarNaCollection(String modelo) {
        for (var veiculo : listarVeiculo)
        {
            if (veiculo.getModelo().equalsIgnoreCase(modelo) == true)
            {
                veiculo.visualizar();
            }
        }

        return  null;
    }

    @Override
    public void listaVeiculo() {
        for (var conta : listarVeiculo) {
            conta.visualizar();
        }

    }

    @Override
    public void login() {

    }

    @Override
    public void cadastrar(Veiculo veiculo) {
        listarVeiculo.add(veiculo);
        System.out.println("\nA Conta número: " + veiculo.getId() + " foi criada com sucesso!");

    }

    @Override
    public void deletar(int id) {

    }

    @Override
    public void alugar(int id, float valor) {

    }
}
