package assignment7;

import java.util.Arrays;

/**
 *
 * @author Tim Cordero Assignment 7
 */
public class Assignment7 {

    public static void main(String[] args) {

        HockeyPlayer[] players = new HockeyPlayer[5];

        players[0] = new HockeyPlayer("Tim", 20, 30, 50);
        players[1] = new HockeyPlayer("Joe", 45, 10, 55);
        players[2] = new HockeyPlayer("Pat", 10, 40, 50);
        players[3] = new HockeyPlayer("John", 30, 30, 60);
        players[4] = new HockeyPlayer("Bill", 40, 45, 85);

        // output players before sort
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i].getName());
        }

        Arrays.sort(players, new GoalsComparator());

        // After sorting by goals
        System.out.println("");
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i].getName() + ", " + players[i].getGoals());
        }

        Arrays.sort(players, new PointsComparator());

        // After sorting by points
        System.out.println("");
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i].getName() + ", " + players[i].getPoints());
        }

    }

}
