package Kasir;

public class ItemTransaksi {
    private Produk produk;
    private int jumlah;

    public ItemTransaksi(Produk produk, int jumlah) {
        this.produk = produk;
        this.jumlah = jumlah;
    }

    public double getSubtotal() {
        return produk.getHarga() * jumlah;
    }

    public Produk getProduk() { 
        return produk; 
    }
    
    public int getJumlah() { 
        return jumlah; 
    }
}
