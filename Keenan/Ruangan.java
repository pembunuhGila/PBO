public class Ruangan {
    private String kodeRuangan;
    private String namaRuangan;
    private int kapasitas;
    private boolean status;

    public Ruangan(String kodeRuangan, String namaRuangan, int kapasitas) {
        this.kodeRuangan = kodeRuangan;
        this.namaRuangan = namaRuangan;
        this.kapasitas = kapasitas;
        this.status = true; 
    }

    public String getKodeRuangan() { return kodeRuangan; }
    public void setKodeRuangan(String kodeRuangan) { this.kodeRuangan = kodeRuangan; }
    public String getNamaRuangan() { return namaRuangan; }
    public void setNamaRuangan(String namaRuangan) { this.namaRuangan = namaRuangan; }
    public int getKapasitas() { return kapasitas; }
    public void setKapasitas(int kapasitas) { this.kapasitas = kapasitas; }
    public boolean isStatus() { return status; }
    public void setStatus(boolean status) { this.status = status; }

    public String tampilData() {
        return kodeRuangan + " (" + namaRuangan + ") - Kapasitas: " + kapasitas + " Status: " + (status ? "Tersedia" : "Terpakai");
    }
}