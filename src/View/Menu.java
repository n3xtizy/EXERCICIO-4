package View;

import Controllers.ClienteController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    static BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
    static ClienteController cliente = new ClienteController();
    static ClienteView clienteView = new ClienteView();

    public static void main(String[] args) throws IOException {

        String option = "";

        do {
            System.out.println("|-----------------------------------------|");
            System.out.println("|             1 - Listar                  |");
            System.out.println("|             2 - Cadastrar               |");
            System.out.println("|             3 - Selecionar              |");
            System.out.println("|             4 - Sair                    |");
            System.out.println("|-----------------------------------------|");

            option = obj.readLine();
            System.out.println("\n");

            switch (option.toUpperCase()) {
                case "1":
                    cliente.listClients();
                    break;

                case "2":
                    clienteView.inserirCliente();
                    break;

                case "3":
                    clienteView.selecionarCliente();
                    break;

                case "4":
                    break;

                default:
                    System.out.println("Opção invalida");
                    break;
            }
        } while (!option.toUpperCase().equals("4"));
    }
}
