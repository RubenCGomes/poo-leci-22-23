package aula08.ex01.classes;

import java.util.HashMap;
import java.util.Map;

public class EmpresaViaturas {
    String name; String codPos; String email;  Map<String, Veiculo> veiculos = new HashMap<>();

    public EmpresaViaturas(String name, String codPos, String email) {
        this.name = name;
        this.codPos = codPos;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodPos() {
        return codPos;
    }

    public void setCodPos(String codPos) {
        this.codPos = codPos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.matches("^[a-zA-Z_0-9]+@[a-zA-Z]+\\.+[a-zA-Z]+$"))
            this.email = email;
    }

    public Map<String, Veiculo> getVeiculos() {
        return veiculos;
    }

    public void addVeiculo(String matricula, Veiculo veiculo){
        veiculos.put(matricula, veiculo);
    }

    public void removeVeiculo(String matricula){
        veiculos.remove(matricula);
    }
}
