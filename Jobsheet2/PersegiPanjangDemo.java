package Jobsheet2;

public class PersegiPanjangDemo {
    public static void main(String[] args) {
        PersegiPanjang p1 = new PersegiPanjang();
        p1.panjang = 5;
        p1.lebar = 10;

        PersegiPanjang p2 = new PersegiPanjang();
        p1.panjang = 6;
        p1.lebar = 12;

        p1.displayInfo();
        p2.displayInfo();
    }
}
