package Kuis2PBO;

public class AnjingVirtual extends HewanPeliharaan implements IAudible, ISwimmable {

    public AnjingVirtual(String nama, int energiAwal) {
        super(nama, energiAwal);
    }

    @Override
    public void bergerak() {
        setEnergi(getEnergi() - 7);
        System.out.println(getNama() + " berlari mengejar bola. Energi sekarang: " + getEnergi());
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " menggonggong: Guk! Guk!");
    }

    @Override
    public void berenang() {
        System.out.println(getNama() + " berenang menyeberangi kolam!");
    }
}
