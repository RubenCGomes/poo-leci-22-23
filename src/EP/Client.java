package EP;

import java.util.Objects;

public class Client {
    ClientType clientType; String name; int nif;

    public Client(int nif, String name, ClientType clientType) {
        this.clientType = clientType;
        this.name = name;
        this.nif = nif;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return nif == client.nif && clientType == client.clientType && Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientType, name, nif);
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientType=" + clientType +
                ", name='" + name + '\'' +
                ", nif=" + nif +
                '}';
    }
}
