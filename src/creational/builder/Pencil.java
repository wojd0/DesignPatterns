package creational.builder;

public class Pencil extends WritingAppliance {
    @Override
    String printDescription() {
        String basicInfo = String.format("Here is your new pencil made out of %s. It writes in %s color!", color, material);
        if (clickable) basicInfo += " It's mechanical! You can click to get more graphite.";
        if (clippable) basicInfo += " It can be clipped to your collar.";
        return basicInfo;
    }
}
