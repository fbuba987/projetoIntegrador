package projetoIntegrador.model;

public abstract class Veiculo {

    private  int id;
     private float valor;


    public void setValor(float valor) {
        this.valor = valor;
    }

    private String placa;
    private String cor;
    String modelo;
    private int ano;
    private String combustivel;

    public Veiculo(int id, String placa, String cor, String modelo, int ano, String combustivel) {
        this.id = id;
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
        this.combustivel = combustivel;
        this.valor = valor;
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

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void visualizar(){
        String id = "";

        switch (this.id){
            case 1:
                id = "Carro";
                break;

            case 2:
                id = "Moto";
                break;
        }
        //testando
        System.out.println("********************************* teste *********************");
        System.out.println("Veiculos à alugar");
        System.out.println("ID: " + id);
        System.out.println("Placa: " + this.placa);
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Combustivel: " + this.combustivel);


    }

}


