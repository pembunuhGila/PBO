

public class Praktikum1 {
    public static void main(String[] args) {
        String merk1 = "Toyota"; String warna1 = "Hitam"; int kecepatan1 = 60;
        String merk2 = "Honda";  String warna2 = "Merah"; int kecepatan2 = 80;
        String merk3 = "Suzuki"; String warna3 = "Biru";  int kecepatan3 = 50;
        String merk4 = "Mitsubishi"; String warna4 = "Putih"; int kecepatan4 = 70;
        String merk5 = "BMW"; String warna5 = "Silver"; int kecepatan5 = 100;
        String merk6 = "Mercedes"; String warna6 = "Abu"; int kecepatan6 = 90;
        String merk7 = "Nissan"; String warna7 = "Hijau"; int kecepatan7 = 65;
        String merk8 = "Ford"; String warna8 = "Orange"; int kecepatan8 = 75;
        String merk9 = "Chevrolet"; String warna9 = "Coklat"; int kecepatan9 = 85;
        String merk10 = "Tesla"; String warna10 = "Putih"; int kecepatan10 = 120;

        jalan(merk1, kecepatan1);
        berhenti(merk2);
        jalan(merk3, kecepatan3);
        berhenti(merk4);
        jalan(merk5, kecepatan5);
        berhenti(merk6);
        jalan(merk7, kecepatan7);
        berhenti(merk8);
        jalan(merk9, kecepatan9);
        berhenti(merk10);
    }

    static void jalan(String merk, int kecepatan) {
        System.out.println("Mobil " + merk + " sedang berjalan dengan kecepatan " + kecepatan + " km/jam.");
    }

    static void berhenti(String merk) {
        System.out.println("Mobil " + merk + " berhenti.");
    }
}
