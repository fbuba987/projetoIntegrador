package projetoIntegrador.model;

import java.util.Date;

public class Usuario {

   private long in_user;
   private String nome;
   private String username;
   private String senha;
   private int tipo;

    public Usuario(long in_user, String nome, String username, String senha, int tipo) {
        this.in_user = in_user;
        this.nome = nome;
        this.username = username;
        this.senha = senha;
        this.tipo = tipo;


    }

        public void listar(){}
        public void adicionar(){}
        public void deletar(){}
}
