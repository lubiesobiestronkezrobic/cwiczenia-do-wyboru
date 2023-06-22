package geometria;

public abstract class Figura {
    private Punkt srodek;

    public Figura(Punkt srodek) {dodan
        this.srodek = srodek;
    }

    public Punkt getSrodek() {
        return srodek;
    }

    public abstract double obliczPole();
}