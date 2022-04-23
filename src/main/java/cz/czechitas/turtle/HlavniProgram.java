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
        //nakresliKolecko2(zofka,100);
        //nakresliSnehulaka(zofka);
        //nakresliPravouhlyTrojuhelnik(zofka,100);
        nakresliMasinku(zofka);
    }

    private void nakresliMasinku(Turtle zelva) {
        double souradniceX = zelva.getX();
        double souradniceY = zelva.getY();
        zelva.setLocation(souradniceX, souradniceY);
        System.out.println("X" + souradniceX + "Y" + souradniceY);
        zelva.setLocation(souradniceX - 100, souradniceY + 100);
        nakresliKolecko2(zelva, 25);
        zelva.setLocation(souradniceX + 0, souradniceY + 100);
        nakresliKolecko2(zelva, 25);
        zelva.setLocation(souradniceX + 150, souradniceY + 75);
        nakresliKolecko2(zelva, 50);
        zelva.setLocation(souradniceX + 150, souradniceY + 75);
        nakresliObdelnik(zelva, 200, 100);
        zelva.setLocation(souradniceX + 50, souradniceY + 75);
        nakresliObdelnik(zelva, 100, 200);
        zelva.setLocation(souradniceX - 150, souradniceY + 100);
        nakresliPravouhlyTrojuhelnik(zelva, 75);
    }

    private void nakresliPravouhlyTrojuhelnik(Turtle zelva, double velikostStrany) {
        zelva.move(velikostStrany);
        zelva.turnLeft(135.0);
        zelva.move(velikostStrany * 1.4);
        zelva.turnLeft(135.0);
        zelva.move(velikostStrany);
        zelva.turnLeft(90.0);
    }

    private void nakresliSnehulaka(Turtle zelva) {
        double souradniceX = zelva.getX();
        double souradniceY = zelva.getY() - 200;
        zelva.setLocation(souradniceX, souradniceY);
        System.out.println("X" + souradniceX + "Y" + souradniceY);
        nakresliKolecko2(zelva, 50);
        zelva.setLocation(souradniceX + 25, souradniceY + 125);
        nakresliKolecko2(zelva, 75);
        zelva.setLocation(souradniceX + 50, souradniceY + 300);
        nakresliKolecko2(zelva, 100);
        zelva.setLocation(souradniceX + 75, souradniceY + 100);
        nakresliKolecko2(zelva, 25);
        zelva.setLocation(souradniceX - 125, souradniceY + 100);
        nakresliKolecko2(zelva, 25);
    }

    private void nakresliZmrzlinu(Turtle zelva) {
        nakresliKolecko(zelva, 10);
        zelva.turnLeft(90);
        nakresliRovnoramennyTrojuhelnik(zelva, 105);
    }

    private void nakresliRovnostrannyTrojuhelnik(Turtle zelva, double velikostStrany) {
        nakresliMnohouhelnik(zelva, velikostStrany, 3);
    }

    private void nakresliRovnoramennyTrojuhelnik(Turtle zelva, double velikostStrany) {
        zelva.move(velikostStrany - 0.3 * velikostStrany);
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
        int pocetStran = 24;
        double obvod = (2 * polomer * 3.14);
        nakresliMnohouhelnik(zelva, obvod / pocetStran, pocetStran);
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
