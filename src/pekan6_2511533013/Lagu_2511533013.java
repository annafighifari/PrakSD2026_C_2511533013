package pekan6_2511533013;

public class Lagu_2511533013 {
    private String judul_3013;
    private String penyanyi_3013;
    Lagu_2511533013 next_3013;
    Lagu_2511533013 prev_3013;

    // constructor
    public Lagu_2511533013(String judul_3013, String penyanyi_3013) {
        this.judul_3013 = judul_3013;
        this.penyanyi_3013 = penyanyi_3013;
        this.next_3013 = null;
        this.prev_3013 = null;
    }

    // getter judul
    public String getJudul_3013() {
        return judul_3013;
    }

    // setter judul
    public void setJudul_3013(String judul_3013) {
        this.judul_3013 = judul_3013;
    }

    // getter penyanyi
    public String getPenyanyi_3013() {
        return penyanyi_3013;
    }

    // setter penyanyi
    public void setPenyanyi_3013(String penyanyi_3013) {
        this.penyanyi_3013 = penyanyi_3013;
    }
}