public class Basketball {
    private String teamCity;
    private int playerCount;
    private int totalPoints;

    // Constructor
    public Basketball(String teamCity, int playerCount, int totalPoints) {
        this.teamCity = teamCity;
        this.playerCount = playerCount;
        this.totalPoints = totalPoints;
    }

    // Overload
    public Basketball() {
        this(null, 0, 0);
    }

    // Team City (Get/Set)
    public String getTeamCity() {
        return teamCity;
    }

    public void setTeamCity(String teamCity) {
        this.teamCity = teamCity;
    }

    // Player Count (Get/Set)
    public int getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }

    // Total Point (Get/Set)
    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    // 3 Point shot (Method)
    public void addThreePointer() {
        totalPoints += 3;
        System.out.println(teamCity + " just scored 3 points!");
    }

    // Print Final Results
    public void printResults() {
        System.out.println(teamCity + " has " + playerCount + " players and has a total of " + totalPoints + " points!");
    }
}
