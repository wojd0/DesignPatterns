package creational.factory;

public class Demo {
    public String peekStadium(String stadiumName) {
        Team peekingTeam = null;
        if (stadiumName.equalsIgnoreCase("Old Trafford")) {
            peekingTeam = new ManchesterUnited();
        } else if (stadiumName.equalsIgnoreCase("Anfield")) {
            peekingTeam = new Liverpool();
        }

        assert peekingTeam != null;
        Coach peekingCoach = peekingTeam.contractCoach();
        return peekingCoach.train();
    }
}
