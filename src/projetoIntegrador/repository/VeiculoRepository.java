package projetoIntegrador.repository;

import projetoIntegrador.model.Veiculo;

public interface VeiculoRepository {

    // CRUD da Conta
    public void listaVeiculo();
    public  void procurarPorModelo(String modelo);
    public void login();
    public void cadastrar(Veiculo veiculo);
    public void deletar(int id);

    // Métodos de alugar
    public void alugar(int id, float valor);

}
