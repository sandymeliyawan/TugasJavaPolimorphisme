public class Bola extends BangunRuang {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }

    public double hitungLuasPermukaan() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }
}
