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
public class FactoryProducerTest {

    private FactoryProducer factoryProducer;

    @Before
    public void setup() {
        factoryProducer = new FactoryProducer();
    }

    @Test
    public void testCreateDroidFactory() {
        assertTrue(factoryProducer.getFactory(FactoryProducer.DROID_FACTORY) instanceof DroidFactory);
    }

    @Test
    public void testCreateWarriorFactory() {
        assertTrue(factoryProducer.getFactory(FactoryProducer.WARRIOR_FACTORY) instanceof WarriorFactory);
    }
}
