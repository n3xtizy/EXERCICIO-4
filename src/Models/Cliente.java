package Models;

import java.util.*;

public class Cliente {
    public long idCliente;
    public String nmCliente;

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNmCliente() {
        return nmCliente;
    }

    public void setNmCliente(String nmCliente) {
        this.nmCliente = nmCliente;
    }

    public Cliente() {
    }

    public Cliente(long idCliente, String nmCliente) {
        this.idCliente = idCliente;
        this.nmCliente = nmCliente;
    }
}
