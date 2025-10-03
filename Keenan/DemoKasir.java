public class DemoKasir {

    public static void main(String[] args) {
        Produk p1 = new Produk("PRD001", "Nasi Goreng", 15000.0);
        Produk p2 = new Produk("PRD002", "Es Teh Manis", 5000.0);
        Produk p3 = new Produk("PRD003", "Ayam Geprek", 18000.0);
        
        System.out.println("Produk Tersedia:");
        System.out.println("- " + p1.getNamaProduk() + " (Rp" + p1.getHarga() + ")");
        System.out.println("- " + p2.getNamaProduk() + " (Rp" + p2.getHarga() + ")");
        System.out.println("- " + p3.getNamaProduk() + " (Rp" + p3.getHarga() + ")");
        System.out.println("======================================");

        Transaksi t1 = new Transaksi("2025-10-26 12:30");
        
        t1.tambahItem(p1, 2); 
            t1.tambahItem(p2, 3);
        t1.tampilNota();
    }
}