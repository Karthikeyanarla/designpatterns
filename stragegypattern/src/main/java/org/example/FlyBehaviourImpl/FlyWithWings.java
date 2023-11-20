package org.example.FlyBehaviourImpl;

import org.example.Behaviour.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void flyBehaviour() {
        System.out.println("I fly with wings");
    }
}
