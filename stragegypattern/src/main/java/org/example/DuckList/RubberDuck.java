package org.example.DuckList;

import org.example.Behaviour.FlyBehaviour;
import org.example.Behaviour.QuackBehaviour;
import org.example.Duck;

public class RubberDuck extends Duck {
    public RubberDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }

    @Override
    public void introduce() {
        System.out.println("I am RubberDuck");
    }

    public void pressToSound(){
        System.out.println("quack quack");
    }

}
