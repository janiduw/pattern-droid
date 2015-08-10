package janiduw.com.patterndroid.factory;

import janiduw.com.patterndroid.decorator.Warrior;
import janiduw.com.patterndroid.droid.IDroid;

/**
 * Purpose of this class is to define available factory methods
 * "Provide an interface for creating families of related or dependent
 * objects without specifying their concrete classes."
 * Created by Janidu on 8/10/15.
 */
public abstract class AbstractFactory {

    abstract IDroid createDroid(DroidModel droidModel);

    abstract Warrior createWarrior(WarriorType warriorType);
}
