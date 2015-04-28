package janiduw.com.patterndroid;

import janiduw.com.patterndroid.strategy.DanceBehavior;

/**
 * Droid made with different design patterns
 * Created by janidu on 27/4/15.
 */
public class Droid {

    private String name;
    private DanceBehavior danceBehavior;

    public String dance() {
        return danceBehavior.dance();
    }

    public DanceBehavior getDanceBehavior() {
        return danceBehavior;
    }

    public void setDanceBehavior(DanceBehavior danceBehavior) {
        this.danceBehavior = danceBehavior;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
