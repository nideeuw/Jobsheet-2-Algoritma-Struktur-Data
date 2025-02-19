public class DosenMain17 {
    public static void main(String[] args) {
        Dosen17 dosen1 = new Dosen17();
        System.out.println("========== INFORMASI DOSEN ==========");
        dosen1.idDosen = "D001";
        dosen1.nama = "Dr. Naswanida Nafiula";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2020;
        dosen1.bidangKeahlian = "Rekayasa Perangkat Lunak";

        System.out.println("\n=== Dosen 1 ===");
        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("Sistem Informasi");
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2025) + " tahun");
        dosen1.tampilInformasi();

        Dosen17 dosen2 = new Dosen17("D002", "Prof. Naswa Nida", true, 2004, "Jaringan Komputer");

        System.out.println("\n=== Dosen 2 ===");
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);
        dosen2.ubahKeahlian("Keamanan Siber");
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2025) + " tahun");
        dosen2.tampilInformasi();
    }
}
