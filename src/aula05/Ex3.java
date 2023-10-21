package aula05;

public class Ex3 {
    public static void main(String[] args) {
        RealEstate imobiliaria = new RealEstate();
        imobiliaria.newProperty("Glória", 2, 30000);
        imobiliaria.newProperty("Vera Cruz", 1, 25000);
        imobiliaria.newProperty("Santa Joana", 3, 32000);
        imobiliaria.newProperty("Aradas", 2, 24000);
        imobiliaria.newProperty("São Bernardo", 2, 20000);

        imobiliaria.sell(1001);
        imobiliaria.setAuction(1002, new DateYMD(21, 3, 2023), 4);
        imobiliaria.setAuction(1003, new DateYMD(1, 4, 2023), 3);
        imobiliaria.setAuction(1001, new DateYMD(1, 4, 2023), 4);
        imobiliaria.setAuction(1010, new DateYMD(1, 4, 2023), 4);

        System.out.println(imobiliaria);

    }
}

class Property{
    private final int id;
    private final String location;
    private final int nRooms;
    private final int price;
    private boolean available;
    private DateYMD aucStart = null;
    private DateYMD aucEnd = null;

    public Property(int id, String location, int nRooms, int price){
        this.id = id; this.location = location; this.nRooms = nRooms; this.price = price; this.available = true;
    }

    public boolean isAvailable(){return available;}

    public int getId(){return id;}

    public void addAuction(DateYMD start, DateYMD end){
        this.aucStart = start;
        this.aucEnd = end;
    }

    public void setAvailable(boolean available){this.available = available;}

    public String toString(){
        return "Imóvel: " + id + "; quartos: " + nRooms + "; localidade: " + location + "; preço: " + price + "; disponível: " + (available ? "sim" : "não") + (aucStart != null ? "; leilão " + aucStart + " : " + aucEnd : "");
    }

}

class RealEstate {
    private final Property[] properties;
    private int propertyId;

    public RealEstate() {
        this.properties = new Property[10];
        this.propertyId = 1000;
    }

    public void newProperty(String location, int nRooms, int price){
        Property cycleProperty = new Property(++propertyId, location, nRooms, price);
        for (int i = 0; i < properties.length; i++) {
            if (properties[i] == null) {properties[i] = cycleProperty; break;}
        }
    }

    public void sell(int id){
        for (int i = 0; i < properties.length; i++) {
            if (properties[i] == null) {System.out.println("Imóvel " + id + " não existe"); break;}
            else if (properties[i].getId() == id) {
                if (properties[i].isAvailable()) {
                    System.out.println("Imóvel " + id + " vendido");
                    properties[i].setAvailable(false);
                    return;
                }
                else {
                    System.out.println("Imóvel " + id + " não está disponível.");
                    return;
                }
            }
        }
    }

    public void setAuction(int id, DateYMD date, int duration){
        for (int i = 0; i < properties.length; i++) {
            if (properties[i] == null) {
                System.out.println("Imóvel " + id + " não existe");
                return;
            }
            else if (properties[i].getId() == id) {
                if (properties[i].isAvailable()){
                    DateYMD end = new DateYMD(date.getDate()[0], date.getDate()[1], date.getDate()[2]);
                    for (int j = 0; j < duration; j++) {end.increment();}
                    properties[i].addAuction(date, end);
                    break;
                }
                else {
                    System.out.println("Imóvel " + id + " não está disponível.");
                    return;
                }
            }
        }
    }

    public String toString(){
        String str = "Propriedades:\n";
        for (int i = 0; i < properties.length; i++) {
            if (properties[i] != null) str += properties[i] + "\n";
        }
        return str;
    }
}
