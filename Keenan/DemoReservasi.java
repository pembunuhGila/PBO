public class DemoReservasi {

    public static void main(String[] args) {
        Ruangan labRPL = new Ruangan("LAB03", "Lab Rekayasa Perangkat Lunak", 40);
        System.out.println("Status Awal Ruangan:");
        System.out.println(labRPL.tampilData()); 
        System.out.println("=====================================");

        Mahasiswa mhs1 = new Mahasiswa("2341720001", "Jeki");
        Mahasiswa mhs2 = new Mahasiswa("2341720002", "Budi");
        Mahasiswa mhs3 = new Mahasiswa("2341720003", "Suki");
        
        Reservasi reservasiProyek = new Reservasi("2025-01-10", "3 Jam", labRPL);
        
        reservasiProyek.tambahMahasiswa(mhs1);
        reservasiProyek.tambahMahasiswa(mhs2);
        reservasiProyek.tambahMahasiswa(mhs3);
        
        System.out.println("Hasil Reservasi:");
        reservasiProyek.tampilReservasi();
        
        System.out.println("\nStatus Akhir Ruangan:");
        System.out.println(labRPL.tampilData()); 
    }
}