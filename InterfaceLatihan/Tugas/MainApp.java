package InterfaceLatihan.Tugas;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("--- 1. Uji Coba Fullstack Developer ---");
        System.out.println("=====================================");
        FullstackDev albert = new FullstackDev(101, 15000000.00);

        albert.tampilkanPeran();
        albert.buatDesain();     
        albert.buatApi();        
        albert.kelolaDatabase(); 
        albert.mendapatGaji();    
        albert.mendapatCuti();   
        
        System.out.println("\n=====================================");
        System.out.println("--- 2. Uji Coba Backend Developer ---");
        System.out.println("=====================================");
        BackendDev bella = new BackendDev(202, 12000000.00);
        
        bella.tampilkanPeran();
        bella.buatApi();          
        bella.kelolaDatabase();
        bella.mendapatGaji();     
    }
}