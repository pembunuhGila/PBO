package UTS;

// Pewarisan dari Hewan
public class Kucing extends Hewan {
    private boolean sudahSteril;

    public Kucing(String idHewan, String nama, int usiaTahun, Pemilik pemilik, boolean sudahSteril) {
        super(idHewan, nama, "Kucing", usiaTahun, pemilik);
        this.sudahSteril = sudahSteril;
    }

    // Enkapsulasi
    public boolean isSudahSteril() { 
        return sudahSteril; 
    }
    
    public void setSudahSteril(boolean sudahSteril) { 
        this.sudahSteril = sudahSteril; 
    }

    @Override
    public String getSuara() {
        return "Meong!";
    }

    // Method Overriding (Menambahkan biaya khusus Kucing)
    @Override
    public double hitungBiayaPerawatanTambahan(double biayaAwal) {
        return biayaAwal + 25000.0;
    }
}
