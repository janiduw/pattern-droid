package janiduw.com.patterndroid.factory;

import janiduw.com.patterndroid.droid.AndroDroid;
import janiduw.com.patterndroid.droid.Droid;
import janiduw.com.patterndroid.droid.IDroid;

/**
 * Factory that creates droids
 * "What's wrong with “new”? Technically there's nothing wrong with new, after all,
 * it's a fundamental part of Java. The real culprit is our old friend CHANGE - Head First Design Patterns"
 * Created by Janidu on 8/9/15.
 */
public class DroidFactory {

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
}

