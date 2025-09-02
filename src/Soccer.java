// Soccer class
//
public class Soccer {
    private String nameOfTeam;
    private int playersPerTeam;
    private int numberOfGoals;

    // Soccer Constructor
    public Soccer(String nameOfTeam, int playersPerTeam, int numberOfGoals){
        this.nameOfTeam = nameOfTeam;
        this.playersPerTeam = playersPerTeam;
        this.numberOfGoals = numberOfGoals;
    }

    // Overload
    public Soccer() {
        this(null, 0, 0);
    }

    // Name Of Team (Get/Set)
    public String getNameOfTeam() {
        return nameOfTeam;
    }

    public void setNameOfTeam(String nameOfTeam) {
        this.nameOfTeam = nameOfTeam;
    }

    // Players Per Team (Get/Set)
    public int getPlayersPerTeam() {
        return playersPerTeam;
    }

    public void setPlayersPerTeam(int playersPerTeam) {
        this.playersPerTeam = playersPerTeam;
    }

    // Number of Goals (Get/Set)
    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }

    // Update Number Of Goals (Method)
    public void scoreGoal() {
        numberOfGoals++;
        System.out.println(nameOfTeam + " has " + numberOfGoals + " goals");
    }

    // Print Final Results
    public void printResults() {
        System.out.println(nameOfTeam + ", " + playersPerTeam + ", has scored " + numberOfGoals + " goals!");
    }
}

