package janiduw.com.patterndroid.decorator;

/**
 * Purpose of this class is to implement Warrior interface
 * <p/>
 * Decorators will allow you to add or modify a behaviour of a class dynamically
 * Without affecting the behaviour of other objects from the same class
 * <p/>
 * Created by Janidu on 8/9/15.
 */
public class WarriorDecorator implements Warrior {

    private Warrior warrior;

    public WarriorDecorator(Warrior warrior) {
        this.warrior = warrior;
    }

    @Override
    public String fight() {
        return "I'm a Warrior with " + warrior.fight();
    }
}
