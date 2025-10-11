package Jobsheet7;

public class Hewan {
    // 3 atribut pada parent class
    String nama;
    int umur;
    String jenis;

    // Constructor tanpa parameter
    public Hewan() {
        this.nama = "Tidak diketahui";
        this.umur = 0;
        this.jenis = "Tidak diketahui";
    }

    // Constructor berparameter (overloading)
    public Hewan(String nama, int umur, String jenis) {
        this.nama = nama;
        this.umur = umur;
        this.jenis = jenis;
    }

    // Method tampilkan info (akan dioverride)
    public void tampilkanInfo() {
        System.out.println("Nama Hewan  : " + nama);
        System.out.println("Umur        : " + umur + " tahun");
        System.out.println("Jenis       : " + jenis);
    }
}
