package org.example.DuckList;

import org.example.Behaviour.FlyBehaviour;
import org.example.Behaviour.QuackBehaviour;
import org.example.Duck;

public class ModelDuck extends Duck {

    public ModelDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }

    @Override
    public void introduce() {
        System.out.println("I am model duck");
    }
}
