package pekan7_2511533013;

public class Mahasiswa_2511533013 {
    private String nama_3013;
    private String nim_3013;
    private String prodi_3013;

    public Mahasiswa_2511533013(String nama_3013, String nim_3013, String prodi_3013) {
        this.nama_3013 = nama_3013;
        this.nim_3013 = nim_3013;
        this.prodi_3013 = prodi_3013;
    }

    public String getNama_3013() {
        return nama_3013;
    }

    public void setNama_3013(String nama_3013) {
        this.nama_3013 = nama_3013;
    }

    public String getNim_3013() {
        return nim_3013;
    }

    public void setNim_3013(String nim_3013) {
        this.nim_3013 = nim_3013;
    }

    public String getProdi_3013() {
        return prodi_3013;
    }

    public void setProdi_3013(String prodi_3013) {
        this.prodi_3013 = prodi_3013;
    }

    @Override
    public String toString() {
        return nama_3013 + " - " + nim_3013 + " - " + prodi_3013;
    }
}
