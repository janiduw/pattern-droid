package janiduw.com.patterndroid.droid;

import janiduw.com.patterndroid.observer.DroidObserver;

/**
 * Purpose of this interface is to list behaviours of Droids
 * <p/>
 * Created by janidu on 15/5/15.
 */
public interface IDroid {

    String dance();

    void registerObserver(DroidObserver droidObserver);

    void removeObserver(DroidObserver droidObserver);

    void notifyBatteryStatus(float batteryStatus);
}
