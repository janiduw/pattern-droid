package janiduw.com.patterndroid.factory;

import org.junit.Before;
import org.junit.Test;

import janiduw.com.patterndroid.decorator.KarateWarrior;
import janiduw.com.patterndroid.decorator.SamuraiWarrior;
import janiduw.com.patterndroid.droid.AndroDroid;
import janiduw.com.patterndroid.droid.Droid;

import static org.junit.Assert.assertTrue;

/**
 * Tests related to Factory pattern
 * <p/>
 * Created by Janidu on 8/9/15.
 */
public class WarriorFactoryTest {

    private AbstractFactory droidFactory;

    @Before
    public void setup() {
        droidFactory = new WarriorFactory();
    }

    @Test
    public void testCreateKarateWarrior() {
        assertTrue(droidFactory.createWarrior(WarriorType.KARATE) instanceof KarateWarrior);
    }

    @Test
    public void testCreateSamuraiWarrior() {
        assertTrue(droidFactory.createWarrior(WarriorType.SAMURAI) instanceof SamuraiWarrior);
    }
}
