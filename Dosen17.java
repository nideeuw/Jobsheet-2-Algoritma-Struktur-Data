public class Dosen17 {
    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    public Dosen17(){

    }
    public Dosen17(String idDosen, String nm, boolean status, int tahun, String bidang ){
        this.idDosen = idDosen;
        nama = nm;
        statusAktif = status;
        tahunBergabung = tahun;
        bidangKeahlian = bidang;
    }

    void tampilInformasi(){
        System.out.println("============================================");
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("============================================");
    }
    void setStatusAktif(boolean status){
        statusAktif = status;
        System.out.println("Status aktif diubah menjadi: " + (status ? "Aktif" : "Tidak Aktif"));
    }
    int hitungMasaKerja(int thnSkrg){
        return thnSkrg - tahunBergabung;
    }
    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian diubah menjadi: " + bidangKeahlian);
    }
}
