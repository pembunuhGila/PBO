package Kuis2PBO;

public class KucingVirtual extends HewanPeliharaan implements IAudible {

    public KucingVirtual(String nama, int energiAwal) {
        super(nama, energiAwal);
    }

    @Override
    public void bergerak() {
        setEnergi(getEnergi() - 5);
        System.out.println(getNama() + " berjalan pelan di sekitar rumah. Energi sekarang: " + getEnergi());
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " mengeong: Meow~");
    }
}
