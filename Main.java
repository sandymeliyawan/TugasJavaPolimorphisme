public class Main {
    public static void main(String[] args) {
        BangunRuang[] bangunRuangArray = new BangunRuang[5];
        bangunRuangArray[0] = new Kubus(5);
        bangunRuangArray[1] = new Balok(4, 6, 8);
        bangunRuangArray[2] = new Bola(3);
        bangunRuangArray[3] = new Tabung(2, 5);
        bangunRuangArray[4] = new PrismaSegitiga(6, 4, 7);
        System.out.println("");
        System.out.println("====================================");
        System.out.println("----------Sandy Meliyawan-----------");
        System.out.println("-------------2169700003-------------");
        System.out.println("---------Pemrograman Java 1---------");
        System.out.println("====================================");
        for (BangunRuang bangunRuang : bangunRuangArray) {
            double volume = bangunRuang.hitungVolume();
            double luasPermukaan = bangunRuang.hitungLuasPermukaan();
            System.out.println("");
            System.out.println("Bangun Ruang : " + bangunRuang.getClass().getSimpleName());
            System.out.println("Volume: " + volume);
            System.out.println("Luas Permukaan: " + luasPermukaan);
            System.out.println("-------------------");
        }
    }
}
