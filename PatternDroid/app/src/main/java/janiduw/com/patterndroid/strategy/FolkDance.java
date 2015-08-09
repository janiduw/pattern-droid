package janiduw.com.patterndroid.strategy;

/**
 * Purpose of this class is to do the Folk Dance
 * "Don't put your heel down; don't put your heel down! - Dirty Dancing (1987)"
 * Created by janidu on 27/4/15.
 */
public class FolkDance implements DanceBehavior {

    @Override
    public String dance() {
        return "I'm dancing folk";
    }
}
