public class Truk extends Kendaraan {
    public int kapasisitasMuatan;

    public void isiBahanbakar() {
        System.out.println("Isi solar untuk truk.");
    }

    public void tampilInfoTruk() {
        System.out.println("Kapasitas Muatan: " + kapasisitasMuatan + " kg");
    }
}
