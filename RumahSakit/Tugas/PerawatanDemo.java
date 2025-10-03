package RumahSakit.Tugas;
import java.time.LocalDate;

public class PerawatanDemo {
     public static void main(String[] args) {
            Dokter SamSugeng = new Dokter("1234", "dr. SamSugeng");
            Dokter SamPitak = new Dokter("4567", "dr. SamPitak");

            Pasien pasien1 = new Pasien("343298", "XIXI");
            pasien1.tambahPerawatan(LocalDate.of(2025, 1, 01), "Asma",  SamSugeng);
            pasien1.tambahPerawatan(LocalDate.of(2025, 8, 10), "Flu",  SamPitak);
    
            System.out.println(pasien1.getInfo());
    
            Pasien pasien2 = new Pasien("997744","Sulis");
            System.out.println(pasien2.getInfo());
        }
    }
