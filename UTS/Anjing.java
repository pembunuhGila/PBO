package UTS;

public class Anjing extends Hewan {
    private String ras;

    public Anjing(String idHewan, String nama, int usiaTahun, Pemilik pemilik, String ras) {
        super(idHewan, nama, "Anjing", usiaTahun, pemilik);
        this.ras = ras;
    }

    // Enkapsulasi
    public String getRas() { 
        return ras; 
    }

    public void setRas(String ras) { 
        this.ras = ras; 
    }

    @Override
    public String getSuara() {
        return "Guk Guk!";
    }

    // Method Overriding (Menambahkan biaya khusus Anjing)
    @Override
    public double hitungBiayaPerawatanTambahan(double biayaAwal) {
        return biayaAwal + 35000.0;
    }
}
