package Jobsheet2;

public class MobilDemo {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.merk = "Toyota";
        mobil1.bahanBakar = "Bensin";
        mobil1.kecepatan = 0;
        mobil1.mesinMenyala = false;

        Mobil mobil2 = new Mobil();
        mobil2.merk = "Tesla";
        mobil2.bahanBakar = "Listrik";
        mobil2.kecepatan = 0;
        mobil2.mesinMenyala = false;

        mobil1.nyalakanMesin();
        mobil1.tambahKecepatan(40);
        mobil1.kurangiKecepatan(15);
        mobil1.displayInfo();  
        mobil1.matikanMesin();

        System.out.println();

        mobil2.nyalakanMesin();
        mobil2.tambahKecepatan(80);
        mobil2.kurangiKecepatan(30);
        mobil2.displayInfo(); 
        mobil2.matikanMesin();
    }
}
