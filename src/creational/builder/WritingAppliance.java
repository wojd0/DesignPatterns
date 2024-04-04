package creational.builder;

public abstract class WritingAppliance {
    String color;
    Material material;
    boolean clickable;
    boolean clippable;
    abstract String printDescription();
}
