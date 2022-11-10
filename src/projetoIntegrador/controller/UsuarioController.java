package projetoIntegrador.controller;

import projetoIntegrador.model.Usuario;

import java.util.ArrayList;

public class UsuarioController {
    public Usuario user;

    private ArrayList<Usuario>listUser=new ArrayList<Usuario>();

    public boolean adicionarUsuario( String nome, String username, String senha,int tipo)
    {
        user = new Usuario(newIdUser(),nome,username,senha,tipo);
        if (listUser.add(user)==true)
        {
            System.out.println("Usuario Cadastrado!");
            return  true;
        }
        return false;

    }
    public Usuario validarUsuario(String username, String passeword)
    {
        Usuario result = null;


        for (var use : listUser )
        {
            if (use.getUsername().equalsIgnoreCase(username) && use.getSenha().equalsIgnoreCase(passeword))
            {
                result = use;

            }
            else
            {
                result = null;
            }

        }

        return result;

    }
    public int newIdUser()
    {
        return listUser.size()+1;
    }

}
