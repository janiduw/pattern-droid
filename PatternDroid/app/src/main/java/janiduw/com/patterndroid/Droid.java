package janiduw.com.patterndroid;

import java.util.ArrayList;
import java.util.List;

import janiduw.com.patterndroid.decorator.Warrior;
import janiduw.com.patterndroid.observer.DroidObserver;
import janiduw.com.patterndroid.strategy.DanceBehavior;

/**
 * Droid made with different abilities (Powered by GoF design patterns)
 * "Beep Bloop Blop Bleep Boop - R2-D2 Star Wars (1977)"
 * Created by janidu on 27/4/15.
 */
public class Droid implements IDroid {

    private String name;
    private DanceBehavior danceBehavior;
    private List<DroidObserver> observers;
    private Warrior warrior;

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
        observers.remove(droidObserver);
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

    public Warrior getWarrior() {
        return warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
    }
}
