public abstract class Kendaraan {
    public String merk;
    public double kecepatan;
    public String warna;

    public abstract void isiBahanbakar();

    public void tampilInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan: " + kecepatan + " km/h");
        System.out.println("Warna: " + warna);
    }
}