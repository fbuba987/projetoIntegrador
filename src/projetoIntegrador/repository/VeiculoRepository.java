package projetoIntegrador.repository;

import projetoIntegrador.model.Veiculo;

public interface VeiculoRepository {

    // CRUD da Conta
    public void listaVeiculo();
    public  void procurarPorModelo(String modelo);
    public void login(Veiculo veiculo);
    public void cadastrar(Veiculo veiculo);
    public void deletar(String modelo);

    // Métodos de alugar
    public void alugar(String modelo, float valor);

}
