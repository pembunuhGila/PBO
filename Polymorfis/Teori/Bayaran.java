package Polymorfis.Teori;

public class Bayaran {
    public int hitungBayaran(Pegawai pg) {

        int uang = pg.getGaji(); // polymorphism: memanggil getGaji() dari object sebenarnya

        if (pg instanceof Manajer) {
            uang += ((Manajer) pg).getTunjangan();
        } else if (pg instanceof Programmer) {
            uang += ((Programmer) pg).getBonus();
        }

        return uang;
    }
}


