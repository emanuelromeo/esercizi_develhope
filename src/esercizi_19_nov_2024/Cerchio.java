package esercizi_19_nov_2024;

public class Cerchio {

    private double raggio;

    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public double calcolaArea() {
        return raggio * raggio * Math.PI;
    }

    public  double calcolaCirconferenza() {
        return raggio * 2 * Math.PI;
    }

}
