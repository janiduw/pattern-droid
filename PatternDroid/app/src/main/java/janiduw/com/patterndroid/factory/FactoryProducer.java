package janiduw.com.patterndroid.factory;

/**
 * Factory producer is responsible for instantiating different factories
 * <p/>
 * Created by Janidu on 8/10/15.
 */
public class FactoryProducer {

    public static final String DROID_FACTORY = "DROID";
    public static final String WARRIOR_FACTORY = "WARRIOR";

    public static AbstractFactory getFactory(String factoryType) {

        if (factoryType.equalsIgnoreCase(DROID_FACTORY)) {
            return new DroidFactory();

        } else if (factoryType.equalsIgnoreCase(WARRIOR_FACTORY)) {
            return new WarriorFactory();
        }

        return null;
    }
}
