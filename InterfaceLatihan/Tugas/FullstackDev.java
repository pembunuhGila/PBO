package InterfaceLatihan.Tugas;
public class FullstackDev extends Pekerja implements IFrontendDeveloper, IBackendDeveloper {

    public FullstackDev(int idPegawai, double gaji) {
        super(idPegawai, gaji);
    }

    @Override
    public void kelolaDatabase() {
        System.out.println("Fullstack Developer (" + getIdPegawai() + "): Mengelola Database (Backend).");
    }

    @Override
    public void buatApi() {
        System.out.println("Fullstack Developer (" + getIdPegawai() + "): Membuat API (Backend).");
    }

    @Override
    public void buatDesain() {
        System.out.println("Fullstack Developer (" + getIdPegawai() + "): Membuat Desain UI/UX (Frontend).");
    }
    
    @Override
    public void tampilkanPeran() {
        System.out.println("Saya adalah seorang Fullstack Developer.");
    }
}