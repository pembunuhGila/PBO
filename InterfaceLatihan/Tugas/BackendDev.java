package InterfaceLatihan.Tugas;
public class BackendDev extends Pekerja implements IBackendDeveloper {

    public BackendDev(int idPegawai, double gaji) {
        super(idPegawai, gaji);
    }

    @Override
    public void kelolaDatabase() {
        System.out.println("Backend Developer (" + getIdPegawai() + "): Sedang mengelola skema database dan optimasi query.");
    }

    @Override
    public void buatApi() {
        System.out.println("Backend Developer (" + getIdPegawai() + "): Sedang membangun RESTful API endpoints.");
    }

    @Override
    public void tampilkanPeran() {
        System.out.println("Saya adalah seorang Backend Developer.");
    }
}