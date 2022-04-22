package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        zofka.setSpeed(10);
         //nakresliRovnoramennyTrojuhelnik(zofka, 120);
        //nakresliObdelnik(zofka, 100, 200);
       // nakresliKolecko(zofka, 10);
        nakresliRovnoramennyTrojuhelnik(zofka,100);
        //nakresliKolecko2(zofka,100);

    }


    private void nakresliRovnostrannyTrojuhelnik(Turtle zelva, double velikostStrany) {

        nakresliMnohouhelnik(zelva, velikostStrany, 3);

    }
    private void nakresliRovnoramennyTrojuhelnik(Turtle zelva, double velikostStrany) {

        zelva.move(velikostStrany-0.3*velikostStrany);
        zelva.turnLeft(110.0);
        zelva.move(velikostStrany);
        zelva.turnLeft(140.0);
        zelva.move(velikostStrany);
        zelva.turnLeft(110.0);

    }
    private void nakresliKolecko(Turtle zelva, double velikostStrany) {

        nakresliMnohouhelnik(zelva, velikostStrany, 24);

    }

    private void nakresliKolecko2(Turtle zelva, double polomer) {
        int pocetStran =24;
        double obvod=  (2 * polomer * 3.14);
        nakresliMnohouhelnik(zelva, obvod/pocetStran, pocetStran);

    }
    private void nakresliCtverec(Turtle zelva, double velikostStrany) {

        nakresliMnohouhelnik(zelva, velikostStrany, 4);

    }

    private void nakresliObdelnik(Turtle zelva, double velikostStranyA, double velikostStranyB) {

        for (int i = 0; i < 4; i++) {
            if ((i % 2) == 0) {
                zelva.move(velikostStranyA);
            } else {
                zelva.move(velikostStranyB);
            }
            zelva.turnLeft(90.0);
        }
    }

    private void nakresliMnohouhelnik(Turtle zelva, double delkaStrany, int pocetStran) {
        double uhel = 360.0 / pocetStran;
        for (int i = 0; i < pocetStran; i++) {
            zelva.move(delkaStrany);
            zelva.turnLeft(uhel);
        }
    }
}
