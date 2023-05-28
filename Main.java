public class Main {
    public static void main(String[] args) {
        // Membuat objek-objek bangun ruang
        Kubus kubus = new Kubus(5);
        Balok balok = new Balok(4, 6, 3);
        Bola bola = new Bola(7);
        Tabung tabung = new Tabung(4, 8);
        PrismaSegitiga prismaSegitiga = new PrismaSegitiga(5, 6, 8);
        // 
        System.out.println("");
        System.out.println("Nama          : Sandy Meliyawan");
        System.out.println("NPM           : 2169700003");
        System.out.println("Prodi         : Teknik Komputer Jaringan");
        System.out.println("Dosen Pengampu: Anderias Eko Wijaya, S.T., M.Kom.");
        System.out.println("");
        // Menghitung volume dan luas permukaan dari masing-masing bangun ruang
        System.out.println("====================Kubus====================");
        System.out.println("Volume: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan: " + kubus.hitungLuasPermukaan());

        System.out.println("\n====================Balok====================");
        System.out.println("Volume: " + balok.hitungVolume());
        System.out.println("Luas Permukaan: " + balok.hitungLuasPermukaan());

        System.out.println("\n====================Bola====================");
        System.out.println("Volume: " + bola.hitungVolume());
        System.out.println("Luas Permukaan: " + bola.hitungLuasPermukaan());

        System.out.println("\n====================Tabung====================");
        System.out.println("Volume: " + tabung.hitungVolume());
        System.out.println("Luas Permukaan: " + tabung.hitungLuasPermukaan());

        System.out.println("\n================Prisma Segitiga================");
        System.out.println("Volume: " + prismaSegitiga.hitungVolume());
        System.out.println("Luas Permukaan: " + prismaSegitiga.hitungLuasPermukaan());
        System.out.println("");
    }
}
