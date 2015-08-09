package janiduw.com.patterndroid.observer;

import org.junit.Before;
import org.junit.Test;

import janiduw.com.patterndroid.droid.Droid;
import janiduw.com.patterndroid.droid.IDroid;

import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;

/**
 * Contains tests for Droid Observer
 * Created by janidu on 15/5/15.
 */
public class DroidObserverTest {

    private static final float BATTERY_LEVEL = 10.5f;

    private IDroid droid;

    @Before
    public void setUp() throws Exception {
        droid = new Droid();
    }

    @Test
    public void testAddBatteryStatusObserver() throws Exception {

        // Create a new observer
        DroidObserver observer = new DroidObserver() {
            @Override
            public void updateBatteryStatus(float batteryLevel) {
                assertTrue("Should be the same level", BATTERY_LEVEL == batteryLevel);
            }
        };

        // Register the observer
        droid.registerObserver(observer);
        droid.notifyBatteryStatus(BATTERY_LEVEL);
    }

    @Test
    public void testRemoveBatteryStatusObserver() throws Exception {

        DroidObserver observer = new DroidObserver() {
            @Override
            public void updateBatteryStatus(float batteryLevel) {
                fail("Should not be called when the observer is removed");
            }
        };

        // Register the observer
        droid.registerObserver(observer);

        // Remove the observer
        droid.removeObserver(observer);
        droid.notifyBatteryStatus(BATTERY_LEVEL);
    }
}