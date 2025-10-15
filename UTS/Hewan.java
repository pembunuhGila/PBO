package UTS;

public abstract class Hewan {
    private String idHewan;
    private String nama;
    private String jenis;
    private int usiaTahun;
    private Pemilik pemilik; // Association

    public Hewan(String idHewan, String nama, String jenis, int usiaTahun, Pemilik pemilik) {
        this.idHewan = idHewan;
        this.nama = nama;
        this.jenis = jenis;
        this.usiaTahun = usiaTahun;
        this.pemilik = pemilik;
    }

    // Enkapsulasi (Getters & Setters)
    public String getIdHewan() { 
        return idHewan; 
    }

    public String getNama() { 
        return nama; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public String getJenis() { 
        return jenis; 
    }

    public int getUsiaTahun() { 
        return usiaTahun; 
    }

    public void setUsiaTahun(int usiaTahun) { 
        this.usiaTahun = usiaTahun; 
    }

    public Pemilik getPemilik() { 
        return pemilik; 
    }

    // Method Overloading (Untuk menghitung estimasi biaya pemeriksaan)
    public double hitungBiayaPerawatan(double berat) {
        return 50000.0 + (berat * 10000.0);
    }

    public double hitungBiayaPerawatan(double berat, boolean denganVaksin) {
        double biayaDasar = hitungBiayaPerawatan(berat);
        if (denganVaksin) {
            return biayaDasar + 150000.0;
        }
        return biayaDasar;
    }

    // Metode abstrak yang harus dioverride oleh kelas anak
    public abstract String getSuara();
    public abstract double hitungBiayaPerawatanTambahan(double biayaAwal); 
}