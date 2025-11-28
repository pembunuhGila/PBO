package Kuis2PBO;

public abstract class HewanPeliharaan {
    private String nama;
    private int energi;

    public HewanPeliharaan(String nama, int energiAwal) {
        this.nama = nama;
        this.energi = energiAwal;
    }

    public void makan() {
        energi += 10;
        System.out.println(nama + " sedang makan. Energi bertambah menjadi " + energi);
    }

    public abstract void bergerak();

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getEnergi() {
        return energi;
    }

    public void setEnergi(int energi) {
        this.energi = energi;
    }
}
