public class SportsApp {
    public static void main(String[] args) {
        Soccer soccerTeam = new Soccer("Bayern Munich", 11, 0);
        Basketball basketballTeam = new Basketball("Orlando Magic", 15, 0);

        // Print Results
        soccerTeam.printResults();
        basketballTeam.printResults();

        // Modify Results
        soccerTeam.setNumberOfGoals(1);
        basketballTeam.setTotalPoints(3);

        // Print Updated Results
        soccerTeam.printResults();
        basketballTeam.printResults();
    }
}

