package Controllers;

import DAO.ClienteDAO;
import Models.Cliente;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.List;

public class ClienteController {

    static BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
    static ClienteDAO clienteDAO = new ClienteDAO();

    public static void listClients() {
        System.out.println("-----------------------------------------------");
        List<Cliente> clients = clienteDAO.listarClients();

        if (clients != null) {
            for (Cliente id : clients) {
                System.out.println("ID: " + id.getIdCliente());
                System.out.println("Nome: " + id.getNmCliente());
                System.out.println("\n");
            }
        }
    }

    public static Cliente buscaCliente (int id) {
        System.out.println("-----------------------------------------------");
        List<Cliente> clients = clienteDAO.listarClients();
        var cliente = new Cliente();
        if (clients != null) {
            for (Cliente cli : clients) {
                if (cli.getIdCliente() == id) {
                    cliente = cli;
                }
            }
        }
        return cliente;
    }

    public static void cadastrarCliente(String id, String nome) {
        clienteDAO.cadastraCliente(id, nome);
    }
}
