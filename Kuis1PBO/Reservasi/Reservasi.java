import java.util.ArrayList;

public class Reservasi {
    private String tanggal;
    private int durasi;
    private Ruangan ruangan; // composition
    private ArrayList<Mahasiswa> daftarMahasiswa; // aggregation

    public Reservasi(String tanggal, int durasi, Ruangan ruangan) {
        this.tanggal = tanggal;
        this.durasi = durasi;
        this.ruangan = ruangan;
        this.daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    public void tampilReservasi() {
        System.out.println("=== Data Reservasi Ruangan ===");
        System.out.println("Tanggal : " + tanggal);
        System.out.println("Durasi  : " + durasi + " jam");
        System.out.println("Ruangan : " + ruangan.getNamaRuangan() + " (" + ruangan.getKodeRuangan() + ")");
        System.out.println("Status  : " + ruangan.getStatus());
        System.out.println("-- Daftar Mahasiswa --");
        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println(m.getNim() + " - " + m.getNama());
        }
    }
}
