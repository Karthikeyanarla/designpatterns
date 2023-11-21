package org.example.Observable;

import org.example.Observer.Observer;

public interface Observable {
    void notifyObservers();
    void registerObserver(Observer o);
    void removeObserver(Observer o);




}
