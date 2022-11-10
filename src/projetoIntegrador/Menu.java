package projetoIntegrador;


import projetoIntegrador.controller.UsuarioController;
import projetoIntegrador.controller.VeiculoController;
import projetoIntegrador.model.*;
import projetoIntegrador.util.Cores;

import java.util.Date;
import java.util.Scanner;

public class Menu {
    static UsuarioController usuarioController = new UsuarioController();
    static Usuario user = null;

    static Scanner read = new Scanner(System.in);
    static VeiculoController veiculoController = new VeiculoController();
    Usuario usuario;

    public static void main(String[] args) {
        veiculoController.cadastrar(new Veiculo(veiculoController.newId(),
                "355fv",
                "verde",
                "monza",
                100.0f,
                2022,
                0) {});
        usuarioController.adicionarUsuario(
                "Administrator",
                "admin",
                "admin",
                1);
         menuPrincipal();


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
        System.out.println("\nDigite sua tipo ");
        read.skip("\\R?");
        var tipo = read.nextInt();
        if (usuarioController.adicionarUsuario(nome, username, senha,tipo)) {
            veiculoController.listarVeiculos();
            System.out.println("1 - voltar para o menu principal");
            int volt = read.nextInt();
            if (volt == 1)
                menuPrincipal();
        }

    }

    public static void login() {

        System.out.println("\nEfetuar login!");
        System.out.println("\nDigite o nome de usuario ");
        read.skip("\\R?");
        var username = read.nextLine();
        System.out.println("\nDigite sua senha ");
        read.skip("\\R?");
        var senha = read.nextLine();
        user = usuarioController.validarUsuario(username, senha);
        if( user !=null)
        {
            System.out.println("\n1 - Listar Veiculos ");
            read.skip("\\R? 2- Voltar ao Menu Principal");
            var opt = read.nextInt();
            switch (opt)
            {
                case 1 ->{ veiculoController.listarVeiculos();}
                case 2 ->{menuPrincipal();}
            }

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
                cadastrar();


            }
            case 3 -> {
                System.out.println("\nLista de veiculos");
                read.skip("\\R?");

                listar();
            }
            case 4 -> {
                System.out.println("\nProcurar modelo");
                read.skip("\\R?");
                var modelo = read.nextLine();
                veiculoController.pesquisar(modelo);
            }
            case 5 -> {
                System.out.println("\nAlugar carro");
            }
            case 6 -> {
                System.out.println("\nSair");
            }


        }


    }
    public static void cadastrar()
    {
        int menuCadastro;
        System.out.println("7 - Cadastrar Veiculo");
        System.out.println("8 - Cadastrar Usuário");
        menuCadastro = read.nextInt();
        if (user == null)
        {
            System.out.println("Somente o Administrador pode efetuar cadastro");
            login();
        }
        if (menuCadastro == 7 && user.getTipo() == 1 )
        {
            cadastrarVeiculo();

        } else if (menuCadastro == 8 && user.getTipo() == 1)
        {
            cadastrarUsuario();
        }
        else
        {
            System.out.println("Opção inexistente!");
        }

    }
     public static void cadastrarVeiculo()
    {

        System.out.println("\n1 - Carro: ");
        System.out.println("\n2 - Moto: ");
        read.skip("\\R?");
        var opt = read.nextInt();
        switch (opt)
        {
            case 1->
            {

                System.out.println("\nPlaca: ");
                read.skip("\\R?");
                var placa = read.nextLine();

                System.out.println("\nCor: ");
                read.skip("\\R?");
                var cor = read.nextLine();

                System.out.println("\nModelo: ");
                read.skip("\\R?");
                var modelo = read.nextLine();

                System.out.println("\nValor: ");
                read.skip("\\R?");
                var valor = read.nextFloat();

                System.out.println("\nAno: ");
                read.skip("\\R?");
                var ano = read.nextInt();

                System.out.println("\nMotor: ");
                read.skip("\\R?");
                var motor = read.nextFloat();

                System.out.println("\ntração: ");
                read.skip("\\R?");
                var tracao = read.nextLine();

                System.out.println("\nCombustivel: ");
                read.skip("\\R?");
                var status = read.nextInt();
                veiculoController.cadastrar(new Carro(
                        veiculoController.newId(),
                        placa,
                        cor,
                        modelo,
                        valor,
                        ano,
                        motor,
                        tracao,
                        status) {});

            }
            case 2->
            {

                System.out.println("\nPlaca: ");
                read.skip("\\R?");
                var placaM = read.nextLine();

                System.out.println("\nCor: ");
                read.skip("\\R?");
                var corM = read.nextLine();

                System.out.println("\nModelo: ");
                read.skip("\\R?");
                var modeloM = read.nextLine();

                System.out.println("\nValor: ");
                read.skip("\\R?");
                var valorM = read.nextFloat();

                System.out.println("\nAno: ");
                read.skip("\\R?");
                var anoM = read.nextInt();

                System.out.println("\nQuantos Capacetes tem disponivel: ");
                read.skip("\\R?");
                var capacete = read.nextInt();

                System.out.println("\ntração: ");
                read.skip("\\R?");
                var cilindrada = read.nextLine();

                System.out.println("\nCombustivel: ");
                read.skip("\\R?");
                var status = read.nextInt();
                veiculoController.cadastrar(new Moto(
                        veiculoController.newId(),
                        placaM,
                        corM,
                        modeloM,
                        valorM,
                        anoM,
                        capacete,
                        cilindrada,
                        status) {});
            }
        }


        int result ;
        System.out.println("\n9 - voltar ao menu Principal: ");
        System.out.println("\n10 - Novo Cadastro: ");
        System.out.println("\n 11 - Sair");
        read.skip("\\R?");
        result  = read.nextInt();
        switch (result)
        {
            case 9 -> { menuPrincipal();}
            case 10 -> {cadastrarVeiculo();}
            case 11 -> {System.exit(0);}
        }




    }
    public static void listar()
    {
        veiculoController.listarVeiculos();
        System.out.println(Cores.TEXT_BLUE+"DIGITE O NÚMERODA OPÇÃO DESEJADA!");
        int result ;
        System.out.println("\n1 - Voltar ao menu Principal: ");
        System.out.println("\n2 - Locar veiculo: ");
        System.out.println("\n 3 - Sair");
        read.skip("\\R?");
        result  = read.nextInt();
        switch (result)
        {
            case 1 -> { menuPrincipal();}
            case 2 -> {locar();}
            case 3 -> {System.exit(0);}
        }

    }
    public static void locar()
    {
        veiculoController.listarVeiculosModelo();

        System.out.println("DIGITE O NÚMERO DA OPÇÃO DESEJADA!");
        read.skip("\\R?");
        var id  = read.nextInt();

        System.out.println("\nQuantidades de Diárias: ");
        read.skip("\\R?");
        var diaria  = read.nextInt();

        System.out.println("\nData Checkin: ");
        read.skip("\\R?");
        var saida  = read.nextLine();

        System.out.println("\nData Checkout: ");
        read.skip("\\R?");
        var entrega  = read.nextLine();

        veiculoController.locar(id,diaria,saida,entrega);
    }

}