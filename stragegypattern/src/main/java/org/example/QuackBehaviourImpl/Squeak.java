package org.example.QuackBehaviourImpl;

import org.example.Behaviour.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    @Override
    public void quackBehaviour() {
        System.out.println("I Squeak");
    }
}
