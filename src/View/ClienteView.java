package View;

import Controllers.ClienteController;
import Models.Cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Locale;

public class ClienteView {
    static BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
    static ClienteController cliente = new ClienteController();

    public static void inserirCliente() throws IOException {

        System.out.println("ID do Cliente");
        String id = obj.readLine();
        System.out.println("\n");

        System.out.println("Nome do Cliente");
        String nome= obj.readLine();
        System.out.println("\n");

        cliente.cadastrarCliente(id, nome);
    }

    public static void selecionarCliente() throws IOException {

        System.out.println("ID do Cliente");
        String id = obj.readLine();
        System.out.println("\n");

        Cliente usuario = cliente.buscaCliente(Integer.valueOf(id));

        if (usuario.getIdCliente() != 0) {
            System.out.println("ID: " + usuario.getIdCliente());
            System.out.println("Nome: " + usuario.getNmCliente());
            System.out.println("\n");
        }
    }
}
