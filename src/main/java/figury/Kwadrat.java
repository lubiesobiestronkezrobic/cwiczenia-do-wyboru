package figury;

import geometria.Punkt;
import geometria.Figura;

public class Kwadrat extends Figura {
    private double dlugoscBoku;

    public Kwadrat(Punkt srodek, double dlugoscBoku) {
        super(srodek);
        this.dlugoscBoku = dlugoscBoku;
    }

    public double getDlugoscBoku() {
        return dlugoscBoku;
    }

    @Override
    public double obliczPole() {
        return dlugoscBoku * dlugoscBoku;
    }
}