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

    @Override
    public void login(Veiculo veiculo) {

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

    /**
     *  Método Listar todas os veiculos
     * */
    @Override
    public void listaVeiculo() {
        for (var veiculo : listarVeiculo) {
            veiculo.visualizar();
        }

    }

    /**
     * Método Cadastrar no Veiculos
     * */
    @Override
    public void cadastrar(Veiculo veiculo) {
        listarVeiculo.add(veiculo);
        System.out.println("\nA Conta número: " + veiculo.getId() + " foi criada com sucesso!");

    }

    @Override
    public void deletar(String modelo) {
        var veiculo = buscarNaCollection(modelo);

        if (veiculo != null) {
            if(listarVeiculo.remove(veiculo) == true)
                System.out.println("\nA Conta numero: " + modelo + " foi deletada com sucesso!");
        }else
            System.out.println("\nA Conta numero: " + modelo + " não foi encontrada!");

    }

    @Override
    public void alugar(String modelo, float valor) {

    }


    public ArrayList<Veiculo> gerarModelo() {
        return listarVeiculo;
    }
}
