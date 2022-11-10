package projetoIntegrador.model;

import java.util.ArrayList;

public class Usuario {

   private int in_user;
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

    public Usuario(int in_user, String nome, String username, String senha) {
        this.in_user = in_user;
        this.nome = nome;
        this.username = username;
        this.senha = senha;


    }

    public long getIn_user() {
        return in_user;
    }

    public void setIn_user(int in_user) {
        this.in_user = in_user;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
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
        public ArrayList<Usuario> listar (){return  listUser;}
}
