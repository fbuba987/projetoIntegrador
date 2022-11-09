package projetoIntegrador.repository;

import projetoIntegrador.model.Veiculo;

public interface VeiculoRepository {

    // CRUD da Conta
    public void procurarPorModelo(int id);
    public void listarTodas();
    public void cadastrar(Veiculo veiculo);
    public void atualizar(Veiculo veiculo);
    public void deletar(int id);

    // Métodos de alugar
    public void alugar(int id, float valor);

}
