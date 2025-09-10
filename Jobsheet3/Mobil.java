package Jobsheet3;

public class Mobil {
    private String merek = "Toyota";
    private int kecepatan;
    // deklarasi atribut menggunakan private

    public void setMerek(String merek) {
        this.merek = merek;
    } // berfungsi untuk memanipulasi nilai dari atribut private(merek)
    
    public String getMerek() {
        return merek;
    }  // berfungsi mengembalikan nilai dari atribut private(merek)

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    } // berfungsi untuk memanipulasi nilai dari atribut private(kecepatan)

     public int getKecepatan() {
        return kecepatan;
    }  // berfungsi mengembalikan nilai dari atribut private(kecepatan)

    public void tampilkanInfo() {
        System.out.println("Merek Mobil: " + merek);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
        // untuk menampilkan merek dan kecepatan
    }
}

