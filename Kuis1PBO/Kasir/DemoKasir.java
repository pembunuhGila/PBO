package Kasir;

public class DemoKasir {
    public static void main(String[] args) {
        Produk p1 = new Produk("M01", "Nasi Goreng", 15000);
        Produk p2 = new Produk("M02", "Es Teh", 5000);
        Produk p3 = new Produk("M03", "Ayam Bakar", 20000);

        Transaksi trx = new Transaksi("2025-09-26");
        trx.tambahItem(p1, 2);
        trx.tambahItem(p2, 3);
        trx.tambahItem(p3, 1);

        trx.hitungTotal();
        trx.tampilNota();
    }
}
