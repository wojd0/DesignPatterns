package creational.factory;

public abstract class Team {
    String[] playerNames;
    String coachName;

    public abstract Coach contractCoach();
}
