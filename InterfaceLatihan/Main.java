package InterfaceLatihan;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV("LED", 30, 5000000, "Hitam", "Samsung");
        Kipas kipas = new Kipas("Angin Duduk", 300000, "Putih", "Cosmos");
        Kulkas kulkas = new Kulkas(2, 2500000, "Silver", "LG");
        SmartFridge smartFridge = new SmartFridge(10, 3, 8000000, "Abu-Abu", "Panasonic");

        System.out.println(tv.getInfo());
        System.out.println(kipas.getInfo());
        System.out.println(kulkas.getInfo());
        System.out.println(smartFridge.getInfo());
    }
}
