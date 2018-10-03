package view;

import com.sun.security.ntlm.Client;

import controller.ClienteJpaDAO;
import controller.VendasJpaDAO;
import model.Cliente;
import model.Vendas;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Cliente cliente = new Cliente();
       Vendas venda = new Vendas();
       
       
       cliente.setId_cliente(1);
       cliente.setNome("Luis");
       cliente.setCpf("44974238833");
       cliente.setRg("373176855");
       
       venda.setCli(cliente);
       venda.setProduto("Computador");
       venda.setValor("250,60");
       
       ClienteJpaDAO.getInstance().merge(cliente);
       VendasJpaDAO.getInstance().merge(venda);
       System.out.println("Objeto salvo com s-u-c-e-s-s-o!");
    }
}
