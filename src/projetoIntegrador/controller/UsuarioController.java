package projetoIntegrador.controller;

import projetoIntegrador.model.Usuario;

public class UsuarioController {
    public Usuario user;

    public void adicionarUsuario(long in_user, String nome, String username, String senha)
    {
        user = new Usuario(in_user,nome,username,senha);
        user.adicionar(user);

    }
    public boolean validarUsuario(String usename, String passeword)
    {

        var result =  user.validar(usename,passeword);
        return result;

    }

}
