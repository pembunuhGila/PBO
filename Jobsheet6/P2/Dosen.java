package P2;
import P1.Pegawai;

public class Dosen extends Pegawai {
    public String nidn;

    public Dosen() {
        System.out.println(gaji);
        System.out.println("Objek dari class Dosen dibuat");
    }

    public Dosen(double gaji) {
        this.gaji = gaji;
        System.out.println("objek dari class Dosen gaji" + gaji);
    }
}