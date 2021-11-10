package DAO;

import Models.Cliente;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    static String local = "C:/Users/Gabriel Martins/Desktop/provafaculdade/src/clientes.json";
    Gson gson = new Gson();

    public List<Cliente> listarClients() {
        List<Cliente> clients = new ArrayList<Cliente>();
        try {
            String json = String.join(" ", Files.readAllLines(Paths.get(local), StandardCharsets.UTF_8));
            Type listType = new TypeToken<ArrayList<Cliente>>() {}.getType();
            clients = new Gson().fromJson(json, listType);

        } catch (Exception e) {
        }
        finally {
            return clients;
        }
    }

    public void cadastraCliente(String idCli, String nmCli) {
        try {
            var cli = new Cliente();
            var clients = listarClients();
            cli.setIdCliente(Long.valueOf(idCli));
            cli.setNmCliente(nmCli);
            if (clients == null)
                clients = new ArrayList<Cliente>();

            clients.add(cli);

            String itemSerialize = gson.toJson(clients);
            writeJson(local, itemSerialize);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeJson (String path, String itemSerialize) {
        try {
            FileWriter writer = new FileWriter(path);
            writer.write(itemSerialize);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
