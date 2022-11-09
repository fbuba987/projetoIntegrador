package projetoIntegrador;


import projetoIntegrador.controller.VeiculoController;
import projetoIntegrador.model.Carro;
import projetoIntegrador.model.Moto;

public class Menu {

    // Variáveis de entrada de dados
    int id, opcao;
    String nome;

    // Instância da Classe ContaController
    VeiculoController contas = new VeiculoController();


    Carro c1 = new Carro(123, "MQ-2540", "Prata", "Fusca", 2021, "Etanol", "Stock car", 1.0f);
    Moto m1 = new Moto(342, "AG-567", "Branca", "Yamaha", 2022, "Gasolina", "A colocar", "A colocar");


}
