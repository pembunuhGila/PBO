package UTS;

public class Pemilik {
    private String idPemilik;
    private String nama;
    private String telepon;

    public Pemilik(String idPemilik, String nama, String telepon) {
        this.idPemilik = idPemilik;
        this.nama = nama;
        this.telepon = telepon;
    }

    // Enkapsulasi
    public String getIdPemilik() { 
        return idPemilik; 
    }
    
    public String getNama() { 
        return nama; 
    }
    
    public void setNama(String nama) { 
        this.nama = nama; 
    }
    
    public String getTelepon() { 
        return telepon; 
    }
    
    public void setTelepon(String telepon) { 
        this.telepon = telepon; 
    }

    @Override
    public String toString() {
        return nama + " (ID: " + idPemilik + ", Telp: " + telepon + ")";
    }
}