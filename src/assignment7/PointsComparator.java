package assignment7;

import java.util.Comparator;

public class PointsComparator implements Comparator<HockeyPlayer> {

    @Override
    public int compare(HockeyPlayer h1, HockeyPlayer h2) {
        Integer points1 = h1.getPoints();
        Integer points2 = h2.getPoints();

        return points1.compareTo(points2);
    }
}
