package janiduw.com.patterndroid.strategy;

/**
 * Purpose of this class is to do the Folk Dance
 *
 * Created by janidu on 27/4/15.
 */
public class FolkDance implements DanceBehavior {

    @Override
    public String dance() {
        return "I'm dancing folk";
    }
}
