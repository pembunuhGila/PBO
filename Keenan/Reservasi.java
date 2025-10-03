import java.util.ArrayList;

public class Reservasi {
    private String atributTanggal;
    private String atributDurasi;
    private Ruangan ruangan;
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public Reservasi(String atributTanggal, String atributDurasi, Ruangan ruangan) {
        this.atributTanggal = atributTanggal;
        this.atributDurasi = atributDurasi;
        this.ruangan = ruangan; 
        this.daftarMahasiswa = new ArrayList<>(); 

        if (ruangan != null) {
            ruangan.setStatus(false);
        }
    }

    public void setRuangan(Ruangan ruangan) { this.ruangan = ruangan; }

    public void tambahMahasiswa(Mahasiswa m) {
        this.daftarMahasiswa.add(m);
    }

    public void tampilReservasi() {
        System.out.println("--- Detail Reservasi ---");
        System.out.println("Tanggal: " + atributTanggal);
        System.out.println("Durasi: " + atributDurasi);
        
        System.out.println("Ruangan: " + ruangan.getKodeRuangan() + " (" + ruangan.getNamaRuangan() + ")");
        
        System.out.println("Status Ruangan setelah reservasi: " + (ruangan.isStatus() ? "Tersedia" : "Terpakai"));
        System.out.println("--- Daftar Mahasiswa (" + daftarMahasiswa.size() + " orang) ---");
        
        if (!daftarMahasiswa.isEmpty()) {
            for (Mahasiswa m : daftarMahasiswa) {
                System.out.println("- " + m.tampilData()); 
            }
        }
    }
}