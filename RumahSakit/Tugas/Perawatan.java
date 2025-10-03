package RumahSakit.Tugas;
import java.time.LocalDate;
public class Perawatan {
    private LocalDate tanggal;
    private String diagnosis;
    private Dokter dokter;
    private Pasien pasien;

    public LocalDate getTanggal() {
        return tanggal;
    }
    
    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
    
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Dokter getDokter() {
        return dokter;
    }
    
    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    public Pasien getPasien() {
        return pasien;
    }
    
    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public String getInfo() {
        String info = "";
        info += "\tTanggal: " + tanggal;
        info += ", Diagnosis: " + diagnosis;
        info += ", Dokter: " + dokter.getInfo();
        info += ", Pasien: " + pasien.getNama();
        info += "\n";

        return info;
    }
}
