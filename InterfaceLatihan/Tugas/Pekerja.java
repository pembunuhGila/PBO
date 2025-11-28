package InterfaceLatihan.Tugas;

public abstract class Pekerja {
    private int idPegawai;
    private double gaji;

    public Pekerja(int idPegawai, double gaji) {
        this.idPegawai = idPegawai;
        this.gaji = gaji;
    }

    public int getIdPegawai() {
        return idPegawai;
    }

    public double getGaji() {
        return gaji;
    }

    public void mendapatGaji() {
        System.out.println("Pekerja ID " + getIdPegawai() + " menerima gaji sebesar: Rp" + getGaji());
    }

    public void mendapatCuti() {
        System.out.println("Pekerja ID " + getIdPegawai() + " mengajukan cuti.");
    }

    public abstract void tampilkanPeran();
}