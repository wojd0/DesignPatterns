package creational.factory;

public class Liverpool extends Team {
    @Override
    public Coach contractCoach() {
        return new JurgenKlopp();
    }
}
