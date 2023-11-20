package org.example.FlyBehaviourImpl;

import org.example.Behaviour.FlyBehaviour;

public class JetPackPowderedFly implements FlyBehaviour {
    @Override
    public void flyBehaviour() {
        System.out.println("I fly using JetPack");
    }
}
