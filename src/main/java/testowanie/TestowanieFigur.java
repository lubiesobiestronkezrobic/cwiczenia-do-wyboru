package testowanie;

import geometria.Punkt;
import figury.Kwadrat;
import geometria.Figura;

public class TestowanieFigur {
    public static void main(String[] args) {
        Punkt srodekKwadratu = new Punkt(0, 0);
        Kwadrat kwadrat = new Kwadrat(srodekKwadratu, 5);

        System.out.println("Informacje o kwadracie:");
        System.out.println("Srodek: (" + kwadrat.getSrodek().getX() + ", " + kwadrat.getSrodek().getY() + ")");
        System.out.println("Długość boku: " + kwadrat.getDlugoscBoku());
        System.out.println("Pole: " + kwadrat.obliczPole());
    }
}