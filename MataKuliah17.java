public class MataKuliah17 {
    String kodeMK, nama;
    int sks, jumlahJam;

    public MataKuliah17(){

    }
    public MataKuliah17(String kodeMK, String nm, int sks, int jumlahJam){
        this.kodeMK = kodeMK;
        nama = nm;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi(){
        System.out.println("============================================");
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println("============================================");
    }
    void ubahSKS(int sksBaru){
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi: " + sks);
    }
    void tambahJam(int jam){
        jumlahJam += jam;
        System.out.println("Jumlah jam berhasil ditambahkan. Jumlah jam sekarang: " + jumlahJam);
    }
    void kurangiJam(int jam){
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi. Jumlah jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam yang tersedia tidak mencukupi.");
        }
    }
}
