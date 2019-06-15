package org.academiadecodigo.bootcamp.codebytes.objects.figures.special;

import org.academiadecodigo.bootcamp.codebytes.objectsinterfaces.Bonus;
import org.academiadecodigo.bootcamp.codebytes.objects.figures.GameObject;

public class Seringa extends GameObject implements Bonus {


    public Seringa(int points, int lifes) {
        super(points, lifes);
    }

    @Override
    public int calculateBonus() {

        return (getPoints() + 1000);

    }
}