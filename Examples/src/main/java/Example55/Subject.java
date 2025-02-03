package Example55;

import java.util.ArrayList;
import java.util.List;

// pull data and notify the observers
public interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}

class AirPollutionAlert implements Subject{
    private double airPollutionIndex;
    // TODO 1. create a List<Observer> to store the observers
    List<Observer> observerList;

    // TODO 2 write no-arg constructor and initialize the list
    AirPollutionAlert(){
    }

    public void setAirPollutionIndex(double airPollutionIndex) {
        this.airPollutionIndex = airPollutionIndex;
    }
    // TODO 3. Add observer o to the list
    @Override
    public void register(Observer o) {
        observerList.add(o); // <----
    }

    //TODO 4. Remove observer o from the list
    @Override
    public void unregister(Observer o) {
        observerList.remove(o); // <---
    }

    // TODO 5. For each observer, call the update method with the air pollution index
    @Override
    public void notifyObservers() {
        // notify the observers by calling the update method
        for(Observer observer: observerList){
            observer.update(this.airPollutionIndex);
        }
    }
}
