package pekan5_2511533013;

class Pasien_2511533013 {

    private String namaPasien_3013;
    private String penyakit_3013;
    private int nomorAntrian_3013;

    Pasien_2511533013 next_3013;

    // constructor
    public Pasien_2511533013(String namaPasien_3013,
            String penyakit_3013,
            int nomorAntrian_3013) {

        this.namaPasien_3013 = namaPasien_3013;
        this.penyakit_3013 = penyakit_3013;
        this.nomorAntrian_3013 = nomorAntrian_3013;
        this.next_3013 = null;
    }

    // getter
    public String getNamaPasien_3013() {
        return namaPasien_3013;
    }

    public String getPenyakit_3013() {
        return penyakit_3013;
    }

    public int getNomorAntrian_3013() {
        return nomorAntrian_3013;
    }

    public Pasien_2511533013 getNext_3013() {
        return next_3013;
    }

    // setter
    public void setNamaPasien_3013(String namaPasien_3013) {
        this.namaPasien_3013 = namaPasien_3013;
    }

    public void setPenyakit_3013(String penyakit_3013) {
        this.penyakit_3013 = penyakit_3013;
    }

    public void setNomorAntrian_3013(int nomorAntrian_3013) {
        this.nomorAntrian_3013 = nomorAntrian_3013;
    }

    public void setNext_3013(Pasien_2511533013 next_3013) {
        this.next_3013 = next_3013;
    }
}