package janiduw.com.patterndroid.droid;

import janiduw.com.patterndroid.observer.DroidObserver;

/**
 * Droid that has the behaviour of an Android
 *
 * Created by Janidu on 8/9/15.
 */
public class AndroDroid implements IDroid {
    @Override
    public String dance() {
        return null;
    }

    @Override
    public void registerObserver(DroidObserver droidObserver) {

    }

    @Override
    public void removeObserver(DroidObserver droidObserver) {

    }

    @Override
    public void notifyBatteryStatus(float batteryStatus) {

    }
}
