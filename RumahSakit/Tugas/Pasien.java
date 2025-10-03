package RumahSakit.Tugas;
import java.util.ArrayList;
import java.time.LocalDate;
public class Pasien {
    private String idPasien;
    private String nama;
    private ArrayList<Perawatan> riwayatPerawatan;

    public String getIdPasien() {
        return idPasien;
    }

    public void setIdPasien(String idPasien) {
        this.idPasien = idPasien;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Pasien(String idPasien, String nama) {
        this.idPasien = idPasien;
        this.nama = nama;
        this.riwayatPerawatan = new ArrayList<Perawatan>();
    }

    public void tambahPerawatan(LocalDate tanggal, String diagnosis, Dokter dokter) {
        Perawatan perawatan = new Perawatan();   
        perawatan.setTanggal(tanggal);
        perawatan.setDiagnosis(diagnosis);
        perawatan.setDokter(dokter);
        perawatan.setPasien(this);  

        riwayatPerawatan.add(perawatan);
    }

    public String getInfo() {
        String info = "";
        info += "ID Pasien          : " + this.idPasien + "\n";
        info += "Nama               : " + this.nama + "\n";
        
        if (!riwayatPerawatan.isEmpty()) {
            info += "Riwayat Konsultasi :\n";

            for (Perawatan perawatan : riwayatPerawatan) {
                info += perawatan.getInfo();
            }
        }
        else {
            info += "Belum ada riwayat perawatan";
        }

        info += "\n";

        return info;
    }
}