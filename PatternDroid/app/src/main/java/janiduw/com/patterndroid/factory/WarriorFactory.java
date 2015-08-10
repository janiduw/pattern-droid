package janiduw.com.patterndroid.factory;

import janiduw.com.patterndroid.decorator.KarateWarrior;
import janiduw.com.patterndroid.decorator.SamuraiWarrior;
import janiduw.com.patterndroid.decorator.Warrior;
import janiduw.com.patterndroid.droid.AndroDroid;
import janiduw.com.patterndroid.droid.Droid;
import janiduw.com.patterndroid.droid.IDroid;

/**
 * Factory that creates droids
 * "What's wrong with “new”? Technically there's nothing wrong with new, after all,
 * it's a fundamental part of Java. The real culprit is our old friend CHANGE - Head First Design Patterns"
 * Created by Janidu on 8/9/15.
 */
public class WarriorFactory extends AbstractFactory {

    /**
     * Creates droids
     *
     * @param droidModel
     * @return
     */
    public IDroid createDroid(DroidModel droidModel) {
        IDroid droid = null;
        switch (droidModel) {
            case R2_D2:
                droid = new Droid();
                break;
            case ANDROID:
                droid = new AndroDroid();
                break;
            default:
                break;
        }
        return droid;
    }

    @Override
    Warrior createWarrior(WarriorType warriorType) {
        Warrior warrior = null;
        switch (warriorType) {
            case KARATE:
                warrior = new KarateWarrior();
                break;
            case SAMURAI:
                warrior = new SamuraiWarrior();
                break;
            default:
                break;
        }
        return warrior;
    }
}

