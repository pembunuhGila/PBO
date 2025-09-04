package Jobsheet2;

public class MahasiswaDemo {
    public static void main(String[] args) {
        
    Mahasiswa m1 = new Mahasiswa();
    m1.nim = "023432";
    m1.nama = "Yansy Ayuningtyas";
    m1.alamat = "Nias, Sumatera Utara";
    m1.kelas = "2A"; 

    Mahasiswa m2 = new Mahasiswa();
    m2.nim = "123432";
    m2.nama = "Zaki";
    m2.alamat = "Malang, Jawa Timur";
    m2.kelas = "2D";

    Mahasiswa m3 = new Mahasiswa();
    m3.nim = "123456";
    m3.nama = "Xixi";
    m3.alamat = "Bandug, Jawa Barat";
    m3.kelas = "2B";

    m1.displayBiodata();
    m2.displayBiodata();
    m3.displayBiodata();
    }
}