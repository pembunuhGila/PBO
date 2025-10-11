package Jobsheet7;

public class Main {
    public static void main(String[] args) {
        // Instansiasi objek child class dengan constructor berparameter
        Kucing kucing1 = new Kucing("Miko", 2, "Mamalia", "Persia");
        kucing1.tampilkanInfo();

        System.out.println("\n--- Objek Kedua (tanpa parameter) ---");
        // Instansiasi objek child class dengan constructor tanpa parameter
        Kucing kucing2 = new Kucing();
        kucing2.tampilkanInfo();
    }
}
