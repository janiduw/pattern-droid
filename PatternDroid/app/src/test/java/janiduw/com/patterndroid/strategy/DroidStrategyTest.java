package janiduw.com.patterndroid.strategy;

import org.junit.Before;
import org.junit.Test;

import janiduw.com.patterndroid.droid.Droid;

import static org.junit.Assert.assertEquals;

/**
 * Strategy pattern
 * <p/>
 * What: Defines a set of encapsulated algorithms that can be swapped
 * to carry out a specific behaviour
 * <p/>
 * Where: The Strategy pattern is to be used where you want to choose
 * the algorithm to use at runtime.
 */
public class DroidStrategyTest {

    private Droid droid;

    @Before
    public void setUp() throws Exception {
        droid = new Droid();
        droid.setName("R2-D2");
    }

    @Test
    public void testSetDanceBehaviorStrategy() throws Exception {
        droid.setDanceBehavior(new FolkDance());
        assertEquals("I'm dancing folk", droid.dance());

        droid.setDanceBehavior(new LatinDance());
        assertEquals("I'm dancing latin", droid.dance());
    }

    @Test
    public void testGetName() throws Exception {
        assertEquals("R2-D2", droid.getName());
    }

}