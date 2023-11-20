package org.example;

import org.example.Behaviour.DancingBehaviour;
import org.example.Behaviour.FlyBehaviour;
import org.example.Behaviour.QuackBehaviour;
import org.example.Duck;

public abstract class DancingDuck extends Duck {

    private final DancingBehaviour dancingBehaviour;

    public DancingDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour, DancingBehaviour dancingBehaviour) {
        super(flyBehaviour, quackBehaviour);
        this.dancingBehaviour = dancingBehaviour;
    }


    public void perFormDance(){
        dancingBehaviour.dancingBehaviour();
    }
}
