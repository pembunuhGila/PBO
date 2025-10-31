package UTS;

public class KartuPerawatan {
    private String idKartu;
    private Hewan hewan; // Aggregation
    private RuangPerawatan ruang; // Composition
    private double beratHewanKg;
    private boolean denganVaksin;

    public KartuPerawatan(String idKartu, Hewan hewan, double beratHewanKg, boolean denganVaksin, String nomorRuang) {
        this.idKartu = idKartu;
        this.hewan = hewan;
        this.beratHewanKg = beratHewanKg;
        this.denganVaksin = denganVaksin;
        this.ruang = new RuangPerawatan(nomorRuang); 
        this.ruang.setTersedia(false); 
    }

    // Enkapsulasi
    public String getIdKartu() {  
        return idKartu;
    }

    public Hewan getHewan() { 
        return hewan; 
    }

    public RuangPerawatan getRuang() { 
        return ruang; 
    }

    public double getBeratHewanKg() { 
        return beratHewanKg; 
    }

    public boolean isDenganVaksin() { 
        return denganVaksin; 
    }

    public double hitungTotalBiaya() {
        // 1. Menggunakan Overloading (hitungBiayaPerawatan) dari Hewan
        double biayaAwal = hewan.hitungBiayaPerawatan(beratHewanKg, denganVaksin);
        // 2. Menggunakan Overriding (hitungBiayaPerawatanTambahan) dari Kucing/Anjing
        double biayaAkhir = hewan.hitungBiayaPerawatanTambahan(biayaAwal);
        return biayaAkhir;
    }

    public void cetakRincian() {
        System.out.println("\n--- Kartu Perawatan " + idKartu + " ---");
        System.out.println("Hewan: " + hewan.getNama() + " (" + hewan.getJenis() + ", Usia: " + hewan.getUsiaTahun() + ")");
        System.out.println("Pemilik: " + hewan.getPemilik().getNama());
        System.out.println("Berat: " + beratHewanKg + " kg");
        System.out.println("Vaksin: " + (denganVaksin ? "Ya" : "Tidak"));
        System.out.println("Alokasi: " + ruang.getNomorRuang());
        System.out.printf("Total Biaya: Rp %,.0f%n", hitungTotalBiaya());
        System.out.println("Suara: " + hewan.getSuara());
    }
}