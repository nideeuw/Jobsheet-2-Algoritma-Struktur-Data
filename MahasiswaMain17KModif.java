public class MahasiswaMain17KModif {
    public static void main(String[] args) {
        Mahasiswa17KModif mhs1 = new Mahasiswa17KModif();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa17KModif mhs2 = new Mahasiswa17KModif("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa17KModif mhsNida = new Mahasiswa17KModif("Naswanida Nafiula","244107060063",4.0, "SIB 1B");
        mhsNida.tampilkanInformasi();
    }
}
