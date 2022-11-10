package projetoIntegrador.controller;

import projetoIntegrador.model.Veiculo;
import projetoIntegrador.repository.VeiculoRepository;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VeiculoController implements VeiculoRepository {
    ArrayList<Veiculo> listVeiculos = new ArrayList<Veiculo>();

    @Override
    public void listarVeiculos() {

        for (var veiculo : listVeiculos)
        {
            veiculo.listar();
        }

    }
    public void listarVeiculosModelo() {

        for (var veiculo : listVeiculos)
        {
            System.out.println("---------------------------------------------------------------------------");
            System.out.println(veiculo.getId()+" - Modelo: "+veiculo.getModelo()+" , Valor Diária:"+veiculo.getValor()+" , Status: "+veiculo.getStatusliteral());
            System.out.println("---------------------------------------------------------------------------");

        }

    }

    @Override
    public void cadastrar(Veiculo veiculo) {
        var result = listVeiculos.add(veiculo);
        if(result == true)
            System.out.println("Veiculo cadastrado com cucesso!");

    }

    @Override
    public void deletar(Veiculo veiculo) {
        var result = listVeiculos.remove(veiculo);
        if(result == true)
            System.out.println("Veiculo excluido com sucesso!");

    }

    @Override
    public void pesquisar(String modelo) {
        for (var veiculo : listVeiculos)
        {
            if (veiculo.getModelo().equalsIgnoreCase(modelo) == true)
            {
                veiculo.listar();
            }
        }
    }
    public void locar(int id,float diaria,String checkin, String checkout) {
        for (var veiculo : listVeiculos)
        {
            if (veiculo.getId() == id)
            {
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("Modelo : "+veiculo.getModelo()+"\n Valor Diária: "+diaria+"\n Data de Saída : "+checkin+"\n Data de Entrega : "+checkout);
                System.out.println("---------------------------------------------------------------------------");

                try {

                    //indica onde deve ser criado o arquivo
                    FileWriter fw = new FileWriter("src/projetoIntegrador/util/notaLocacao.txt");
                    //escreve no arquivo
                    PrintWriter pw = new PrintWriter(fw);
                    //pega o valor da variavel e escreve no arquivo ps: se não usa o println será sempre sobrescrito o memo arquivo
                    pw.print("                                         NOTA FISCAL                                     ");
                    pw.print("\n");
                    pw.print("\n");
                    pw.print("\n");
                    pw.print("Modelo : "+veiculo.getModelo()+"\n Valor Diária: "+diaria+"\n Data de Saída : "+checkin+"\n Data de Entrega : "+checkout);
                    pw.close();

                }   catch (IOException ex) {
                    Logger.getLogger("LocaçãoClasse").log(Level.SEVERE, null, ex);
                }
                veiculo.setStatus(1);
                listVeiculos.set(listVeiculos.indexOf(veiculo),veiculo);
                listarVeiculosModelo();


            }
        }
    }

    public int newId()
    {
        return listVeiculos.size() + 1;
    }
}
