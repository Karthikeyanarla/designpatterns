package org.example.QuackBehaviourImpl;

import org.example.Behaviour.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quackBehaviour() {
        System.out.println("I Quack");
    }
}
