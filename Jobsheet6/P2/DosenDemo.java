package P2;

public class DosenDemo {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();

        dosen1.nip = "123456789";
        dosen1.nama = "Zaki";
        dosen1.setGaji(3000000);
        dosen1.nidn = "987654321";

        System.out.println(dosen1.getInfo());
    }
}
