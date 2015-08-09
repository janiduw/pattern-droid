package janiduw.com.patterndroid.decorator;

/**
 * Class that defines the Karate Warrior abilities
 * "Wax On, Wax Off - Karate Kid (1984)"
 * Created by Janidu on 8/9/15.
 */
public class KarateWarrior implements Warrior {
    @Override
    public String fight() {
        return "Karate Chop!";
    }
}
