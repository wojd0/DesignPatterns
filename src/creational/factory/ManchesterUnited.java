package creational.factory;

public class ManchesterUnited extends Team {
    @Override
    public Coach contractCoach() {
        return new ErikTenhaag();
    }
}
