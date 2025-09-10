package Jobsheet3;

public class Mobil {
    private String merek = "Toyota";
    private int kecepatan;

    // public void setMerek(String merek) {
        // this.merek = merek;
    // }
    
    public String getMerek() {
        return merek;
    }  

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    } 

    // public int getKecepatan() {
        // return kecepatan;
    // } 

    public void tampilkanInfo() {
        System.out.println("Merek Mobil: " + merek);
        // System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}

