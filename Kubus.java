public class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    public double hitungLuasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }
}
