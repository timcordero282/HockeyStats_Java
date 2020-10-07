package assignment7;

public class HockeyPlayer {

    /**
     * @return the goals
     */
    public int getGoals() {
        return goals;
    }

    /**
     * @param goals the goals to set
     */
    public void setGoals(int goals) {
        this.goals = goals;
    }

    /**
     * @return the assists
     */
    public int getAssists() {
        return assists;
    }

    /**
     * @param assists the assists to set
     */
    public void setAssists(int assists) {
        this.assists = assists;
    }

    /**
     * @return the points
     */
    public int getPoints() {
        return points;
    }

    /**
     * @param points the points to set
     */
    public void setPoints(int points) {
        this.points = points;
    }
    private String name;
    private int goals;
    private int assists;
    private int points;

    public HockeyPlayer(String name, int goals, int assists, int points) {
        this.goals = goals;
        this.assists = assists;
        this.points = points;
        this.name = name;

    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
