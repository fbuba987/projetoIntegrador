package projetoIntegrador.model;

import projetoIntegrador.util.Cores;

public abstract class Veiculo {

    private  int id;
    private String placa;
    private String cor;
    private String modelo;
    private float valor;
    private int ano;
    private int status;

    public Veiculo(int id, String placa, String cor, String modelo, float valor, int ano, int status) {
        this.id = id;
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
        this.valor = valor;
        this.ano = ano;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getStatus() {
        return status;
    }
    public String getStatusliteral() {
        if(getStatus() == 0)
        {
            return Cores.TEXT_GREEN+"Disponivel"+Cores.TEXT_RESET;
        }
        else
        {
            return Cores.TEXT_RED+"Idisponivel"+Cores.TEXT_RESET;
        }
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void listar(){
        System.out.println(Cores.TEXT_BLUE_BOLD_BRIGHT+getId()+Cores.TEXT_RESET);
        System.out.println(Cores.TEXT_YELLOW+"Placa: "+Cores.TEXT_RESET+getPlaca());
        System.out.println(Cores.TEXT_YELLOW+"Modelo: "+Cores.TEXT_RESET+getModelo());
        System.out.println(Cores.TEXT_YELLOW+"Ano: "+Cores.TEXT_RESET+getAno());
        System.out.println(Cores.TEXT_YELLOW+"Cor: "+Cores.TEXT_RESET+getCor());
        if (getStatus() == 0)
            System.out.println(Cores.TEXT_YELLOW+"Status:"+Cores.TEXT_RESET+ getStatusliteral());
        else
            System.out.println(Cores.TEXT_YELLOW+"Status: "+Cores.TEXT_RESET+getStatusliteral());

    }


}


