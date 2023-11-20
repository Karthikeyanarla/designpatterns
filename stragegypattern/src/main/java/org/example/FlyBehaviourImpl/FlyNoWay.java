package org.example.FlyBehaviourImpl;

import org.example.Behaviour.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void flyBehaviour() {
        System.out.println("I can't fly");
    }
}
