package projetoIntegrador;

import projetoIntegrador.model.Usuario;

public class TestaPrograma {
    public static Usuario user;
    public static void main(String[] args) {

    }

    public static void adicionarUsuario(long in_user, String nome, String username, String senha, int tipo)
    {
        user = new Usuario(in_user,nome,username,senha,tipo);
        user.adicionar(user);

    }
    public static void validarUsuario()
    {

        var result =  user.validar("jonpontes","2436");
        System.out.println(result);

    }
}
