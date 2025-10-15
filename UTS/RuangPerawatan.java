package UTS;

public class RuangPerawatan {
    private String nomorRuang;
    private boolean isTersedia;

    public RuangPerawatan(String nomorRuang) {
        this.nomorRuang = nomorRuang;
        this.isTersedia = true;
    }

    // Encapsulation
    public String getNomorRuang() { 
        return nomorRuang; 
    }

    public boolean isTersedia() {
        return isTersedia; 
    }
    
    public void setTersedia(boolean isTersedia) { this.isTersedia = isTersedia; }

    @Override
    public String toString() {
        return "Ruang " + nomorRuang + (isTersedia ? " (Tersedia)" : " (Dipakai)");
    }
}