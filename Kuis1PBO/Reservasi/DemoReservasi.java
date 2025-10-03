public class DemoReservasi {
    public static void main(String[] args) {
        Ruangan r = new Ruangan("LAB01", "Lab Komputer", 40, "Tersedia");
        Reservasi reservasi = new Reservasi("2025-09-30", 2, r);

        Mahasiswa m1 = new Mahasiswa("222222222", "Zaki");
        Mahasiswa m2 = new Mahasiswa("111111111", "Maikel");

        reservasi.tambahMahasiswa(m1);
        reservasi.tambahMahasiswa(m2);

        reservasi.tampilReservasi();
    }
}
