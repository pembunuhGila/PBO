package RumahSakit.Tugas;

public class Dokter {
    private String idDokter;
    private String nama;

    public Dokter(String idDokter, String nama) {
        this.idDokter = idDokter;
        this.nama = nama;
    }

    public String getIdDokter() {
        return idDokter;
    }

    public void setIdDokter(String idDokter) {
        this.idDokter = idDokter;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getInfo() {
        return nama + " (" + idDokter + ")";
    }
}
