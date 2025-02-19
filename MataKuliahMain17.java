public class MataKuliahMain17 {
    public static void main(String[] args) {
        MataKuliah17 mkNida = new MataKuliah17();
        System.out.println("========== INFORMASI MATA KULIAH ==========");
        mkNida.kodeMK = "SIB242004";
        mkNida.nama = "Naswanida Nafiula";
        mkNida.sks = 2;
        mkNida.jumlahJam = 4;
        
        System.out.println("\nMata Kuliah 1");
        mkNida.tampilInformasi();
        mkNida.ubahSKS(2);
        mkNida.tambahJam(3);
        mkNida.kurangiJam(2);
        mkNida.tampilInformasi();
        
        MataKuliah17 mkNaswa = new MataKuliah17("SIB242006", "Naswa", 3, 5);
        
        System.out.println("\nMata Kuliah 2");
        mkNaswa.tampilInformasi();
        mkNaswa.ubahSKS(2);
        mkNaswa.tambahJam(3);
        mkNaswa.kurangiJam(4);
        mkNaswa.tampilInformasi();
    }
}
