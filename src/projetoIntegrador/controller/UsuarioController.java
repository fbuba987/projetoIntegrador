package projetoIntegrador.controller;

import projetoIntegrador.model.Usuario;

import java.util.ArrayList;

public class UsuarioController {
    public Usuario user;

    private ArrayList<Usuario>listUser=new ArrayList<Usuario>();

    public boolean adicionarUsuario( String nome, String username, String senha)
    {
        user = new Usuario(newIdUser(),nome,username,senha);
        if (listUser.add(user)==true)
        {
            System.out.println("Usuario Cadastrado!");
            return  true;
        }
        return false;

    }
    public boolean validarUsuario(String username, String passeword)
    {
        boolean result = false;


        for (var use : listUser )
        {
            if (use.getUsername().equalsIgnoreCase(username) && use.getSenha().equalsIgnoreCase(passeword))
            {
                result = true;

            }
            else
            {
                result = false;
            }

        }

        return result;

    }
    public int newIdUser()
    {
        return listUser.size()+1;
    }

}
