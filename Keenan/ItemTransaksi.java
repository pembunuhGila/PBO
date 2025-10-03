public class ItemTransaksi {
    private Produk produk;
    private int jumlah;
    private double subTotal;

    public ItemTransaksi(Produk produk, int jumlah) {
        this.produk = produk; 
        this.jumlah = jumlah;
        this.subTotal = produk.getHarga() * jumlah; 
    }

    public Produk getProduk() { return produk; }
    public int getJumlah() { return jumlah; }
    public double getSubTotal() { return subTotal; }
}