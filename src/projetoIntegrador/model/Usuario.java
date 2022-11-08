package projetoIntegrador.model;

import java.util.ArrayList;

public class Usuario {

   private long in_user;
   private String nome;
   private String username;
   private String senha;


    public ArrayList<Usuario> getListUser() {
        return listUser;
    }

    public void setListUser(ArrayList<Usuario> listUser) {
        this.listUser = listUser;
    }

    private    ArrayList<Usuario> listUser = new ArrayList<Usuario>();

    public Usuario(long in_user, String nome, String username, String senha) {
        this.in_user = in_user;
        this.nome = nome;
        this.username = username;
        this.senha = senha;


    }

        public void adicionar(Usuario user){
            String result = "";
            if (user != null)
            {
                listUser.add(user);
                result = "Usuário adicionado com sucesso";
            }
            else
            {
                result = "Nenhum Usuario adicionado!";
            }
            System.out.println(result);

        }
        public boolean validar(String username2, String password){
        boolean validador = false;
            for (Usuario use : getListUser() )
            {
                if (use.username == username2 && use.senha == password)
                {
                    validador = true;
                }

            }
            return validador;


        }
}
