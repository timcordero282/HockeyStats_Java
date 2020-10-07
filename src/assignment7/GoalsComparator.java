package assignment7;

import java.util.Comparator;

/**
 *
 * @author corderot1
 */
public class GoalsComparator implements Comparator<HockeyPlayer> {

    @Override
    public int compare(HockeyPlayer h1, HockeyPlayer h2) {
        Integer goals1 = h1.getGoals();
        Integer goals2 = h2.getGoals();

        return goals1.compareTo(goals2);
    }
}
