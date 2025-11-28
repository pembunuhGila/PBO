package Kuis2PBO;

public class IkanVirtual extends HewanPeliharaan implements ISwimmable {

    public IkanVirtual(String nama, int energiAwal) {
        super(nama, energiAwal);
    }

    @Override
    public void bergerak() {
        setEnergi(getEnergi() - 3);
        System.out.println(getNama() + " berenang di akuarium. Energi sekarang: " + getEnergi());
    }

    @Override
    public void berenang() {
        System.out.println(getNama() + " berenang cepat mengelilingi gelembung air!");
    }
}
