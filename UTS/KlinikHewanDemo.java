package UTS;

public class KlinikHewanDemo {
    public static void main(String[] args) {
        System.out.println("=== Sistem Klinik Hewan Demo ===");
        Pemilik p1 = new Pemilik("P001", "Budi Santoso", "08123456789");
        Pemilik p2 = new Pemilik("P002", "Siti Aisyah", "08567890123");
        
        Kucing k1 = new Kucing("H001", "Sugeng", 3, p1, true); 
        Anjing a1 = new Anjing("H002", "Ninu", 5, p2, "Golden Retriever"); 

        KartuPerawatan kp1 = new KartuPerawatan("K001", k1, 4.0, false, "R01"); 
        KartuPerawatan kp2 = new KartuPerawatan("K002", a1, 25.0, true, "R02"); 

        System.out.println("\n--- Rincian Perawatan 1 ---");
        kp1.cetakRincian(); 
        System.out.println("\n--- Rincian Perawatan 2 ---");
        kp2.cetakRincian();
        System.out.println("\n=== Demonstrasi Konsep ===");
        
        // a. Demonstrasi Access Modifier/Enkapsulasi (menggunakan setter)
        System.out.println("Nama Pemilik awal: " + p1.getNama());
        p1.setNama("Budi Setiawan");
        System.out.println("Nama Pemilik baru (Enkapsulasi): " + p1.getNama());
        // b. Demonstrasi Method Overloading (Hewan)
        double biayaTanpaVaksin = k1.hitungBiayaPerawatan(4.0); // Overloading #1
        double biayaDenganVaksin = k1.hitungBiayaPerawatan(4.0, true); // Overloading #2
        System.out.printf("Biaya Kucing Luna (4kg) - tanpa vaksin: Rp %,.0f%n", biayaTanpaVaksin);
        System.out.printf("Biaya Kucing Luna (4kg) - dengan vaksin: Rp %,.0f%n", biayaDenganVaksin);
        // c. Demonstrasi Method Overriding (Kucing/Anjing)
        System.out.printf("Total Biaya Kucing Luna (Overriding Kucing): Rp %,.0f%n", kp1.hitungTotalBiaya());
        System.out.printf("Total Biaya Anjing Max (Overriding Anjing): Rp %,.0f%n", kp2.hitungTotalBiaya());
    }
}
