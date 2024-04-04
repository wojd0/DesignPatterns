package creational.builder;

public class Pen extends WritingAppliance {
    @Override
    public String printDescription() {
        String basicInfo = String.format("Here is your new %s pen made out of %s.", this.color, this.material);
        if (this.clickable) basicInfo += " You can click it open and close.";
        if (this.clippable) basicInfo += " It can be clipped to your shirt.";
        return basicInfo;
    }
}
