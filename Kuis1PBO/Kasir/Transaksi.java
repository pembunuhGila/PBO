package Kasir;

import java.util.ArrayList;

public class Transaksi {
    private String tanggal;
    private ArrayList<ItemTransaksi> daftarItem;
    private double total;

    public Transaksi(String tanggal) {
        this.tanggal = tanggal;
        this.daftarItem = new ArrayList<>();
    }

    public void tambahItem(Produk p, int jumlah) {
        daftarItem.add(new ItemTransaksi(p, jumlah));
    }

    public void hitungTotal() {
        total = 0;
        for (ItemTransaksi item : daftarItem) {
            total += item.getSubtotal();
        }
    }

    public void tampilNota() {
        System.out.println("=== Nota Transaksi ===");
        System.out.println("Tanggal : " + tanggal);
        System.out.println("----------------------");
        for (ItemTransaksi item : daftarItem) {
            System.out.println(item.getProduk().getNamaProduk() + " x " + item.getJumlah() +
                               " = Rp " + item.getSubtotal());
        }
        System.out.println("----------------------");
        System.out.println("Total : Rp " + total);
    }
}
