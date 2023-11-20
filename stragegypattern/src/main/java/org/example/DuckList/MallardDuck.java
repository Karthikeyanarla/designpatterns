package org.example.DuckList;

import org.example.Behaviour.FlyBehaviour;
import org.example.Behaviour.QuackBehaviour;
import org.example.Duck;

public class MallardDuck extends Duck {


    public MallardDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }

    @Override
    public void introduce() {
        System.out.println("I am a MallardDuck");
    }
}
