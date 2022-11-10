package projetoIntegrador;


import projetoIntegrador.controller.VeiculoController;
import projetoIntegrador.model.Carro;
import projetoIntegrador.model.Moto;
import projetoIntegrador.util.Cores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        // Instância da Classe ContaController
        VeiculoController veiculos = new VeiculoController();

        Carro c1 = new Carro(123, "MQ-5423", "Amarelo", "Yunday", 2022, "Etanol", "Sei la", 1.0f);

    Scanner read = new Scanner(System.in);

    // Variáveis de entrada de dados
    int id;

    int entrada;
    //login
    String senha, usuario, nome;

    // Instância da Classe ContaController
    VeiculoController contas = new VeiculoController();




		while (true) {

        System.out.println(Cores.TEXT_BLUE_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND + "------------------------------------- ");
        System.out.println(" |                                  | ");
        System.out.println(" |    Bem vindo(a) a easy facility  | ");
        System.out.println(" |                                  | ");
        System.out.println("------------------------------------- ");
        System.out.println(" |                                  | ");
        System.out.println(" |                                  | ");
        System.out.println(" |        1 Login                   | ");
        System.out.println(" |        2 Cadastrar               | ");
        System.out.println(" |        3 Ver lista de veiculos   | ");
        System.out.println(" |        4 Procurar modelo         | ");
        System.out.println(" |        5 alugar                  | ");
        System.out.println(" |        6 sair                    | ");
        System.out.println(" |                                  | ");
        System.out.println(" |                                  | ");
        System.out.println("------------------------------------- ");
        System.out.println("                                      ");
        System.out.println("     Digite a opção desejada          " + Cores.TEXT_RESET);

        entrada = read.nextInt();
            try {
                entrada = read.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite valores inteiros!");
                read.nextLine();
                entrada = 0;
            }

            if (entrada == 6) {
                System.out.println(Cores.TEXT_BLUE_BOLD_BRIGHT + "\nEasy Facility LTDA \nLocação de veículos!");
                read.close();
                System.exit(0);
            }
//        for(int i = 0; i < 6; i++) { //Numero invalido
//            if (entrada > 6 || entrada <1) {
//                System.out.println("Opção invalida. Favor inserir um numero valido");
//                entrada = read.nextInt();
//            }
//            if (entrada == 6) { //Sair do programa
//                System.out.println(" Até breve ");
//                read.close();
//                System.exit(0);
//            }
//        }



        //opções do Menu
        switch (entrada) {
            case 1 -> {
                System.out.println("\nDigite o nome de usuario ");
                read.skip("\\R?");
                System.out.println("\nDigite sua senha ");
                read.skip("\\R?");
                //usuario.validarUsuario(usuario, senha);
                //if( ) {
            }
            case 2 -> {
                System.out.println("\nDigite o seu nome ");
                read.skip("\\R?");
                System.out.println("\nDigite o nome de usuario ");
                read.skip("\\R?");
                System.out.println("\nDigite sua senha ");
                read.skip("\\R?");
            }
            case 3 -> {
                System.out.println(Cores.TEXT_BLUE_BOLD_BRIGHT  + "\nLista de veiculos");
                veiculos.listaVeiculo();
            }
            case 4 -> {
                System.out.println("\nProcurar modelo");
            }
            case 5 -> {
                System.out.println("\nAlugar carro");
            }
            case 6 -> {
                System.out.println("\nSair");
            }


        }



    }

}
}
