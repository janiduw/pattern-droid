package janiduw.com.patterndroid.decorator;

import org.junit.Before;
import org.junit.Test;

import janiduw.com.patterndroid.Droid;
import janiduw.com.patterndroid.IDroid;

import static org.junit.Assert.assertEquals;

/**
 * Tests related to the decorator pattern
 * <p/>
 * Created by Janidu on 8/9/15.
 */
public class DroidDecoratorTest {

    private IDroid droid;

    @Before
    public void setUp() throws Exception {
        droid = new Droid();
    }

    @Test
    public void testKarateWarriorDecorator() {
        Warrior karateWarrior = new KarateWarrior();
        Warrior warriorDecorator = new WarriorDecorator(karateWarrior);
        assertEquals("I'm a Warrior with Karate Chop!", warriorDecorator.fight());
    }

    @Test
    public void testSamuraiWarriorDecorator() {
        Warrior karateWarrior = new SamuraiWarrior();
        Warrior warriorDecorator = new WarriorDecorator(karateWarrior);
        assertEquals("I'm a Warrior with Sword Chop!", warriorDecorator.fight());
    }
}
