package EPexemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AgenciaTuristica {
    private String name; private String address;
    private List<Atividade> activities = new ArrayList<>();

    public AgenciaTuristica(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Atividade> getActivities() {
        return activities;
    }

    public void setActivities(List<Atividade> activities) {
        this.activities = activities;
    }

    public void add(Atividade atividade){
        activities.add(atividade);
    }

    public int totalItems(){
        return activities.size();
    }

    public List<Atividade> atividades(){
        return activities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AgenciaTuristica that = (AgenciaTuristica) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address) && Objects.equals(activities, that.activities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, activities);
    }

    @Override
    public String toString() {
        return "AgenciaTuristica{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", activities=" + activities +
                '}';
    }
}
