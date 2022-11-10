package projetoIntegrador;


import projetoIntegrador.controller.UsuarioController;
import projetoIntegrador.controller.VeiculoController;
import projetoIntegrador.model.Carro;
import projetoIntegrador.model.Moto;
import projetoIntegrador.model.Usuario;
import projetoIntegrador.model.Veiculo;
import projetoIntegrador.util.Cores;

import java.util.Scanner;

public class Menu {
    static UsuarioController usuarioController = new UsuarioController();

    static Scanner read = new Scanner(System.in);
    static VeiculoController veiculoController = new VeiculoController();
    Usuario usuario;

    public static void main(String[] args) {
        veiculoController.cadastrar(new Veiculo(veiculoController.newId(), "355fv", "verde", "monza", 2022, "fexl") {
        });

        // Variáveis de entrada de dados
         menuPrincipal();

        // Instância da Classe ContaController


        //opções do Menu


    }


    public static void cadastrarUsuario() {

        System.out.println("\nDigite o seu nome ");
        read.skip("\\R?");
        var nome = read.nextLine();
        System.out.println("\nDigite o nome de usuario ");
        read.skip("\\R?");
        var username = read.nextLine();
        System.out.println("\nDigite sua senha ");
        read.skip("\\R?");
        var senha = read.nextLine();
        if (usuarioController.adicionarUsuario(nome, username, senha)) {
            veiculoController.listarVeiculos();
            System.out.println("1 - voltar para o menu principal");
            int volt = read.nextInt();
            if (volt == 1)
                menuPrincipal();
        }

    }

    public static void login() {

        System.out.println("\nDigite o nome de usuario ");
        read.skip("\\R?");
        var username = read.nextLine();
        System.out.println("\nDigite sua senha ");
        read.skip("\\R?");
        var senha = read.nextLine();
        if(usuarioController.validarUsuario(username, senha))
        {
            veiculoController.listarVeiculos();
        }


    }

    public static void menuPrincipal()
    {
        int entrada;

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

        if (entrada > 6 || entrada < 1) {
            System.out.println("Opção invalida. Favor inserir um numero valido");
            entrada = read.nextInt();
        }
        if (entrada == 6) { //Sair do programa
            System.out.println(" Até breve ");
            read.close();
            System.exit(0);
        }

        switch (entrada) {
            case 1 -> {
                login();
            }
            case 2 -> {
                cadastrarUsuario();
            }
            case 3 -> {
                System.out.println("\nLista de veiculos");

                veiculoController.listarVeiculos();
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