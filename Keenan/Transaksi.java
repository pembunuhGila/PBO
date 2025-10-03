import java.util.ArrayList;

public class Transaksi {
    private String atributTanggal;
    private ArrayList<ItemTransaksi> daftarItem; 
    private double totalHarga;
    public Transaksi(String atributTanggal) {
        this.atributTanggal = atributTanggal;
        this.daftarItem = new ArrayList<>();
        this.totalHarga = 0.0;
    }

    public String getAtributTanggal() { return atributTanggal; }
    public void setAtributTanggal(String atributTanggal) { this.atributTanggal = atributTanggal; }
    public double getTotalHarga() { return totalHarga; }

    public void tambahItem(Produk p, int jumlah) {
        ItemTransaksi itemBaru = new ItemTransaksi(p, jumlah);
        
        this.daftarItem.add(itemBaru);
        
        this.hitungTotal(); 
    }

    public double hitungTotal() {
        this.totalHarga = 0.0;
        for (ItemTransaksi item : daftarItem) {
            this.totalHarga += item.getSubTotal();
        }
        return this.totalHarga;
    }

    public void tampilNota() {
        System.out.println("======================================");
        System.out.println("            NOTA PEMBELIAN            ");
        System.out.println("======================================");
        System.out.println("Tanggal Transaksi: " + atributTanggal);
        System.out.println("--------------------------------------");
        System.out.printf("%-15s %5s %10s %10s\n", "Produk", "Jml", "Harga", "Subtotal");
        System.out.println("--------------------------------------");
        
        for (ItemTransaksi item : daftarItem) {
            System.out.printf("%-15s %5d %10.0f %10.0f\n", 
                item.getProduk().getNamaProduk(),
                item.getJumlah(),
                item.getProduk().getHarga(),
                item.getSubTotal());
        }
        System.out.println("--------------------------------------");
        System.out.printf("%-31s %10.0f\n", "TOTAL HARGA:", this.totalHarga);
        System.out.println("======================================");
    }
}