package Jobsheet2;

public class Mobil {
    String merk;
    int kecepatan;
    String bahanBakar;
    boolean mesinMenyala;

    public void nyalakanMesin() {
        if (!mesinMenyala) {
            mesinMenyala = true;
            System.out.println(merk + " mesinnya dinyalakan.");
        } else {
            System.out.println(merk + " mesinnya sudah menyala.");
        }
    }

    public void matikanMesin() {
        if (mesinMenyala) {
            mesinMenyala = false;
            kecepatan = 0;
            System.out.println(merk + " mesinnya dimatikan.");
        } else {
            System.out.println(merk + " mesinnya sudah mati.");
        }
    }

    public void tambahKecepatan(int tambah) {
        if (mesinMenyala) {
            kecepatan += tambah;
            System.out.println(merk + " bertambah kecepatan menjadi " + kecepatan + " km/jam.");
        } else {
            System.out.println("Mesin belum menyala, tidak bisa menambah kecepatan.");
        }
    }

    public void kurangiKecepatan(int kurang) {
        if (mesinMenyala && kecepatan > 0) {
            kecepatan -= kurang;
            if (kecepatan < 0) kecepatan = 0;
            System.out.println(merk + " berkurang kecepatan menjadi " + kecepatan + " km/jam.");
        } else {
            System.out.println("Mobil tidak sedang berjalan.");
        }
    }

    public void displayInfo() {
        System.out.println("=== Info Mobil ===");
        System.out.println("Merk        : " + merk);
        System.out.println("Bahan Bakar : " + bahanBakar);
        System.out.println("Kecepatan   : " + kecepatan + " km/jam");
        System.out.println("Mesin       : " + (mesinMenyala ? "Menyala" : "Mati"));
        System.out.println("==================");
    }
}
