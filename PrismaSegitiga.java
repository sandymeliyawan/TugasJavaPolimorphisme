public class PrismaSegitiga extends BangunRuang {
    private double alas;
    private double tinggiAlas;
    private double tinggiPrisma;

    public PrismaSegitiga(double alas, double tinggiAlas, double tinggiPrisma) {
        this.alas = alas;
        this.tinggiAlas = tinggiAlas;
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 2.0) * alas * tinggiAlas * tinggiPrisma;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasAlas = (1.0 / 2.0) * alas * tinggiAlas;
        double luasSisi = 3 * alas * tinggiPrisma;
        return luasAlas + luasSisi;
    }
}
