package Jobsheet7;

public class Kucing extends Hewan {
    // Tambahan atribut pada child class
    String ras;

    // Constructor tanpa parameter
    public Kucing() {
        super(); // memanggil constructor tanpa parameter dari parent
        this.ras = "Tidak diketahui";
    }

    // Constructor berparameter (overloading)
    public Kucing(String nama, int umur, String jenis, String ras) {
        super(nama, umur, jenis); // memanggil constructor parent dengan parameter
        this.ras = ras;
    }

    // Overriding method tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // memanggil method parent
        System.out.println("Ras         : " + ras);
    }
}
