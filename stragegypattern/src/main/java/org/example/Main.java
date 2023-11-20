package org.example;

import org.example.Behaviour.DancingBehaviour;
import org.example.Behaviour.FlyBehaviour;
import org.example.Behaviour.QuackBehaviour;
import org.example.DancingBehaviourImpl.DaisyDance;
import org.example.DuckList.DancingDuckList.DaisyDuck;
import org.example.DuckList.MallardDuck;
import org.example.DuckList.ModelDuck;
import org.example.DuckList.RubberDuck;
import org.example.FlyBehaviourImpl.FlyNoWay;
import org.example.FlyBehaviourImpl.FlyWithWings;
import org.example.FlyBehaviourImpl.JetPackPowderedFly;
import org.example.QuackBehaviourImpl.MuteQuack;
import org.example.QuackBehaviourImpl.Quack;

public class Main {

    private static void duckPerformBehaviours(Duck duck){
        duck.introduce();
        System.out.println("I can do: ");
        duck.perFormQuack();
        duck.perFormFly();
    }

    private static void dancingDuckPerformBehaviours(DancingDuck dancingDuck){
        duckPerformBehaviours(dancingDuck);
        dancingDuck.perFormDance();
    }

    public static void main(String[] args) {

        FlyBehaviour flyBehaviour = new FlyWithWings();
        QuackBehaviour quackBehaviour = new Quack();
        Duck duck = new MallardDuck(flyBehaviour, quackBehaviour);
        duckPerformBehaviours(duck);

        FlyBehaviour flyBehaviour1 = new FlyNoWay();
        QuackBehaviour quackBehaviour1 = new MuteQuack();
        RubberDuck duck1 = new RubberDuck(flyBehaviour1, quackBehaviour1);
        duckPerformBehaviours(duck1);

        FlyBehaviour flyBehaviour2 = new JetPackPowderedFly();
        QuackBehaviour quackBehaviour2 = new Quack();
        Duck duck2 = new ModelDuck(flyBehaviour2, quackBehaviour2);
        duckPerformBehaviours(duck2);

        /*

        Here, word interface word is overloaded, it can be an interface, abstract class, or it can supertype.
        in future if dancing behaviour is added to the duck behaviours list, we don't change the duck supertype class we extend the duck supertype class
        adding dancing method. The implementation can be seen in the DancingDuck

         */

        FlyBehaviour flyBehaviour3 = new FlyNoWay();
        QuackBehaviour quackBehaviour3 = new Quack();
        DancingBehaviour dancingBehaviour = new DaisyDance();
        DancingDuck duck3 = new DaisyDuck(flyBehaviour3, quackBehaviour3, dancingBehaviour);
        dancingDuckPerformBehaviours(duck3);



    }
}