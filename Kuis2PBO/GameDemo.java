package Kuis2PBO;
public class GameDemo {
    public static void main(String[] args) {
        KucingVirtual kucing = new KucingVirtual("Mimi", 50);
        IkanVirtual ikan = new IkanVirtual("Nemo", 40);
        AnjingVirtual anjing = new AnjingVirtual("Buddy", 60);

        System.out.println("=== SIMULASI GAME HEWAN PELIHARAAN VIRTUAL ===");

        kucing.makan();
        kucing.bergerak();
        kucing.bersuara();

        System.out.println("--------------------------------------");

        ikan.makan();
        ikan.bergerak();
        ikan.berenang();

        System.out.println("--------------------------------------");

        anjing.makan();
        anjing.bergerak();
        anjing.bersuara();
        anjing.berenang();
    }
}
