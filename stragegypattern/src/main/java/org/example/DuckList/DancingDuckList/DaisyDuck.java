package org.example.DuckList.DancingDuckList;

import org.example.Behaviour.DancingBehaviour;
import org.example.Behaviour.FlyBehaviour;
import org.example.Behaviour.QuackBehaviour;
import org.example.DancingDuck;

public class DaisyDuck extends DancingDuck {
    public DaisyDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour, DancingBehaviour dancingBehaviour) {
        super(flyBehaviour, quackBehaviour, dancingBehaviour);
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I am your daisy duck, donald duck girl friend");
    }
}
