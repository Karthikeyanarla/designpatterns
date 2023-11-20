package org.example.QuackBehaviourImpl;

import org.example.Behaviour.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quackBehaviour() {
        System.out.println("I am muted");
    }
}
