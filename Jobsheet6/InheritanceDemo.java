public class InheritanceDemo {

    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();

        dosen1.nama = "Zaki";
        dosen1.nip = "1234";
        dosen1.gaji = 3000000;
        dosen1.nidn = "5678";

        System.out.println(dosen1.getAllInfo());
    }
}