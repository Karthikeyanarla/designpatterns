package org.example;

import org.example.Behaviour.FlyBehaviour;
import org.example.Behaviour.QuackBehaviour;

public abstract class Duck {

    private final FlyBehaviour flyBehaviour;
    private final QuackBehaviour quackBehaviour;

    public Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour){
        this.quackBehaviour = quackBehaviour;
        this.flyBehaviour = flyBehaviour;
    }

    public void perFormFly(){
        flyBehaviour.flyBehaviour();
    }

    public void perFormQuack(){
        quackBehaviour.quackBehaviour();
    }

    public abstract void introduce();
}
