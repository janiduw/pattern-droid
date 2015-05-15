package janiduw.com.patterndroid;

import java.util.ArrayList;
import java.util.List;

import janiduw.com.patterndroid.observer.DroidObserver;
import janiduw.com.patterndroid.strategy.DanceBehavior;

/**
 * Droid made with different design patterns
 * Created by janidu on 27/4/15.
 */
public class Droid implements IDroid {

    private String name;
    private DanceBehavior danceBehavior;
    private List<DroidObserver> observers;

    public Droid() {
        observers = new ArrayList<>();
    }

    @Override
    public String dance() {
        return danceBehavior.dance();
    }

    @Override
    public void registerObserver(DroidObserver droidObserver) {
        observers.add(droidObserver);
    }

    @Override
    public void removeObserver(DroidObserver droidObserver) {
        int index = observers.indexOf(droidObserver);
        if (index >= -1) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyBatteryStatus(float batteryStatus) {
        for (DroidObserver observer : observers) {
            observer.updateBatteryStatus(batteryStatus);
        }
    }

    public DanceBehavior getDanceBehavior() {
        return danceBehavior;
    }

    public void setDanceBehavior(DanceBehavior danceBehavior) {
        this.danceBehavior = danceBehavior;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
