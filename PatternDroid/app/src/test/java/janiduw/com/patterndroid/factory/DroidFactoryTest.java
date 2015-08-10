package janiduw.com.patterndroid.factory;

import org.junit.Before;
import org.junit.Test;

import janiduw.com.patterndroid.droid.AndroDroid;
import janiduw.com.patterndroid.droid.Droid;

import static org.junit.Assert.assertTrue;

/**
 * Tests related to Factory pattern
 * <p/>
 * Created by Janidu on 8/9/15.
 */
public class DroidFactoryTest {

    private AbstractFactory abstractFactory;

    @Before
    public void setup() {
        abstractFactory = new DroidFactory();
    }

    @Test
    public void testCreateAndroDroid() {
        assertTrue(abstractFactory.createDroid(DroidModel.ANDROID) instanceof AndroDroid);
    }

    @Test
    public void testCreateR2D2() {
        assertTrue(abstractFactory.createDroid(DroidModel.R2_D2) instanceof Droid);
    }
}
