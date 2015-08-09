package janiduw.com.patterndroid.decorator;

/**
 * Class that defines the Samurai Behaviour
 * "I think a man does what he can, until his destiny is revealed - Last Samurai (2003)"
 * Created by Janidu on 8/9/15.
 */
public class SamuraiWarrior implements Warrior {
    @Override
    public String fight() {
        return "Sword Chop!";
    }
}
