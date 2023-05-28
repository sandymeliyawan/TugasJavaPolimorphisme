public class PrismaSegitiga extends BangunRuang {
    private double alas;
    private double tinggiAlas;
    private double tinggiPrisma;

    public PrismaSegitiga(double alas, double tinggiAlas, double tinggiPrisma) {
        this.alas = alas;
        this.tinggiAlas = tinggiAlas;
        this.tinggiPrisma = tinggiPrisma;
    }

    public double hitungVolume() {
        return (alas * tinggiAlas * tinggiPrisma) / 2;
    }

    public double hitungLuasPermukaan() {
        double luasSegitiga = (alas * tinggiAlas) / 2;
        double luasAlasPrisma = alas * tinggiPrisma;
        double luasSisiPrisma = 3 * luasSegitiga;
        return luasAlasPrisma + luasSisiPrisma;
    }
}
